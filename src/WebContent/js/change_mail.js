/**
 *
 */

// 必須項目未記入・パスワード不一致の場合のエラーメッセージ、変更可能時のダイアログボックス表示
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


		// パスワードが違うときのエラーメッセージ
 		else if (pw !== pass) {
			event.preventDefault();
			document.getElementById('output').textContent = '※パスワードが正しくありません';
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


// 変更前のパスワードの表示・非表示の切り替え（目）
function pushHideButton() {

	// データの取得
	var txtPass = document.getElementById("textPassword");
	var btnEye = document.getElementById("buttonEye");

	// 表示・非表示の切り替え
	// 非表示にする
	if (txtPass.type === "text") {
		txtPass.type = "password";
		btnEye.className = "fa fa-eye";
	}
	// 表示する
	else {
		txtPass.type = "text";
		btnEye.className = "fa fa-eye-slash";
	}
}

