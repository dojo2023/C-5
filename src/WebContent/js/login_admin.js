/**
 *- 未入力の時にエラーメッセージを表示する。
 */

document.getElementById('form').onsubmit = function(event) {
	 const id = document.getElementById('form').DOJO.value;
	 const pw = document.getElementById('form').pass.value;
	 if (id === "" || pw === "") {
		 event.preventDefault();
	 	document.getElementById('output').textContent = 'IDとPWを入力してください！';
	 }
};