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
<!-- ここからついか -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> <!-- jQuery ライブラリの読み込み -->

<script>
$(document).ready(function() {
  // 行をクリックした際にモーダルウィンドウを表示する関数
  function showModal(imageSrc, altText) {
    $(".modal-block").fadeIn(); // モーダルウィンドウを表示する
    $("#popup").attr("src", imageSrc); // 画像のパスを設定する
    $(".caption").text(altText); // altの内容を表示する
  }

  // モーダルウィンドウを非表示にする関数
  function hideModal() {
    $(".modal-block").fadeOut(); // モーダルウィンドウを非表示にする
  }

  // 行をクリックした際にモーダルウィンドウを制御するイベントハンドラを追加
  $(".hoge-item").on("click", function() {
    var imageSrc = $(this).find("img").attr("src"); // クリックされた行内の画像のパスを取得
    var altText = $(this).find("img").attr("alt"); // クリックされた行内のaltの内容を取得
    showModal(imageSrc, altText); // モーダルウィンドウを表示する
  });

  // モーダルウィンドウの閉じるボタンをクリックした際のイベントハンドラを追加
  $(".modal-block span").on("click", function() {
    hideModal(); // モーダルウィンドウを非表示にする
  });
});
</script>

<!-- ここまでついか -->

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

       			 <tr>
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
      			 </tr>
   				 </c:forEach>
              	 </table>
            	 </div>
    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

<!-- ここからついか -->
<!-- モーダルウィンドウ -->
<div class="modal-block">
  <div class="img-section">
    <span>Close</span>
    <img id="popup" src="">
    <div class="caption"></div>
  </div>
</div>

<!-- ここまでついか -->

</body>
</html>