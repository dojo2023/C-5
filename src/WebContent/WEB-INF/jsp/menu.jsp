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
		<select name="frequency" size="1">
			<option value=0 selected>自動減量</option>
			<option value=1>1週間</option>
			<option value=2>2週間</option>
			<option value=3>1か月</option>
			<option value=4>2か月</option>
			<option value=5>3か月</option>
		</select>
		<input type="submit" name="submit" value="一斉減量">
	</form>

	<!-- キーワード検索 -->
	<form method="POST" action="/mecar/SearchItemServlet">
		<input type="search" name="item_name">
		<input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
	</form>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>