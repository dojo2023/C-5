<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ご利用ガイド</title>
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
							<td rowspan="5" class="img">
								<img src="/mecar/img/ログインページ.png" class="img" id="login_img" style="">
							</td>
							<td>
								<input id="block-login-02" type="checkbox" class="toggle">
								<label class="Label Label1" for="block-login-02">①入力フォーム</label>
								<div class="content">
									<p>
										ユーザーIDとパスワードの入力フォームです。<br>
										ご自身のユーザーIDとパスワードを入力し、②ログインボタンを押してください。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-login-03" type="checkbox" class="toggle">
								<label class="Label Label2" for="block-login-03">②ログイン</label>
								<div class="content">
									<p>
										クリックすることで、入力内容の確認を行います。<br>
										入力情報が正しいとログインすることができます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-login-04" type="checkbox" class="toggle">
								<label class="Label Label3" for="block-login-04">③リセット</label>
								<div class="content">
									<p>
										クリックすることで、入力フォームの内容をリセットできます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-05" type="checkbox" class="toggle login">
								<label class="Label Label4" for="block-05">④新規登録</label>
								<div class="content">
									<p>
										クリックすることで新規登録ページに遷移します。<br>
									</p>
									<br>
									<div  class="next_img">
										<img src="/mecar/img/新規登録ページ.png" class="img">
									</div>
									<div class="next">
										<input id="block-regist-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-regist-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーIDとパスワードの入力フォームです。<br>
												ご自身のユーザーIDとパスワードを入力し、<br>
												②登録ボタンを押してください。<br>
												※既に使用されているユーザーIDは登録できません。
											</p>
										</div>
										<input id="block-regist-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-regist-02">②登録</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと新規登録することができます。
											</p>
										</div>
										<input id="block-regist-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-regist-03">③リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-login-06" type="checkbox" class="toggle login">
								<label class="Label Label5 login" for="block-login-06">⑤パスワードを忘れた方</label>
								<div class="content">
									<p>
										クリックすることでパスワード変更ページに遷移します。
									</p>
									<br>
									<div  class="next_img">
										<img src="/mecar/img/パスワード忘れ.png" class="img">
									</div>
									<div class="next">
										<input id="block-forget-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-forget-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーID、メールアドレス、パスワードの入力フォームです。<br>
												ご自身のユーザーID、メールアドレス、新しいパスワードを入力し、<br>
												②登録ボタンを押してください。
											</p>
										</div>
										<input id="block-forget-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-forget-02">②登録</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと、パスワード変更をすることができます。
											</p>
										</div>
										<input id="block-forget-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-forget-03">③リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</div>

