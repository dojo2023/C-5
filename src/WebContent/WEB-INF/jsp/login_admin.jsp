<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/login.css">
</head>
<body>
    <header>
        <h1 class="logo"><a href="/mecar/InquiryListServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
    </header>
<main>
<h1>管理者ログイン</h1>

  <form id="form" method="POST" action="/mecar/LoginAdminServlet">
  	ユーザーID<input type="text" name="DOJO" class="Users">
  	パスワード<input type="password" name="pass" class="Password">
  	<input type="submit" name="LOGIN" value="ログイン" class="button">
  	<input type="reset" name="RESET" value="リセット" class="button">
  </form>
<p id="output"></p>


<!--エラーメッセージを表示する。jsに飛ぶ  -->
<script type="text/javascript" src="./js/login_admin.js"></script>



</main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>