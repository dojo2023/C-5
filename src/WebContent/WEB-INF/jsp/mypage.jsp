<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<link rel="stylesheet" href="/mecar/css/mypage.css">
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
						<td class="name">
							${user_id.user_id}　さん
						</td>
						<td>
							<a href="/mecar/img/ryuse.jpg">　</a>
							<a href="/mecar/img/yakiniku.jpg">　</a>
							<a href="/mecar/img/sode.jpg">　</a>
							<a href="/mecar/img/ぼでぃさー.MP4">　</a>
							<a href="/mecar/img/mejiji.jpg">　</a>
						</td>
					</tr>
					<tr><td id="space"></td></tr>
					<tr>
						<td class="td">
							<label for="button" class="btn btn-gradient button_label">
								<input type="submit" id="button" name="BUTTON" value="パスワード変更">
								<span class="span">パスワード変更</span>
							</label>
						</td>
						<td class="td">
							<label for="button2" class="btn btn-gradient button_label2">
								<input type="submit" id="button2" name="BUTTON" value="メールアドレス変更">
								<span>メールアドレス変更</span>
							</label>
						</td>
					</tr>
					<tr>
						<td class="td">
							<a href=/mecar/GuideServlet class="btn btn-gradient">
								<label for="button3" class="button_label3">
									<input type="button" id="button3" value="ご利用ガイド">
									<span>ご利用ガイド</span>
								</label>
							</a>
						</td>
						<td class="td">
							<a onclick="MoveCheck();" class="btn btn-gradient">
								<label for="button4" class="button_label4">
									<span>退会の方はこちら</span>
								</label>
							</a>
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