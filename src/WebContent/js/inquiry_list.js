'use strict';

$(function() {
	/* お問い合わせ内容確認ポップアップ */
	$('.contents_show').click(
		function() {
			$('.contents_wrapper').fadeIn();
		}
	);$('.close_contents_modal').click(
		function() {
			//モーダルを閉じるボタンがクリックされた場合にモーダルを閉じる
			$('.contents_wrapper').fadeOut();
		}
	);
});