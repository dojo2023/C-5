/**
 *
 */

 // メールアドレス変更時のダイアログボックス表示
  function MoveCheck() {
    if( confirm("本当に変更しますか。") ) {
        window.location.href = "/mecar/MenuServlet";
    }
    else {
        alert("変更を取り消しました。");
    }
}

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