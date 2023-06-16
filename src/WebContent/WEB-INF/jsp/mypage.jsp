<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<script src="/mecar/js/mypage.js"></script>
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
			<h1>マイページ</h1>

<!-- 各項目へのボタン -->
			<form method="POST" action="/mecar/ChangeServlet">
				<table align="center">
					<tr>
						<td colspan="2" align="center">ユーザーID（EL式）さん</td>
					</tr>
					<tr>
						<td><a href=/mecar/ChangeServlet><input type="submit" name="BUTTON" value="パスワード変更"></a></td>
						<td><a href=/mecar/ChangeServlet><input type="submit" name="BUTTON" value="メールアドレス変更"></a></td>
						<td><label><input type="hidden" name="BUTTON" value="メールアドレス変更"><a href=/mecar/ChangeServlet>a</a></label></td>
					</tr>
					<tr>
						<td><a href=/mecar/GuideServlet><input type="button" value="ご利用ガイド"></a></td>
						<td><input type="button" value="退会の方はこちら" onclick="MoveCheck();"></td>
					</tr>
				</table>
			</form>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>