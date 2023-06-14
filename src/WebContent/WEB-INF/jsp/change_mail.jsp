<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<script src="/mecar/js/change_mail.js"></script>
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
			<h1>メールアドレス変更</h1>
			<form method="POST" action="/mecar/ChangeServlet">
				<table>
					<tr><td>ユーザーID</td><td><input type="text"></td></tr>
					<tr><td>パスワード</td><td><input type="text"></td></tr>
					<tr><td>メールアドレス</td><td><input type="text"></td></tr>
					<tr><td colspan="2"><input type="button" value="変更" id="mail" onclick="MoveCheck();"><input type="reset" value="リセット"></td></tr>
				</table>
			</form>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>