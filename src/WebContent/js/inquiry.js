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

/* 送信ボタンをクリックした際、件名が未入力ならエラーメッセージを表示する */

var formObj = document.getElementById('inquiry_form');
var errorMessageObj = document.getElementById('error_message');
formObj.onsubmit = function(){
  if(!formObj.Title.value){
    errorMessageObj.textContent = '件名は必須入力項目です。';
    return false;}
  errorMessageObj.textContent = null;
};
