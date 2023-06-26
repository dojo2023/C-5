<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>パスワード再登録 | SubsKeeper</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
	<link rel="stylesheet" href="/mecar/css/regist_forget.css">
	<link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
    <!-- ↑目のアイコン使うためのやつ -->
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
		<input type="text" name="ID" id="pid" class="id"><br></label>
		<label>メールアドレス<br>
		<input type="text" name="MAIL" id ="pmail" class="mail"><br></label>
		<label>新しいパスワード <span id="buttonEye" class="fa fa-eye" onclick="pushHideButton()"></span><br>
		<input type="password" name="PW" id = "newPass" class="pw"></label><br>
		<br>
	<!-- 	<button id ="passview">表示</button><br>	-->
		<input type="submit"class="button" name="DEFINITE" value="　　  登録  　　" onclick="MoveCheck();">
		<input type="reset" class="button"name="reset" value="　  リセット  　"><br>
		<p id="output"></p>

	</form>
</main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
</body>
</html>