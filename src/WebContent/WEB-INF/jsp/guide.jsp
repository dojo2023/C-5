<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<link rel="stylesheet" href="/mecar/css/guide.css">
		<script src="/mecar/js/guide.js"></script>
	</head>
	<body>
		<header>
			<h1 class="logo"><a href="/mecar/MenuServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
			<nav>
				<ul>
					<li><a href="/mecar/LogoutServlet">ログアウト</a></li>
					<li><a href="/mecar/InquiryServlet">お問い合わせ</a></li>
					<li><a href="/mecar/MypageServlet">マイページ</a></li>
					<li><a href="/mecar/MenuServlet">メニュー</a></li>
				</ul>
			</nav>
		</header>
		<main>
			<h1>ご利用ガイド</h1>


<!--  				<div class="circle"></div>
					<div class="base"></div>-->


			<label for="switch" class="switch_label">
				<div class="switch">
					<input type="checkbox" id="switch">
				</div>
				<span class="title">ログインページ詳細</span>
			</label>

			<label for="switch" class="switch_label">
				<div class="switch">
					<input type="checkbox" class="switch" >
				</div>
				<span class="login" id="login"></span>
			</label>





			<span class="login" id="reset"></span>
			<span class="login" id="new_regist"></span>
			<span class="login" id="forget_pass"></span>




			<br><br>ログインページ<br>
			<select name="login">
				<optgroup label="ログインページ">
					<option value="password">パスワードを忘れた際</option>
					<option value="regist">新規登録</option>
					<option value="login">ログイン</option>
					<option value="reset">リセット</option>
 				</optgroup>
		   </select> <br>
			メニューページ<br>
			<select name="login">
				<optgroup label="ログインページ">
					<option value="password" >パスワードを忘れた際</option>
					<option value="regist">新規登録</option>
					<option value="login">ログイン</option>
					<option value="reset">リセット</option>
 				</optgroup>
		   </select> <br>
			マイページ<br>
			<select name="login">
				<optgroup label="ログインページ">
					<option value="password" >パスワードを忘れた際</option>
					<option value="regist">新規登録</option>
					<option value="login">ログイン</option>
					<option value="reset">リセット</option>
 				</optgroup>
		   </select> <br>
			お問い合わせページ<br>
			<select name="login">
				<optgroup label="ログインページ">
					<option value="password" >パスワードを忘れた際</option>
					<option value="regist">新規登録</option>
					<option value="login">ログイン</option>
					<option value="reset">リセット</option>
 				</optgroup>
		   </select> <br>
			ログアウト<br>
			<select name="login">
				<optgroup label="ログインページ">
					<option value="password" >パスワードを忘れた際</option>
					<option value="regist">新規登録</option>
					<option value="login">ログイン</option>
					<option value="reset">リセット</option>
 				</optgroup>
		   </select>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>