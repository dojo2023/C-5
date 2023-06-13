<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
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
			<h1>マイページ</h1>
			ユーザーID（EL式）さん
			<form method="POST" action="/mecar/ChangeServlet">
				<table>
					<tr>
						<td><a href=/mecar/ChangeServlet><input type="submit" name="BUTTON" value="パスワード変更"></a></td>
						<td><a href=/mecar/ChangeServlet><input type="submit" name="BUTTON" value="メールアドレス変更"></a></td>
					</tr>
					<tr>
						<td><a href=/mecar/GuideServlet><input type="button" value="ご利用ガイド"></a></td>
						<td><a href=/mecar/LoginServlet><input type="button" value="退会の方はこちら"></a></td>
					</tr>
				</table>
			</form>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>