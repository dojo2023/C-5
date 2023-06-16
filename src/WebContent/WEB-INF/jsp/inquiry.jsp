<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>お問い合わせ</title>
  <link rel="stylesheet" href="/mecar/css/common.css">
  <link rel="stylesheet" href="/mecar/css/inquiry.css">
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
  <form style="margin: auto; width: 220px;" id = "inquiry_form" method="POST" name="" action="/mecar/InquiryServlet">
  <h1>お問い合わせ</h1>
    ユーザーID
    メールアドレス<br>
    件名<input type="text" name="Title"><br>
    お問い合わせ内容<br>
    <textarea name="Inquiry"></textarea><br>
    <input type="submit" name="submit" onclick="MoveCheck();" value="送信">
    </form>
  </main>
  <span class= "center" id="error_message"></span>

  <footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
  </footer>

  <script src = "js/inquiry.js"></script>

</body>

</html>