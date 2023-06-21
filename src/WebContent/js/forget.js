/**
 *
 */

  window.addEventListener('DOMContentLoaded', function(){

	// (1)パスワード入力欄とボタンのHTMLを取得
	let passview = document.getElementById("passview");
	let input_pass = document.getElementById("newPass");

	// (2)ボタンのイベントリスナーを設定
	passview.addEventListener("click", (e)=>{

		// (3)ボタンの通常の動作をキャンセル（フォーム送信をキャンセル）
		e.preventDefault();

		// (4)パスワード入力欄のtype属性を確認
		if( newPass.type === 'password' ) {

			// (5)パスワードを表示する
			newPass.type = 'text';
			passview.textContent = '非表示';

		} else {

			// (6)パスワードを非表示にする
			newPass.type = 'password';
			passview.textContent = '表示';
		}
	});

	document.getElementById('newPwSet').onsubmit = function(event) {
		const id = document.getElementById('newPwSet').ID.value;
		const mail = document.getElementById('newPwSet').MAIL.value;
		const pw = document.getElementById('newPwSet').PW.value;

		if (id === "" || mail==="" || pw === "") {
			event.preventDefault();
	 		document.getElementById('output').textContent = 'ID、メールアドレス、新パスワード全て入力してください！';
		}
	};

})