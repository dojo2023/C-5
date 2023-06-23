<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/mecar/css/common.css">
		<link rel="stylesheet" href="/mecar/css/guide.css">
		<script src="/mecar/js/guide.js"></script>
	</head>
	<body>
		<header>

<!-- リボンメニュー -->
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
			<h1>ご利用ガイド</h1>

<!-- ご利用ガイドアコーディオン開閉 -->
			<section class="accordion">

<!-- ログインページ -->
				<input id="block-login-01" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-login-01">ログインページ</label>
				<div class="content">
					<table>
						<tr>
							<td rowspan="4" class="img">
								<img src="/mecar/img/ログインページ（サンプル）.png" class="img">
							</td>
							<td>
								<input id="block-login-02" type="checkbox" class="toggle">
								<label class="Label Label2" for="block-login-02">①ログイン</label>
								<div class="content">
									<p>
										ログインできます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-login-03" type="checkbox" class="toggle">
								<label class="Label Label3" for="block-login-03">②リセット</label>
								<div class="content">
									<p>リセットできます。</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-login-04" type="checkbox" class="toggle">
								<label class="Label Label4" for="block-login-04">③パスワードを忘れた方</label>
								<div class="content">
									<p>
										パスワード変更ができます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-05" type="checkbox" class="toggle">
								<label class="Label Label5" for="block-05">④新規登録</label>
								<div class="content">
									<p>
										新規登録フォームに遷移します。
									</p>
								</div>
							</td>
						</tr>
					</table>
				</div>

<!-- メニューページ -->
				<input id="block-06" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-06">メニューページ</label>
				<div class="content">
					<input id="block-07" type="checkbox" class="toggle">
					<label class="Label Label2" for="block-07">ログイン</label>
					<div class="content">
						<p>ログインできます。</p>
					</div>
					<input id="block-08" type="checkbox" class="toggle">
					<label class="Label Label3" for="block-08">リセット</label>
					<div class="content">
						<p>リセットできます。</p>
					</div>
					<input id="block-09" type="checkbox" class="toggle">
					<label class="Label Label4" for="block-09">新規登録</label>
					<div class="content">
						<p>新規登録フォームに遷移します。</p>
					</div>
					<input id="block-10" type="checkbox" class="toggle">
					<label class="Label Label5" for="block-10">パスワードを忘れた方</label>
					<div class="content">
						<p>パスワード変更ができます。</p>
					</div>
				</div>

<!-- マイページ -->
				<input id="block-my" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-my">マイページ</label>
				<div class="content">
					<table>
						<tr>
							<td rowspan="5" class="img">
								<img src="/mecar/img/マイページ.png" class="img">
							</td>
							<td>
								<input id="block-my-1" type="checkbox" class="toggle">
								<label class="Label Label2" for="block-my-1">①ユーザーID</label>
								<div class="content">
									<p>
										現在ログインしているユーザーIDを表示します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-2" type="checkbox" class="toggle">
								<label class="Label Label3" for="block-my-2">②パスワード変更</label>
								<div class="content">
									<p>
										パスワード変更ページへ遷移します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-3" type="checkbox" class="toggle">
								<label class="Label Label4" for="block-my-3">③メールアドレス</label>
								<div class="content">
									<p>
										メールアドレス変更ページへ遷移します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-4" type="checkbox" class="toggle">
								<label class="Label Label5" for="block-my-4">④ご利用ガイド</label>
								<div class="content">
									<p>
										当アプリの使い方や見方を説明します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-5" type="checkbox" class="toggle">
								<label class="Label Label5" for="block-my-5">④退会</label>
								<div class="content">
									<p>
										退会をすることができます。<br>
										クリックをすると確認ボックスが表示されます。<br>
										OKを押すとユーザー情報が削除され、ログインページへと遷移します。
									</p>
								</div>
							</td>
						</tr>
					</table>
				</div>

<!-- お問い合わせページ -->
				<input id="block-inq" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-inq">お問い合わせページ</label>
				<div class="content">
					<table>
						<tr>
							<td rowspan="4" class="img">
								<img src="/mecar/img/お問い合わせページ.png" class="img">
							</td>
							<td>
								<input id="block-inq-1" type="checkbox" class="toggle">
								<label class="Label Label2" for="block-inq-1">①ユーザーID　/　メールアドレス </label>
								<div class="content">
									<p>
										自動で記述されます。書き換えることはできません。<br>
										このメールアドレスにお問い合わせのご返答を致します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-inq-2" type="checkbox" class="toggle">
								<label class="Label Label3" for="block-inq-2">②件名</label>
								<div class="content">
									<p>
										お問い合わせの概要をお知らせください。<br>
										必須入力項目となります。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-inq-3" type="checkbox" class="toggle">
								<label class="Label Label4" for="block-inq-3">③お問い合わせ内容</label>
								<div class="content">
									<p>
										お問い合わせの詳細をお知らせください。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-inq-4" type="checkbox" class="toggle">
								<label class="Label Label5" for="block-inq-4">④送信ボタン</label>
								<div class="content">
									<p>
										クリックすることで上記の内容を送信します。<br>
										お間違えの無いようご確認の上、送信ボタンをクリックしてください。
									</p>
								</div>
							</td>
						</tr>
					</table>
				</div>


			</section>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>
<!--
<!--  				<div class="circle"></div>
					<div class="base"></div>-->

<!-- ログインページを選択したとき -->
			<label for="switch" class="switch_label">
				<div>
					<input type="checkbox" class="switch" id="switch">
				</div>
				<span class="title">ログインページ</span>
			</label>

<!--
			<label>
				<div>
					<input type="checkbox" class="switch">
				</div>
				<span class="title">ログインページ詳細1</span>
			</label>
-->

<!-- ログインを選択したとき -->
			<label for="switch1" class="switch_label1">
				<div>
					<input type="checkbox" class="switch" id="switch1">
				</div>
				<span class="login" id="login"></span>
			</label>
			<span class="login" id="login_des"></span>



			<span class="login" id="reset"></span>
			<span class="login" id="new_regist"></span>
			<span class="login" id="forget_pass"></span>
-->