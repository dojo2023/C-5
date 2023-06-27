<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/menu.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
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
	<h1>検索結果</h1>

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
			<c:forEach var="e" items="${cardList}">
				<!-- 商品名と残量メーターをクリックするとモーダルウィンドウが表示される -->
				<form method="POST" action="/mecar/DecreaseSwitchServlet">
					<nobr>${e.item_name}</nobr>
					<meter min="0" max="100" value="${e.item_meter}" high="50" low="20"
					optimum="80" class="contents_show"></meter>
					<!-- 隠して商品IDを渡す -->
					<input type="hidden" name="item_id" value="${e.item_id}" class="list_id">
					<!-- ポップアップに表示したい内容を隠して送る -->
					<input type="hidden" name="item_name" value="${e.item_name}" class="list_name">
					<input type="hidden" name="item_price" value="${e.item_price}" class="list_price">
					<c:choose>
						<c:when test="${e.frequency_purchase == 1}">
							<input type="hidden" name="item_frequency" value="１週間" class="list_frequency">
						</c:when>
						<c:when test="${e.frequency_purchase == 2}">
							<input type="hidden" name="item_frequency" value="２週間" class="list_frequency">
						</c:when>
						<c:when test="${e.frequency_purchase == 3}">
							<input type="hidden" name="item_frequency" value="１か月" class="list_frequency">
						</c:when>
						<c:when test="${e.frequency_purchase == 4}">
							<input type="hidden" name="item_frequency" value="２か月" class="list_frequency">
						</c:when>
						<c:when test="${e.frequency_purchase == 5}">
							<input type="hidden" name="item_frequency" value="３か月" class="list_frequency">
						</c:when>
					</c:choose>
					<c:choose>
						<c:when test="${e.item_category == 1}">
							<input type="hidden" name="item_category" value="食料品" class="list_category">
						</c:when>
						<c:when test="${e.item_category == 2}">
							<input type="hidden" name="item_category" value="日用品" class="list_category">
						</c:when>
						<c:when test="${e.item_category == 3}">
							<input type="hidden" name="item_category" value="ケア用品" class="list_category">
						</c:when>
						<c:when test="${e.item_category == 4}">
							<input type="hidden" name="item_category" value="その他" class="list_category">
						</c:when>
					</c:choose>
					<input type="hidden" name="item_meter" value="${e.item_meter}" class="list_meter">
					<input type="hidden" name="item_url" value="${e.item_url}" class="list_url">
					<!-- 減量停止・再開スイッチ -->
					<c:choose>
						<c:when test="${e.item_switch == 0}">
							<input type="submit" name="item_switch" value="OFF">
						</c:when>
						<c:when test="${e.item_switch == 1}">
							<input type="submit" name="item_switch" value="ON">
						</c:when>
					</c:choose>
				</form>
				<br>
			</c:forEach>
		</div>
	</div>

	<!-- 商品登録ポップアップを開くボタン -->
	<img src="/mecar/img/プラスのアイコン素材ピンク.png" alt="商品登録ポップアップを開くボタン" class="regist_show">


	<!-- ここからポップアップ -->

	<!-- 商品内容確認・削除ポップアップ -->
	<div class="contents_wrapper">
		<div class="contents_modal">
			<!-- 商品更新のポップアップを開くボタン -->
			<img src="/mecar/img/太いリロードアイコンブルー.png" alt="商品更新ポップアップを開くボタン" class="update_show">
			<!-- 更新のポップアップに渡したい情報 -->
			<input type="hidden" value="" class="content_id">
			<input type="hidden" value="" class="content_name">
			<input type="hidden" value="" class="content_price">
			<input type="hidden" value="" class="content_frequency">
			<input type="hidden" value="" class="content_category">
			<input type="hidden" value="" class="content_meter">
			<input type="hidden" value="" class="content_url">
			<!-- 商品削除のボタン -->
			<form method="POST" action="/mecar/DeleteItemServlet">
				<input type="hidden" name="item_id" value="" class="item_id">
				<input type="image" src="/mecar/img/スタンダードなゴミ箱アイコンブルー.png" name="deleteItem">
			</form>
			<!-- プルダウンを閉じるボタン -->
			<div class="close_modal">x</div>
			<div class="contents">
				<div class="content">
					<p>商品名</p>
					<p class="item_name"></p>
				</div>
				<div class="content">
					<p>値段</p>
					<nobr></nobr>円
				</div>
				<div class="content">
					<p>購入頻度</p>
					<p class="item_frequency"></p>
				</div>
				<div class="content">
					<p>カテゴリ</p>
					<p class="item_category"></p>
				</div>
				<div class="content">
					<p>残量メーター</p>
					<meter min="0" max="100" value="" high="50" low="20" optimum="80"></meter>
				</div>
				<div class="content">
					<p><a href="" target="_blank" class="item_url1">リンク先購入</a></p>
				</div>
				<div class="content">
					<p><a href="" target="_blank" class="item_url2">リンク先閲覧</a></p>
				</div>
			</div>
		</div>
	</div>

	<!-- 商品更新ポップアップ -->
	<div class="update_wrapper">
		<div class="update_modal">
			<!-- プルダウンを閉じるボタン -->
			<div class="close_modal">x</div>
			<form method="POST" action="/mecar/UpdateItemServlet">
				<div class="updates">
					<input type="hidden" name="item_id" value="" class="item_id">
					<div class="update">
						<p>商品名</p>
						<input type="text" name="name" value="" class="item_name">
					</div>
					<div class="update">
						<p>値段</p>
						<input type="text" name="price" value="" class="item_price">
					</div>
					<div class="update">
						<p>購入頻度</p>
						<select name="frequency" size="1">
							<option value="" selected hidden>選択してください</option>
							<option value="1">１週間</option>
							<option value="2">２週間</option>
							<option value="3">１か月</option>
							<option value="4">２か月</option>
							<option value="5">３か月</option>
						</select>
					</div>
					<div class="update">
						<p>カテゴリ</p>
						<select name="category" size="1">
							<option value="" selected hidden>選択してください</option>
							<option value="1">食料品</option>
							<option value="2">日用品</option>
							<option value="3">ケア用品</option>
							<option value="4">その他</option>
						</select>
					</div>
					<div class="update">
						<p>残量メーター</p>
						<input type="range" name="meter" value="" class="meter_input1">
						<p><output class="meter_output1"></output>%</p>
					</div>
					<div class="update">
						<p>リンク</p>
						<input type="url" name="url" value="" class="item_url">
					</div>
					<input type="submit" name="submit" value="更新">
				</div>
			</form>
		</div>
	</div>

	<!-- 商品登録ポップアップ -->
	<div class="regist_wrapper">
		<div class="regist_modal">
			<!-- プルダウンを閉じるボタン -->
			<div class="close_modal">x</div>
			<form method="POST" action="/mecar/RegistItemServlet">
				<div class="regists">
					<div class="regist">
						<p>商品名</p>
						<input type="text" name="name" placeholder="商品名">
					</div>
					<div class="regist">
						<p>値段</p>
						<input type="text" name="price" placeholder="値段">
					</div>
					<div class="regist">
						<p>購入頻度</p>
						<select name="frequency" size="1">
							<option value="" selected hidden>選択してください</option>
							<option value="1">１週間</option>
							<option value="2">２週間</option>
							<option value="3">１か月</option>
							<option value="4">２か月</option>
							<option value="5">３か月</option>
						</select>
					</div>
					<div class="regist">
						<p>カテゴリ</p>
						<select name="category" size="1">
							<option value="" selected hidden>選択してください</option>
							<option value="1">食料品</option>
							<option value="2">日用品</option>
							<option value="3">ケア用品</option>
							<option value="4">その他</option>
						</select>
					</div>
					<div class="regist">
						<p>残量メーター</p>
						<input type="range" name="meter" class="meter_input2">
						<p><output class="meter_output2"></output>%</p>
					</div>
					<div class="regist">
						<p>リンク</p>
						<input type="url" name="url" placeholder="リンク">
					</div>
					<input type="submit" name="submit" value="登録">
				</div>
			</form>
		</div>
	</div>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

<script src="/mecar/js/menu.js"></script>
</body>
</html>