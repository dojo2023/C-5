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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<!-- リボンメニュー -->
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
				 <!-- この一行をクリックするとモーダルウィンドウが表示される -->
				 <form method="POST" action="/mecar/InquiryListServlet" class="contents_show">
            	 <table border="1">
       			 <tr>
       			 <div class="contents_show">
         		 <td>
         	     <c:choose>
       			 <c:when test="${e.inquiry_status == 0}">未対応</c:when>
       			 <c:when test="${e.inquiry_status == 1}">対応中</c:when>
      			 <c:when test="${e.inquiry_status == 2}">対応済み</c:when>
    			 </c:choose>
  				 </td>
          		 <td>${e.user_id}</td>
           		 <td>${e.user_mail}</td>
          	     <td>${e.inquiry_subject}</td>
        		 <td>${e.inquiry_date}</td>
        		 </div>
      			 </tr>
      			 </table>
				 </form>
   				 </c:forEach>
              	 </table>
            	 </div>

            	 <!-- ここからポップアップ -->
            	 <!-- プルダウンを閉じるボタン -->


    <div class="contents_wrapper">
		<div class="contents_modal">
			<div class="close_contents_modal">x</div>
			<div class="contents">
				<div class="content">
					<p>お問い合わせ詳細</p>
				</div>
				<div class="content">
					<p>ユーザーID</p>
					<p class="user_id"></p>
				</div>
				<div class="content">
					<p>メールアドレス</p>
					<p class="user_mail"></p>
				</div>
				<p>件名</p>
					<p class="inquiry_subject"></p>
				</div>
				<div class="content">
					<p>お問い合わせ内容</p>
					<p class="inquiry_content"></p>
				</div>
				<div class="regist">
						<p>対応ステータス</p>
						<select name="inquiry_status" size="1">
							<option value="0">未対応</option>
							<option value="1">対応中</option>
							<option value="2">対応済み</option>
						</select>
					</div>
					<input type="submit" name="submit">
		</div>
	</div>

    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>
<script src="/mecar/js/inquiry_list.js"></script>
</body>
</html>