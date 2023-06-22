<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>お問い合わせ</title>
  <link rel="stylesheet" href="/mecar/css/common.css">
  <link rel="stylesheet" href="/mecar/css/inquiry.css">
</head>

<body>
<!-- リボンメニューここから -->
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
<!-- リボンメニューここまで -->

  <main>
    <h1>お問い合わせ</h1>
    <form  id = "inquiry_form" method="POST" name="" action="/mecar/InquiryServlet">
      <table class="table">
        <tr>
          <td>
            <span class="auto"><label>ユーザーID</label></span><br>
            <input type="text" class="idmail" name="user_id" id="user_id" size=40 readonly value="${user_id.user_id}">
          </td>
          <td>
            <span class="auto"><label>メールアドレス</label></span><br>
            <input type="text" class="idmail" name="user_mail" id="user_mail"size=40 readonly value="${user_id.user_mail}"><br>
          </td>
        </tr>
       </table>
      <span class="required"><label class="center">件名</label></span>    <span class= "center" id="error_message"></span><br>
      <input type="text" class="title" name="inquiry_subject" id="inquiry_subject"><br>
      お問い合わせ内容<br>
      <textarea class="textarea" name="inquiry_content" id="inquiry_content"></textarea><br>
      <div class="input_wrap"><input type="submit" class="submit" name="submit" onclick="MoveCheck();" value="送信"></div><br>
    </form>
  </main>

  <footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
  </footer>

  <script src = "js/inquiry.js"></script>

</body>

</html>