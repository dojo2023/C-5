/**
 *
 */

  window.addEventListener('DOMContentLoaded', function(){

	//全入力を促す文言
	document.getElementById('idregist').onsubmit = function(event) {
		const id = document.getElementById('idregist').ID.value;
		const pw = document.getElementById('idregist').PW.value;
		const mail = document.getElementById('idregist').MAIL.value;

		if (id === "" || pw === "" || mail === "" ) {
			event.preventDefault();
	 		document.getElementById('output').textContent = 'ID、パスワード、メールアドレスを全て入力してください';
		}
	};


	window.MoveCheck = function() {
    	var userID = document.getElementById("input_id").value;
    	var password = document.getElementById("input_pass").value;
    	var email = document.getElementsByName("MAIL")[0].value;

	    if (userID === "" || password === "" || email === "") {
	    	 // 何かが入力されていない場合はフォームを送信しない
    	    return false;
    	} else {
        	alert("新規登録が完了しました\nログインページに移動します");
    	}
	}


});

// パスワードの表示・非表示切り替え
      function pushHideButton() {
        var txtPass = document.getElementById("input_pass");
        var btnEye = document.getElementById("buttonEye");
        if (txtPass.type === "text") {
          txtPass.type = "password";
          btnEye.className = "fa fa-eye";
        } else {
          txtPass.type = "text";
          btnEye.className = "fa fa-eye-slash";
        }
      }
