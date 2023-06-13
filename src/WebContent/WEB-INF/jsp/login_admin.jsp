<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>管理者ログイン</h1>

  <form id="form"method="POST" action="/mecar/LoginAdminServlet">
  	ユーザーID<input type="text" name="ID"><br>
  	パスワード<input type="password" name="PW"><br>
  	<input type="submit" name="LOGIN" value="ログイン">
  	<input type="reset" name="RESET" value="リセット">
  </form>
<p id="output"></p>


<script type="text/javascript" src="./js/login_admin.js"></script>
</body>
</html>