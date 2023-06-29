<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー一覧</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/users_list.css">
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
	<h1>ユーザー一覧</h1>

	<!-- キーワード検索 -->
	<form id="form" method="POST" action="/mecar/UsersListServlet" class="keyword_wrapper">
		<input type="search" name="keyWord" placeholder="キーワード検索" class="keyword">
		<input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン" name="search">
	</form>


	<!-- ユーザー一覧 -->
	<div id="table">
		<table id="list">
			<tr>
				<th>ユーザーID</th><th>メールアドレス</th><th>削除</th>
			</tr>

			<c:forEach var="e" items="${cardList2}">
				<tr class="inquiries_show">
					<td>${e.user_id}</td>
					<td>${e.user_mail}</td>
					<td>
						<form id = "delete_form" method="POST" action="/mecar/DeleteUserServlet">
							<input type="hidden" name="userId" value="${e.user_id}">
							<input type="image" src="/mecar/img/スタンダードなゴミ箱アイコンブルー.png"
							id="delete_button" name="submit" value="削除" onclick="MoveCheck();">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</main>

<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

<script src = "/mecar/js/users_list.js"></script>
</body>
</html>