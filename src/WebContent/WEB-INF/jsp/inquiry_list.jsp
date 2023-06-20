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
<script src="/mecar/js/inquiry_list.js"></script>
</head>
<body>
<!-- リボンメニュー -->
<header>
	<h1 class="logo"><a href="/mecar/MenuServlet"><img src="/mecar/img/ロゴ.png" alt="logo"></a></h1>
	<nav>
		<ul>
			<li><a href="/mecar/LoginAdminServlet">ログアウト</a></li>
			<li><a href="/mecar/InquiryListServlet">お問い合わせ一覧表</a></li>
			<li><a href="/mecar/UsersListServlet">ユーザー一覧表</a></li>
		</ul>
	</nav>
</header>
    <main>
		<h1>お問い合わせ一覧画面</h1>
		<h2>お問い合わせ一覧</h2>
		    <form id="form"method="POST" action="/mecar/InquiryListServlet">
		     <div class="right-align">
  	         <input type="text" name="keyWord" placeholder="検索するワード">
  	         <input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
  	         </div>
             </form>
            	<div class="table-container">
            	<table border="1">
					<tr>
					<td>対応ステータス</td>
					<td>ユーザーID</td>
					<td>メールアドレス</td>
					<td>件名</td>
					<td>日付</td>
					</tr>

				 <c:forEach var="e" items="${cardList2}">
       			 <tr>
         	     <td>${e.inquiry_status}</td>
          		 <td>${e.user_id}</td>
           		 <td>${e.user_mail}</td>
          	     <td>${e.inquiry_subject}</td>
        		 <td>${e.inquiry_date}</td>
      			 </tr>
   				 </c:forEach>
              	 </table>
            	 </div>
    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>