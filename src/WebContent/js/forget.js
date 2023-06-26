/**
 *
 */

  window.addEventListener('DOMContentLoaded', function(){

	document.getElementById('newPwSet').onsubmit = function(event) {
		const id = document.getElementById('newPwSet').ID.value;
		const mail = document.getElementById('newPwSet').MAIL.value;
		const pw = document.getElementById('newPwSet').PW.value;

		if (id === "" || mail==="" || pw === "") {
			event.preventDefault();
	 		document.getElementById('output').textContent = 'ID、メールアドレス、新パスワード全て入力してください！';
		}
	};

	window.MoveCheck = function() {
    	var userID = document.getElementById("pid").value;
    	var email = document.getElementsByName("pmail").value;
    	var password = document.getElementById("newPass").value;

	    if (userID === "" || password === "" || email === "") {
	    	 // 何かが入力されていない場合はフォームを送信しない
    	    return false;
    	} else {
        	alert("パスワード再設定完了しました！");
    	}
	}

});

// パスワードの表示・非表示切り替え
      function pushHideButton() {
        var txtPass = document.getElementById("newPass");
        var btnEye = document.getElementById("buttonEye");
        if (txtPass.type === "text") {
          txtPass.type = "password";
          btnEye.className = "fa fa-eye";
        } else {
          txtPass.type = "text";
          btnEye.className = "fa fa-eye-slash";
        }
      }