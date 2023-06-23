<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SubsKeeper新規登録</title>
	<link rel="stylesheet" href="/mecar/css/common.css">
	<link rel="stylesheet" href="/mecar/css/regist_forget.css">
	<!-- Javascriptの挿入 -->
	<script src="/mecar/js/regist.js"></script>
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
			<input type="text" name="ID" id="input_id" class = "idpw"><br></label>
			<label>パスワード<br>
			<input type="password" name="PW" id = "input_pass" class= "idpw"></label>
			<button id ="passview">表示</button><br>
			<label>メールアドレス<br>
			<input type="text" name="MAIL"><br></label>
			<input type="submit" name="REGIST" id="regist" value="確定" onclick="MoveCheck();">
			<input type="reset" name="reset" value="リセット"><br>
			<p id="output"></p>

		</form>
	</main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
</body>
</html>