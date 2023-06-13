<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>ログインページ</h1>

	<hr>
	<form method="POST" action="/mecar/LoginServlet" id="login_form">
		ユーザーID<input type="text" name="ID" class = "idpw"><br>
		パスワード<input type="password" name="PW" id = "input_pass" class= "idpw"><br>
		<!--  <button id ="passview">表示</button> -->
		<input type="submit" name="LOGIN" value="ログイン">
		<input type="reset" name="reset" value="リセット"><br>
		<!--  <span id="error_message" class = error></span> -->
		<br>
		<p><a href="/mecar/ForgetPasswordServlet">パスワードお忘れの方はこちら</a></p>
		<p><a href="/mecar/RegistUserServlet">新規会員登録はこちら</a></p>
	</form>

</body>
</html>