<!-- メニューページ -->
				<input id="block-menu-01" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-menu-01">メニューページ</label>
				<div class="content">
					<table>
						<tr>
							<td rowspan="6" class="img">
								<img src="/mecar/img/メニューページ.png" class="img" id="login_img" style="">
							</td>
							<td>
								<input id="block-menu-02" type="checkbox" class="toggle">
								<label class="Label Label1" for="block-menu-02">①減量日数選択</label>
								<div class="content">
									<p>
										一斉減量する日数を選択するプルダウンメニューです。<br>
										前回減量した日からの日数を選択するには自動減量を押してください。<br>
										手動で日数を選ぶ際は1日～7日を選択することができます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-menu-03" type="checkbox" class="toggle">
								<label class="Label Label2" for="block-menu-03">②一斉減量ボタン</label>
								<div class="content">
									<p>
										クリックすることで各商品から、①で選択した日数分の割合を減量します。<br>
										毎日一回押すことをお勧めします。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-menu-04" type="checkbox" class="toggle">
								<label class="Label Label3" for="block-menu-04">③商品検索</label>
								<div class="content">
									<p>
										登録した商品を探すことができます。<br>
										商品名を入力し、虫眼鏡マークをクリックまたはEnterキーを押してください。<br>
										入力した文字が含まれる商品を表示します。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-menu-05" type="checkbox" class="toggle login">
								<label class="Label Label4" for="block-menu-05">④カテゴリ</label>
								<div class="content">
									<p>
										クリックすることで選択したカテゴリの商品一覧を表示します。<br>
										左から、全て、食料品、日用品、ケア用品、その他のカテゴリです。<br>
										各商品は、登録の際に選択したカテゴリに分類されます。
									</p>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-menu-06" type="checkbox" class="toggle login">
								<label class="Label Label5 login" for="block-menu-06">⑤商品一覧</label>
								<div class="content">
									<p>
										残量メーターの少ない順に表示します。<br>
										商品名、残量メーター、ON/OFFスイッチが表示されています。<br>
										クリックすることで商品の詳細を確認することができます。<br>
										スイッチをOFFにすることで、一斉減量ボタンを押しても、<br>
										その商品が減量しなくなります。
									</p>
									<br>
									<div  class="next_img">
										<img src="/mecar/img/メニューページ.png" class="img">
									</div>
									<div class="next">
										<input id="block-forget-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-forget-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーID、メールアドレス、パスワードの入力フォームです。<br>
												ご自身のユーザーID、メールアドレス、新しいパスワードを入力し、<br>
												②登録ボタンを押してください。
											</p>
										</div>
										<input id="block-forget-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-forget-02">②登録</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと、パスワード変更をすることができます。
											</p>
										</div>
										<input id="block-forget-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-forget-03">③リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-menu-07" type="checkbox" class="toggle">
								<label class="Label Label6" for="block-menu-07">⑥商品登録</label>
								<div class="content">
									<p>
										クリックすることで、商品登録ポップアップを表示します<br>
									</p>
									<br>
									<div  class="next_img">
										<img src="/mecar/img/yakiniku.jpg" class="img">
									</div>
									<div class="next">
										<input id="block-forget-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-forget-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーID、メールアドレス、パスワードの入力フォームです。<br>
												ご自身のユーザーID、メールアドレス、新しいパスワードを入力し、<br>
												②登録ボタンを押してください。
											</p>
										</div>
										<input id="block-forget-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-forget-02">②登録</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと、パスワード変更をすることができます。
											</p>
										</div>
										<input id="block-forget-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-forget-03">③リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
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
									<br>
									<div  class="next_img">
										<img src="/mecar/img/パスワード変更.png" class="img">
									</div>
									<div class="next">
										<input id="block-changeP-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-changeP-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーIDとパスワードの入力フォームです。<br>
												ご自身のユーザーID、現在のパスワード、新しいパスワードを入力し、<br>
												③変更ボタンを押してください。
											</p>
										</div>
										<input id="block-changeP-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-changeP-02">②パスワード表示</label>
										<div class="content">
											<p>
												クリックすることで入力したパスワードの表示・非表示を切り替えます。
											</p>
										</div>
										<input id="block-changeP-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-changeP-03">③変更</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと、パスワード変更をすることができます。
											</p>
										</div>
										<input id="block-changeP-04" type="checkbox" class="toggle">
										<label class="Label Label14" for="block-changeP-04">④リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-3" type="checkbox" class="toggle">
								<label class="Label Label4" for="block-my-3">③メールアドレス変更</label>
								<div class="content">
									<p>
										メールアドレス変更ページへ遷移します。
									</p>
									<br>
									<div  class="next_img">
										<img src="/mecar/img/メールアドレス変更.png" class="img">
									</div>
									<div class="next">
										<input id="block-changeM-01" type="checkbox" class="toggle">
										<label class="Label Label11" for="block-changeM-01">①入力フォーム</label>
										<div class="content">
											<p>
												ユーザーID、パスワード、メールアドレスの入力フォームです。<br>
												ご自身のユーザーID、パスワード、新しいメールアドレスを入力し、<br>
												③変更ボタンを押してください。
											</p>
										</div>
										<input id="block-changeM-02" type="checkbox" class="toggle">
										<label class="Label Label12" for="block-changeM-02">②パスワード表示</label>
										<div class="content">
											<p>
												クリックすることで入力したパスワードの表示・非表示を切り替えます。
											</p>
										</div>
										<input id="block-changeM-03" type="checkbox" class="toggle">
										<label class="Label Label13" for="block-changeM-03">③変更</label>
										<div class="content">
											<p>
												クリックすることで、入力内容の確認を行います。<br>
												入力情報が正しいと、メールアドレス変更をすることができます。
											</p>
										</div>
										<input id="block-changeM-04" type="checkbox" class="toggle">
										<label class="Label Label14" for="block-changeM-04">④リセット</label>
										<div class="content">
											<p>
												クリックすることで、入力フォームの内容をリセットできます。
											</p>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<input id="block-my-4" type="checkbox" class="toggle">
								<label class="Label Label5" for="block-my-4">④ご利用ガイド</label>
								<div class="content">
									<div  class="next_img">
										<img src="/mecar/img/ご利用ガイド.png" class="img">
									</div>
									<p>
										　当アプリの使い方や見方を説明します。<br>
										　確認したいページを押すとプルダウンメニューが開きます。<br>
										　詳細機能を押すことで説明を読むことができます。
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


<!-- ログアウト -->
				<input id="block-logout" type="checkbox" class="toggle">
				<label class="Label Label1" for="block-logout">ログアウト</label>
				<div class="content">
					<p>
						画面右上にあるログアウトボタンからログアウトすることができます。<br>
						セキュリティ上使い終わったらログアウトをお勧めします。<br>
						※一定時間で自動的にログアウトされます。
					</p>
				</div>


			</section>
		</main>
		<footer>
			<p>&copy;Copyright Error Maker. All rights reserved.</p>
		</footer>
	</body>
</html>