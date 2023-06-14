/**
 *
 */

// 退会時の確認ダイアログボックス表示
 function MoveCheck() {
    if( confirm("本当に退会しますか。") ) {
        window.location.href = "/mecar/LoginServlet";
    }
    else {
        alert("退会を取り消しました。");
    }
}