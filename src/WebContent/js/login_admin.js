/**
 *- 未入力の時にエラーメッセージを表示する。
 */

document.getElementById('form').onsubmit = function(event) {
	 const id = document.getElementById('form').ID.value;
	 const pw = document.getElementById('form').PW.value;
	 if (id === "" || pw === "") {
		 event.preventDefault();
	 	document.getElementById('output').textContent = 'IDとPWを入力してください！';
	 }
};