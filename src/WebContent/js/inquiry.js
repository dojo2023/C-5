/**
 *
 */

'use strict';

/* 送信ボタンをクリックした時の処理 */
function MoveCheck(){
  var res = confirm("送信しますか？");
  if(res === true){
    // OKなら送信してページ遷移
    alert("送信しました。お問い合わせありがとうございました。");
    window.location.href = "/mecar/InquiryServlet";
  }
  else{
    // キャンセルならアラートボックスを表示
    alert("キャンセルしました");
  }
}

