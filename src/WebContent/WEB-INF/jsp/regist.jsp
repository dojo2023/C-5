<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>新規登録 | SubsKeeper</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
	<link rel="stylesheet" href="/mecar/css/regist_forget.css">
	<link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
    <!-- ↑目のアイコン使うためのやつ -->
</head>
<!-- リボンメニュー -->
<header>
	<h1 class="logo"><a href="/mecar/LoginServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>

</header>
<body>
	<main>
		<h1>新規登録</h1>
		<hr>
		<form method="POST" action="/mecar/RegistUserServlet" id="idregist">
			<label>ユーザーID<br>
			<input type="text" name="ID" id="input_id" class = "id"><br></label>
			<label>パスワード</label> <span id="buttonEye" class="fa fa-eye" onclick="pushHideButton()"></span><br>
			<input type="password" name="PW" id = "input_pass" class= "pw">
	<!--  		<button id ="passview">表示</button><br>	-->
			<label>メールアドレス<br>
			<input type="text" name="MAIL" class="mail"><br></label>
			<br>
			<input type="submit"class="button" name="REGIST" id="regist" value="　　  登録  　　" onclick="MoveCheck();">
			<input type="reset" class="button"name="reset" value="　  リセット  　"><br>
			<p id="output"></p>
		</form>
	</main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

	<!-- Javascriptの挿入 -->
	<script src="/mecar/js/regist.js"></script>
</body>
</html>