/**
 *
 */

  window.addEventListener('DOMContentLoaded', function(){

	//パスワードを表示、非表示切り替える
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
	//全入力を促す文言
	document.getElementById('idregist').onsubmit = function(event) {
		const id = document.getElementById('idregist').ID.value;
		const pw = document.getElementById('idregist').PW.value;
		const mail = document.getElementById('idregist').MAIL.value;

		if (id === "" || pw === "" || mail === "" ) {
			event.preventDefault();
	 		document.getElementById('output').textContent = 'ID、パスワード、メールアドレス全て入力してください！';
		}
	};


	window.MoveCheck = function() {
    	var userID = document.getElementById("input_id").value;
    	var password = document.getElementById("input_pass").value;
    	var email = document.getElementsByName("MAIL")[0].value;

	    if (userID === "" || password === "" || email === "") {
	    	 // 何かが入力されていない場合はフォームを送信しない
    	    return false;
    	} else {
        	alert("新規登録完了しました！");
    	}
	}


})