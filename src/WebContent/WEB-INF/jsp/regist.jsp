<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>新規登録</h1>
<hr>
<form method="POST" action="/mecar/RegistUserServlet" id="idregist">
	ユーザーID<input type="text" name="ID" class = "idpw"><br>
	パスワード<input type="password" name="PW" id = "input_pass" class= "idpw"><br>
	メールアドレス<input type="text" name="MAIL"><br>
	<!--  <button id ="passview">表示</button> -->
	<input type="submit" name="DEFINITE" value="確定">
	<input type="reset" name="reset" value="リセット"><br>
	<!--  <span id="error_message" class = error></span> -->
	</form>
</body>
</html>