<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ一覧</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/inquiry_list.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
<!-- リボンメニュー -->
<header>
	<h1 class="logo"><a href="/mecar/InquiryListServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
	<nav>
		<ul>
			<li><a href="/mecar/LoginAdminServlet">ログアウト</a></li>
			<li><a href="/mecar/InquiryListServlet">お問い合わせ一覧表</a></li>
			<li><a href="/mecar/UsersListServlet">ユーザー一覧表</a></li>
		</ul>
	</nav>
</header>

<main>
	<h1>お問い合わせ一覧</h1>

	<!-- キーワード検索 -->
	<form id="form" method="POST" action="/mecar/InquiryListServlet" class="keyword_wrapper">
		<input type="search" name="keyWord" placeholder="キーワード検索" class="keyword">
		<input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン" name="search">
	</form>


	<!-- お問い合わせ一覧 -->
	<div id="table">
		<table id="list">
			<tr>
				<th>対応ステータス</th><th>ユーザーID</th><th>メールアドレス</th><th>件名</th><th>日付</th>
			</tr>

			<c:forEach var="e" items="${cardList2}">
				<!-- この一行をクリックするとモーダルウィンドウが表示される -->
				<tr class="inquiries_show">
					<td>
						<c:choose>
							<c:when test="${e.inquiry_status == 0}">未対応</c:when>
							<c:when test="${e.inquiry_status == 1}">対応中</c:when>
							<c:when test="${e.inquiry_status == 2}">対応済</c:when>
						</c:choose>
					</td>
					<td>${e.user_id}</td>
					<td>${e.user_mail}</td>
					<td>${e.inquiry_subject}</td>
					<td>${e.inquiry_date}</td>
				</tr>
				<!-- ポップアップに表示したい内容を隠して送る -->
				<input type="hidden" value="${e.inquiry_status}" class="inquiry_status">
				<input type="hidden" value="${e.user_id}" class="user_id">
				<input type="hidden" value="${e.user_mail}" class="user_mail">
				<input type="hidden" value="${e.inquiry_subject}" class="inquiry_subject">
				<input type="hidden" value="${e.inquiry_date}" class="inquiry_date">
				<input type="hidden" value="${e.inquiry_content}" class="inquiry_content">
				<input type="hidden" value="${e.inquiry_id}" class="inquiry_id">
			</c:forEach>
		</table>
	</div>


	<!-- ここからポップアップ -->
	<!-- お問い合わせ詳細確認ポップアップ -->
	<div class="inquiries_wrapper">
		<div class="inquiries_modal">
			<!-- ポップアップを閉じるボタン -->
			<div class="close_modal">x</div>
			<form method="POST" action="/mecar/InquiryListServlet">
				<div class="inquiries">
					<div class="inquiries_container">
						<div class="inquiry">
							<p class="inquiry_title">ID</p>
							<p class="user_id"></p>
						</div>
						<div class="inquiry">
							<p class="inquiry_title">メールアドレス</p>
							<p class="user_mail"></p>
						</div>
					</div>
					<div class="inquiries_container">
						<div class="inquiry">
							<p class="inquiry_title">対応ステータス</p><br>
							<select name="status" size="1">
								<option value="" selected hidden>選択してください</option>
								<option value="0">未対応</option>
								<option value="1">対応中</option>
								<option value="2">対応済</option>
							</select>
						</div>
						<div class="inquiry">
							<p class="inquiry_title">日付</p>
							<p class="inquiry_date"></p>
						</div>
					</div>
					<div class="inquiry">
						<p class="inquiry_title">件名</p><br>
						<textarea class="inquiry_subject" readonly></textarea>
					</div>
					<div class="inquiry">
						<p class="inquiry_title">お問い合わせ内容</p><br>
						<textarea class="inquiry_content" readonly></textarea>
					</div>
					<input type="hidden" name="inquiry_id" value="" class="inquiry_id">
					<input type="submit" name="submit" value="更新" class="update_btn">
				</div>
			</form>
		</div>
	</div>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

<script src="/mecar/js/inquiry_list.js"></script>
</body>
</html>