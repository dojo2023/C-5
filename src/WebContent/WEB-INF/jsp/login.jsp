<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ログイン | SubsKeeper</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
	<link rel="stylesheet" href="/mecar/css/login.css">
    <link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
    <!-- ↑目のアイコン使うためのやつ -->

	<!-- Javascriptの挿入 -->
<!--	<script src="/mecar/js/login.js"></script>		-->

</head>

<body>
<!-- リボンメニュー -->
<header>
	<h1 class="logo"><img src="/mecar/img/ロゴ.png" alt="logo"></h1>

</header>
<main>
	<h1>ログイン</h1>

	<hr>
	<form method="POST" action="/mecar/LoginServlet" id="login_form">
		<label class="id">ユーザーID</label> <br>
		<input type="text" name="USER_ID" class = "Users"><br>
		<label class="pw">パスワード</label> <br>
		<div id="inputBox">
			<input type="password" name="USER_PW" id="textPassword">
			<span id="buttonEye" class="fa fa-eye" onclick="pushHideButton()"></span>
		</div><br>
	<!-- 	<button id ="passview">表示</button><br>	-->
		<input type="submit" name="LOGIN" class="button" value="ログイン">
		<input type="reset" name="RESET" class="button" value="リセット"><br>
		<p id="output"></p>
	</form>
		<!--  <span id="error_message" class = error></span> -->
		<br><br>
		<div class="input_wrap">
		<p><a class="regist" href="/mecar/RegistUserServlet">新規会員登録</a></p><br>
		<p><a class="newPassword" href="/mecar/ForgetPasswordServlet">パスワードをお忘れの方はこちら</a></p>
	</div>

</main>

	<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

<script src="/mecar/js/login.js"></script>


</body>
</html>
