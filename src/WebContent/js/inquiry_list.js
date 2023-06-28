'use strict';

$(function() {
	/* お問い合わせ詳細確認ポップアップ表示 */
	$('.inquiries_show').click(
		function() {
			//クリックしたお問い合わせの情報を取得
			let id = $(this).nextAll('.inquiry_id').attr('value');
			let user_id = $(this).nextAll('.user_id').attr('value');
			let mail = $(this).nextAll('.user_mail').attr('value');
			let date = $(this).nextAll('.inquiry_date').attr('value');
			let status = $(this).nextAll('.inquiry_status').attr('value');
			let subject = $(this).nextAll('.inquiry_subject').attr('value');
			let content = $(this).nextAll('.inquiry_content').attr('value');
			//ポップアップ表示
			$('inquiries_wrapper').fadeIn();
			//取得したお問い合わせの情報をポップアップ内に入れ込む

		}
	)
})