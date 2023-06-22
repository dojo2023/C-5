/**
 *
 */
'use strict';

/* 削除ボタンをクリックした時の処理 */

var formObj = document.getElementById('delete_form');
function MoveCheck(){


  // 削除を押した時に送信確認のダイアログボックスを表示する
   var res = confirm("削除しますか？");
     if(res === true){
        // OKなら送信してページ遷移
       alert("削除しました。");
       //window.location.href = "/mecar/UsersListServlet";
     }
     else{
     event.preventDefault();
        // キャンセルならアラートボックスを表示
       alert("キャンセルしました");
}
}
// 削除ボタンにイベントリスナーを追加
var deleteButton = document.getElementById('delete_button');
deleteButton.addEventListener('click', MoveCheck);