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