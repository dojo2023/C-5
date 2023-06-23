/**
 *
 */

// 必須項目未記入の場合のエラーメッセージ
window.addEventListener('DOMContentLoaded', function(){

	// 変更ボタンを押したとき
	document.getElementById('form').onsubmit = function(event) {

		// データの取得
		const id = document.getElementById('form').USER_ID.value;
		const pw = document.getElementById('form').USER_PW.value;
		const mail = document.getElementById('form').USER_MAIL.value;

		// 未入力があった際の処理
		if(id === "" && pw === "" && mail === "") {
			event.preventDefault();
			document.getElementById('output').textContent = '※ユーザーID、パスワード、メールアドレスを入力してください！';
		}
		else if(id === "" && pw === "") {
			event.preventDefault();
			document.getElementById('output').textContent = '※ユーザーID、パスワードを入力してください！';
		}
		else if(id === "" && mail === "") {
			event.preventDefault();
			document.getElementById('output').textContent = '※ユーザーID、メールアドレスを入力してください！';
		}
		else if(pw === "" && mail === "") {
			event.preventDefault();
			document.getElementById('output').textContent = '※パスワード、メールアドレスを入力してください！';
		}
		else if(id === "") {
			event.preventDefault();
			document.getElementById('output').textContent = '※IDを入力してください！';
		}
		else if(pw ==="") {
			event.preventDefault();
			document.getElementById('output').textContent = '※パスワードを入力してください！';
		}
		else if(mail ==="") {
			event.preventDefault();
			document.getElementById('output').textContent = '※メールアドレスを入力してください！';
		}


		// メールアドレス変更可能時のダイアログボックス表示
		else {
			if( confirm("本当に変更しますか。") ) {
				window.location.href = "/mecar/MenuServlet";
			}
			else {
				alert("変更を取り消しました。");
				event.preventDefault();
			}
		}
	};
})


 // パスワードの表示・非表示の切り替え
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

		}
		else {

			// (6)パスワードを非表示にする
			input_pass.type = 'password';
			passview.textContent = '表示';
		}
	});
})

