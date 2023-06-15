/**
 *
 */

/* ロードされた時に起動 */
window.onload = function(){

/* ログインページスイッチの切り替え */
	const checkbox = document.getElementById('switch');
	checkbox.addEventListener('click', () => {
	  const title = document.querySelector('.title');
	  title.textContent = checkbox.checked ? "ログインページ詳細" : "ログインページ";
	  const login = document.getElementById('login');
	  login.textContent = checkbox.checked ? "ログイン" : null;
	  const reset = document.getElementById('reset');
	  reset.textContent = checkbox.checked ? "リセット" : null;
	  const new_regist = document.getElementById('new_regist');
	  new_regist.textContent = checkbox.checked ? "新規登録" : null;
	  const forget_pass = document.getElementById('forget_pass');
	  forget_pass.textContent = checkbox.checked ? "パスワードをお忘れの方" : null;
	});


/* ログインスイッチの切り替え */
	const checkbox1 = document.getElementById('switch1');
	checkbox1.addEventListener('click', () => {
/*	  const login = document.querySelector('.login');
	  login.textContent = checkbox.checked ? "ログイン詳細" : "ログイン";
*/
	  const login_des = document.getElementById('.login_des');
	  login_des.textContent = checkbox1.checked ? "ログインできます。" : null;
	});
}