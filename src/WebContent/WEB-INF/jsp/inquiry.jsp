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
  <h1>お問い合わせ</h1>
  <form  id = "inquiry_form" method="POST" name="" action="/mecar/InquiryServlet">
    <table class="table">
      <tr>
        <td>
          <label>ユーザーID</label><br>
          <input type="text" name="user_id" id="user_id" placeholder="ユーザーID(EL式)"></td>
        <td>
          <label>メールアドレス</label><br>
          <input type="text" name="user_mail" id="user_mail" placeholder="メールアドレス"><br></td>
      </tr>
     </table>
    件名(※必須)<br>
    <input type="text" class="title" name="Title"><br>
    お問い合わせ内容<br>
    <textarea class="textarea" name="Inquiry"></textarea><br>
    <input type="submit" class="submit" name="submit" onclick="MoveCheck();" value="送信"><br>
    <span class= "center" id="error_message"></span>
    </form>
  </main>

  <footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
  </footer>

  <script src = "js/inquiry.js"></script>

</body>

</html>