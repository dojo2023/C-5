/**
 *
 */

'use strict';

/* 送信ボタンをクリックした時の処理 */

var formObj = document.getElementById('inquiry_form');
var errorMessageObj = document.getElementById('error_message');

function MoveCheck(){
  // もし件名が空欄ならエラーメッセージを表示する
  if(!formObj.inquiry_subject.value){
    event.preventDefault();
    errorMessageObj.textContent = '件名は必須入力項目です';
    return false;
  }

  else{
  // その他の場合（件名が入力されている場合）、送信確認のダイアログボックスを表示する
   errorMessageObj.textContent = null;
   var res = confirm("送信しますか？");
     if(res === true){
        // OKなら送信してページ遷移
       alert("送信しました。お問い合わせありがとうございました。");
       window.location.href = "/mecar/InquiryServlet";
     }
     else{
        // キャンセルならアラートボックスを表示
		event.preventDefault();
       alert("キャンセルしました");
     }
   }
 }