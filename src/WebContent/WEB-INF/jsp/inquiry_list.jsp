<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/mecar/css/common.css">
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
		     <div class="container">
  	        <input type="text" name="ID" placeholder="検索するワード">
  	        <input type="image" src="/mecar/img/虫眼鏡ブルー.png" alt="検索ボタン">
  	        </div>
            </form>
            	<table border="1">
					<tr>
					<td>対応ステータス</td>
					<td>ユーザーID</td>
					<td>メールアドレス</td>
					<td>件名</td>
					</tr>
            	</table>
    </main>
<footer>
	<p>&copy;Copyright Error Maker. All rights reserved.</p>
</footer>

</body>
</html>