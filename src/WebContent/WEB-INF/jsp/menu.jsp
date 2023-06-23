<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/menu.css">
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
			<option value=4>4日</option>
			<option value=5>5日</option>
			<option value=6>6日</option>
			<option value=7>7日</option>
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
			<form method="POST" action="/mecar/CategoryServlet">
				<div class="category"><input type="image"
				src="/mecar/img/一覧_白.png" name="submit1" value="一覧"></div>
				<div class="category"><input type="image"
				src="/mecar/img/食料品_白.png" name="submit2" value="食料品"></div>
				<div class="category"><input type="image"
				src="/mecar/img/日用品_白.png" name="submit3" value="日用品"></div>
				<div class="category"><input type="image"
				src="/mecar/img/ケア用品_白.png" name="submit4" value="ケア用品"></div>
				<div class="category"><input type="image"
				src="/mecar/img/その他_白.png" name="submit5" value="その他"></div>
			</form>
		</div>

		<!-- 商品部分 -->
		<div class="items_container">
			<c:forEach var="e" items="${cardList2}">
				<!-- この一行をクリックするとモーダルウィンドウが表示される -->
				<form method="POST" action="/mecar/DecreaseSwitchServlet" class="btn contents-show">
					${e.item_name}
					<meter min="0" max="100" value="${e.item_meter}" high="50" low="20" optimum="80"></meter>
					<!-- 隠して商品IDを渡す -->
					<input type="hidden" name="item_id" value="${e.item_id}">
					<c:choose>
						<c:when test="${e.item_switch == 0}">
							<input type="submit" name="item_switch" value="OFF">
						</c:when>
						<c:when test="${e.item_switch == 1}">
							<input type="submit" name="item_switch" value="ON">
						</c:when>
					</c:choose>
					<!-- ポップアップに表示したい内容を隠して送る -->
					<input type="hidden" name="item_name" value="${e.item_name}">
					<input type="hidden" name="item_price" value="${e.item_price}">
					<input type="hidden" name="item_frequency" value="${e.item_frequency}">
					<input type="hidden" name="item_category" value="${e.item_category}">
					<input type="hidden" name="item_url" value="${e.item_url}">
					<input type="hidden" name="item_id" value="${e.item_id}">
				</form>
				<br>
			</c:forEach>
		</div>
	</div>

	<!-- 商品登録ポップアップを開くボタン -->
	<img src="/mecar/img/プラスのアイコン素材ピンク.png" alt="商品登録ポップアップを開くボタン">

	<!-- ここからポップアップ -->
	<!-- 商品内容確認・削除ポップアップ -->
	<div class="popup-wrapper" id="contents-modal">
		<div class="popup">
			<!-- 商品更新のポップアップを開くボタン -->
			<img src="/mecar/img/太いリロードアイコンブルー.png" alt="商品更新ポップアップを開くボタン">
			<form method="POST" action="/mecar/DeleteItemServlet">
				<input type="hidden" name="item_id" value="">
				<input type="image" src="/mecar/img/スタンダードなゴミ箱アイコンブルー.png"
				name="deleteItem" value
			</form>
			<div id="close-popup">x</div>
			<div class="contents">
				<div class="item_name"></div>
				<div class="item_price"></div>
				<div class="item_frequency"></div>
				<div class="item_category"></div>
				<div class="item_meter"></div>
				<div class="item_url"></div>
				<div class="item_url"></div>
			</div>
		</div>
	</div>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>