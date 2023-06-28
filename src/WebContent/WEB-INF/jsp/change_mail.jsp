<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>メールアドレス変更</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<link rel="stylesheet" href="/mecar/css/change.css">
		<link href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" rel="stylesheet">
		<!-- ↑目のアイコン使うためのやつ -->
 		<script src="/mecar/js/change_mail.js"></script>
	</head>
	<body>
		<header>
<!-- リボンメニュー -->
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
			<h1>メールアドレス変更</h1>
<!-- メールアドレス変更 -->
			<form id="form" method="POST" action="/mecar/ChangeMailServlet">

				<input type="hidden" name="PW" value="${user_id.user_pw}">
				<table align="center">
					<tr>
						<td>
							ユーザーID
						</td>
						<td class="auto">
						</td>
						<td>
							<input type="text" name="USER_ID" value="${user_id.user_id}" readonly>
						</td>
					</tr>
					<tr>
						<td>
							パスワード
						</td>
						<td class="required">
						</td>
						<td>
							<input type="password" name="USER_PW" id = "textPassword">
							<span id="buttonEye" class="fa fa-eye" onclick="pushHideButton()"></span>
						</td>
					</tr>
					<tr>
						<td>
							メールアドレス
						</td>
						<td class="required">
						</td>
						<td>
							<input type="text" name="USER_MAIL">

						</td>
					</tr>
					<tr>
						<td colspan="3" align="center">
							<input type="submit" value="変更" class="button">
							<input type="reset" value="リセット" class="button">
						</td>
					</tr>
					<tr>
						<td colspan="3" align="center">
							<p id="output" align="center"><p>
						</td>
					</tr>
				</table>
			</form>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>