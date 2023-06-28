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
		<input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
	</form>


	<!-- お問い合わせ一覧 -->
	<div id="table">
		<table id="list">
			<tr>
				<th>対応ステータス</th><th>ユーザーID</th><th>メールアドレス</th><th>件名</th><th>日付</th>
			</tr>

			<c:forEach var="e" items="${cardList2}">
				<!-- この一行をクリックするとモーダルウィンドウが表示される -->
				<tr class="inquiries">
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
			</c:forEach>
		</table>
	</div>


	<!-- ここからポップアップ -->
	<!-- お問い合わせ詳細確認ポップアップ -->
	<div class="inquiries_wrapper">
		<div class="inquiries_modal">
			<!-- ポップアップを閉じるボタン -->
			<div class="close_modal">x</div>
			<div class="inquiries">
				<div class="inquiries_container">
					<div class="inquiry">
						<p class="inquiry_title">ID</p>
						<p class="inquiry_id"></p>
					</div>
					<div class="inquiry">
						<p class="inquiry_title">メールアドレス</p>
						<p class="inquiry_mail"></p>
					</div>
				</div>
				<div class="inquiries_container">
					<div class="inquiry">
						<p class="inquiry_title">対応ステータス</p>
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
					<p class="inquiry_title">件名</p>
					<textarea class="inquiry_subject"></textarea>
				</div>
				<div class="inquiry">
					<p class="inquiry_title">お問い合わせ内容</p>
					<textarea class="inquiry_content"></textarea>
				</div>
			</div>
		</div>
	</div>




           	 <!-- ここからポップアップ -->
      	 <!-- プルダウンを閉じるボタン -->


  <div class="contents_wrapper">
<div class="contents_modal">
	<div class="close_contents_modal">x</div>
	<div class="contents">
		<div class="content">
			<p>お問い合わせ詳細</p>
		</div>
		<div class="content">
			<p>ユーザーID</p>
			<p class="user_id"></p>
		</div>
		<div class="content">
			<p>メールアドレス</p>
			<p class="user_mail"></p>
		</div>
		<p>件名</p>
			<p class="inquiry_subject"></p>
		</div>
		<div class="content">
			<p>お問い合わせ内容</p>
			<p class="inquiry_content"></p>
		</div>
		<div class="regist">
				<p>対応ステータス</p>
				<select name="inquiry_status" size="1">
					<option value="0">未対応</option>
					<option value="1">対応中</option>
					<option value="2">対応済み</option>
				</select>
			</div>
			<input type="submit" name="submit">
		</div>
	</div>

    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
<script src="/mecar/js/inquiry_list.js"></script>
</body>
</html>