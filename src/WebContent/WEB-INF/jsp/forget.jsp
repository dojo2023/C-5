<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>パスワード再登録</h1>
	<hr>
	<form method="POST" action="/mecar/ForgetPasswordServlet" id="newPwSet">
		ユーザーID<input type="text" name="ID"><br>
		メールアドレス<input type="text" name="MAIL"><br>
		新しいパスワード<input type="password" name="PW" id = "newPass"><br>
		<!-- <button id ="passview">表示</button> -->
		<input type="submit" name="DEFINITE" value="確定">
		<input type="reset" name="reset" value="リセット"><br>
		<!-- <span id="error_message" class = error></span> -->
	</form>
</body>
</html>