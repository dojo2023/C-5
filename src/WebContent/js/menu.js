'use strict';

$(function() {
	/* 商品内容確認・削除ポップアップ */
	$('.contents_show').click(
		function() {
			$('.contents_wrapper').fadeIn();
		}
	);

/*
	$('.contents_wrapper').click(function (e) {
		//モーダルの外側をクリックした場合にのみモーダルを閉じる
		if (e.target === this) {
			$(this).fadeOut();
		}
	});
*/

	$('.close_contents_modal').click(
		function() {
			//モーダルを閉じるボタンがクリックされた場合にモーダルを閉じる
			$('.contents_wrapper').fadeOut();
		}
	);

	/* 商品登録ポップアップ */
	$('.regist_show').click(
		function() {
			$('.regist_wrapper').fadeIn();
		}
	);

/*
	$('.contents_wrapper').click(function (e) {
		//モーダルの外側をクリックした場合にのみモーダルを閉じる
		if (e.target === this) {
			$(this).fadeOut();
		}
	});
*/

	$('.close_regist_modal').click(
		function() {
			//モーダルを閉じるボタンがクリックされた場合にモーダルを閉じる
			$('.regist_wrapper').fadeOut();
		}
	);
});





/* 商品を削除するときのダイアログボックス */
/* htmlの書き方
							<a onclick="MoveCheck();" class="任意のクラス">
								<label for="(任意のラベル)" class="（任意のクラス）">
									<span>削除</span>
								</label>
							</a>
*/
/*
function MoveCheck() {
	if( confirm("削除しますか") ) {
        window.location.href = "/mecar/UpdateItemServlet";
    }
    else {
        alert("削除を取り消しました。");
    }
}
*/