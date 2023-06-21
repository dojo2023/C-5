<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー</title>
<link rel="stylesheet" href="/mecar/css/common.css">
</head>

<body>
<!-- リボンメニュー -->
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
	<h1>メニュー</h1>

	<!-- 一斉減量ボタン -->
	<form method="POST" action="/mecar/DecreaseServlet">
		<select name="pullNumber" size="1">
			<option value=0 selected>自動減量</option>
			<option value=1>1日</option>
			<option value=2>2日</option>
			<option value=3>3日</option>
			<option value=4>1週間</option>
		</select>
		<input type="submit" name="submit" value="一斉減量">
	</form>

	<!-- キーワード検索 -->
	<form method="POST" action="/mecar/SearchItemServlet">
		<input type="search" name="item_name">
		<input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
	</form>

	<!-- 商品一覧 -->
	<div class="list_wrapper">
		<!-- カテゴリ部分 -->
		<div class="categories_container">
			<div class="category"></div>
			<div class="category"></div>
			<div class="category"></div>
			<div class="category"></div>
			<div class="category"></div>
		</div>

		<!-- 商品部分 -->
		<div class="items_container">
			<div class="item">プロテイン<input type="range"></div>
			<div class="item">水<input type="range"></div>
			<div class="item">フェイスマスク<input type="range"></div>
		</div>
	</div>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>