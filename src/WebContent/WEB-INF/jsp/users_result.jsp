<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/mecar/css/common.css">
<link rel="stylesheet" href="/mecar/css/inquiry_list.css">
</head>
<body>
<header>
	<h1 class="logo"><a href="/mecar/InquiryListServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
	<nav>
		<ul>
			<li><a href="/mecar/LoginAdminServlet">ログアウト</a></li>
			<li><a href="/mecar/InquiryListServlet">お問い合わせ一覧表</a></li>
			<li><a href="/mecar/UsersListServlet">ユーザー一覧表</a></li>
		</ul>
	</nav>
</header>
    <main>
		<h1>ユーザー検索結果</h1>
		<h2>検索結果一覧</h2>
		 <form id="form"method="POST" action="/mecar/UsersListServlet">
		  <div class="right-align">
  	      <input type="text" name="keyWord" placeholder="検索するワード">
  	      <input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
  	      </div>
  	      </form>
  	       <div class="table-container">
            	<table border="1">
					<tr>
					<td>ユーザーID</td>
					<td>メールアドレス</td>
					<td>削除</td>
					</tr>
					<c:forEach var="e" items="${cardList}">
       				<tr>
          			<td>${e.user_id}</td>
           			<td>${e.user_mail}</td>
           			<td>
           			<form id = "delete_form" method="POST" action="/mecar/DeleteUserServlet">
               		<input type="hidden" name="userId" value="${e.user_id}">
                	<input type="submit" id="delete_button"  name="submit" value="削除" onclick="MoveCheck();">
           			</form>
           			</td>
      				</tr>
   					</c:forEach>
              		</table>
            		</div>
    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
<script src = "/mecar/js/users_result.js"></script>
</body>
</html>