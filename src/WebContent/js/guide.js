/**
 *
 */

window.addEventListener('DOMContentLoaded', function(){

	// (1)画像とラベルのHTMLを取得
	let login = document.getElementsByClassName("toggle");
	let login_img = document.getElementById("login_img");

	// (2)ボタンのイベントリスナーを設定
	login.addEventListener("change",function() {

		// (3)ボタンの通常の動作をキャンセル（フォーム送信をキャンセル）
		e.preventDefault();

		// (4)パスワード入力欄のtype属性を確認
		if( login_img.style === '' ) {

			// (5)画像を非表示する
			login_img.style = 'display: none;';

		} else {

			// (6)画像を表示にする
			login_img.style = '';
		}
	});

});