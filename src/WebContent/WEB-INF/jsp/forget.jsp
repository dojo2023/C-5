<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SubsKeeperパスワード再登録</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
	<link rel="stylesheet" href="/mecar/css/regist_forget.css">
	<!-- Javascriptの挿入 -->
	<script src="/mecar/js/forget.js"></script>
</head>
<body>
<main>
<!-- リボンメニュー -->
	<header>
		<h1 class="logo"><a href="/mecar/LoginServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
	</header>
	<h1>パスワード再登録</h1>
	<hr>
	<form method="POST" action="/mecar/ForgetPasswordServlet" id="newPwSet">
		<label>ユーザーID<br>
		<input type="text" name="ID" id="pid"><br></label>
		<label>メールアドレス<br>
		<input type="text" name="MAIL" id ="pmail"><br></label>
		<label>新しいパスワード<br>
		<input type="password" name="PW" id = "newPass"></label>
		<button id ="passview">表示</button><br>
		<input type="submit" name="DEFINITE" value="確定" onclick="MoveCheck();">
		<input type="reset" name="reset" value="リセット"><br>
		<p id="output"></p>

	</form>
</main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
</body>
</html>