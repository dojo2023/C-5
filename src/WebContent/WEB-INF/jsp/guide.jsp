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

<section class="accordion">
		<!-- ログインページ -->
		<input id="block-01" type="checkbox" class="toggle">
		<label class="Label" for="block-01">ログインページ</label>
		<div class="content">
			<input id="block-02" type="checkbox" class="toggle">
			<label class="Label" for="block-02">ログイン</label>
			<div class="content">
				<p>ログインできます。</p>
			</div>
			<input id="block-03" type="checkbox" class="toggle">
			<label class="Label" for="block-03">リセット</label>
			<div class="content">
				<p>リセットできます。</p>
			</div>
			<input id="block-04" type="checkbox" class="toggle">
			<label class="Label" for="block-04">新規登録</label>
			<div class="content">
				<p>新規登録フォームに遷移します。</p>
			</div>
			<input id="block-05" type="checkbox" class="toggle">
			<label class="Label" for="block-05">パスワードを忘れた方</label>
			<div class="content">
				<p>パスワード変更ができます。</p>
			</div>
		</div>

		<!-- メニューページ -->
		<input id="block-06" type="checkbox" class="toggle">
		<label class="Label" for="block-06">メニューページ</label>
		<div class="content">
			<input id="block-07" type="checkbox" class="toggle">
			<label class="Label" for="block-07">ログイン</label>
			<div class="content">
				<p>ログインできます。</p>
			</div>
			<input id="block-08" type="checkbox" class="toggle">
			<label class="Label" for="block-08">リセット</label>
			<div class="content">
				<p>リセットできます。</p>
			</div>
			<input id="block-09" type="checkbox" class="toggle">
			<label class="Label" for="block-09">新規登録</label>
			<div class="content">
				<p>新規登録フォームに遷移します。</p>
			</div>
			<input id="block-10" type="checkbox" class="toggle">
			<label class="Label" for="block-10">パスワードを忘れた方</label>
			<div class="content">
				<p>パスワード変更ができます。</p>
			</div>
		</div>

</section>

		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>
<!--
<!--  				<div class="circle"></div>
					<div class="base"></div>-->

<!-- ログインページを選択したとき -->
			<label for="switch" class="switch_label">
				<div>
					<input type="checkbox" class="switch" id="switch">
				</div>
				<span class="title">ログインページ</span>
			</label>

<!--
			<label>
				<div>
					<input type="checkbox" class="switch">
				</div>
				<span class="title">ログインページ詳細1</span>
			</label>
-->

<!-- ログインを選択したとき -->
			<label for="switch1" class="switch_label1">
				<div>
					<input type="checkbox" class="switch" id="switch1">
				</div>
				<span class="login" id="login"></span>
			</label>
			<span class="login" id="login_des"></span>



			<span class="login" id="reset"></span>
			<span class="login" id="new_regist"></span>
			<span class="login" id="forget_pass"></span>
-->