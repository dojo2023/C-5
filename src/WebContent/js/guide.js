/**
 *
 */

/* ロードされた時に起動 */
window.onload = function(){

/* スイッチの切り替え */
	const checkbox = document.getElementById('switch');
	checkbox.addEventListener('click', () => {
	  const title = document.querySelector('.title');
	  title.textContent = checkbox.checked ? "ログインページ" : "ログインページ詳細";
	  const login = document.getElementById('login');
	  login.textContent = checkbox.checked ? "ログイン" : null;
	  const reset = document.getElementById('reset');
	  reset.textContent = checkbox.checked ? "リセット" : null;
	  const new_regist = document.getElementById('new_regist');
	  new_regist.textContent = checkbox.checked ? "新規登録" : null;
	  const forget_pass = document.getElementById('forget_pass');
	  forget_pass.textContent = checkbox.checked ? "パスワードをお忘れの方" : null;
	});
}