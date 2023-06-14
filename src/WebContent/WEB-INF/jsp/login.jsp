<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SubsKeeperログイン</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
</head>
<body>
<!-- リボンメニュー -->
<header>
	<h1 class="logo"><img src="/mecar/img/ロゴ.png" alt="logo"></h1>

</header>
<main>
	<h1>ログインページ</h1>

	<hr>
	<form method="POST" action="/mecar/LoginServlet" id="login_form">
		ユーザーID<input type="text" name="USER_ID" class = "Users"><br>
		パスワード<input type="password" name="USER_PW" id = "input_pass" class= "Users"><br>
		<!--  <button id ="passview">表示</button> -->
		<input type="submit" name="LOGIN" value="ログイン">
		<input type="reset" name="reset" value="リセット"><br>
		<!--  <span id="error_message" class = error></span> -->
		<br>
		<p><a href="/mecar/ForgetPasswordServlet">パスワードお忘れの方はこちら</a></p>
		<p><a href="/mecar/RegistUserServlet">新規会員登録はこちら</a></p>
	</form>
</main>
	<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>