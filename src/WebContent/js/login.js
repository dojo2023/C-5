/**


 *
 */
 window.addEventListener('DOMContentLoaded', function(){

	// (1)パスワード入力欄とボタンのHTMLを取得
	let passview = document.getElementById("passview");
	let input_pass = document.getElementById("input_pass");

	// (2)ボタンのイベントリスナーを設定
	passview.addEventListener("click", (e)=>{

		// (3)ボタンの通常の動作をキャンセル（フォーム送信をキャンセル）
		e.preventDefault();

		// (4)パスワード入力欄のtype属性を確認
		if( input_pass.type === 'password' ) {

			// (5)パスワードを表示する
			input_pass.type = 'text';
			passview.textContent = '非表示';

		} else {

			// (6)パスワードを非表示にする
			input_pass.type = 'password';
			passview.textContent = '表示';
		}
	});

	document.getElementById('login_form').onsubmit = function(event) {
		const id = document.getElementById('login_form').USER_ID.value;
		const pw = document.getElementById('login_form').USER_PW.value;

		if (id === "" || pw === "") {
			event.preventDefault();
	 		document.getElementById('output').textContent = 'IDとPWを入力してください！';
		}
	};

})


