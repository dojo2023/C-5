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

				<table>
					<tr>
						<td>
							ユーザーID
						</td>
						<td>
							<input type="text" name="USER_ID" value="${user_id.user_id}" readonly>
						</td>
					</tr>
					<tr>
						<td>
							パスワード
						</td>
						<td>
							<input type="password" id = "input_pass" name="USER_PW">
							<button id ="passview">表示</button>
						</td>
					</tr>
					<tr>
						<td>
							メールアドレス
						</td>
						<td>
							<input type="text" name="USER_MAIL">

						</td>
					</tr>
				</table>
				<p id="output">（全て必須入力です。）<p>
				<input type="submit" value="変更" id="pass">
				<input type="reset" value="リセット">
			</form>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>