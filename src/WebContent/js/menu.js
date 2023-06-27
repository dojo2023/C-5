'use strict';

$(function() {
	/* 商品内容確認・削除ポップアップ表示 */
	$('nobr, .contents_show').click(
		function() {
			//クリックした商品の情報を取得
			let id = $(this).nextAll('.list_id').attr('value');
			let name = $(this).nextAll('.list_name').attr('value');
			let price = $(this).nextAll('.list_price').attr('value');
			let frequency = $(this).nextAll('.list_frequency').attr('value');
			let category = $(this).nextAll('.list_category').attr('value');
			let meter = $(this).nextAll('.list_meter').attr('value');
			let url = $(this).nextAll('.list_url').attr('value');
			//ポップアップ表示
			$('.contents_wrapper').fadeIn();
			//取得した商品の情報をポップアップ内に入れ込む
			$('.contents_modal .item_id').attr('value', id);
			$('.contents .item_name').text(name);
			$('.contents nobr').text(price);
			$('.contents .item_frequency').text(frequency);
			$('.contents .item_category').text(category);
			$('.contents meter').attr('value', meter);
			$('.contents .item_url1').attr('href', url);
			$('.contents .item_url2').attr('href', url);
			//更新のポップアップに渡したい情報を入れ込む
			$('.contents_modal .content_id').attr('value',  id);
			$('.contents_modal .content_name').attr('value', name);
			$('.contents_modal .content_price').attr('value', price);
			$('.contents_modal .content_frequency').attr('value', frequency);
			$('.contents_modal .content_category').attr('value', category);
			$('.contents_modal .content_meter').attr('value', meter);
			$('.contents_modal .content_url').attr('value', url);
		}
	);

	/* 商品更新ポップアップ表示 */
	$('.update_show').click(
		function() {
			//クリックした商品の情報を取得
			let id = $(this).nextAll('.content_id').attr('value');
			let name = $(this).nextAll('.content_name').attr('value');
			let price = $(this).nextAll('.content_price').attr('value');
			let meter = $(this).nextAll('.content_meter').attr('value');
			let url = $(this).nextAll('.content_url').attr('value');
			//ポップアップ表示
			$('.contents_wrapper').fadeOut();
			$('.update_wrapper').fadeIn();
			//取得した商品の情報をポップアップ内に入れ込む
			$('.updates .item_id').attr('value', id);
			$('.update .item_name').attr('value', name);
			$('.update .item_price').attr('value', price);
			$('.update .meter_input1').attr('value', meter);
			$('.update .item_url').attr('value', url);
			//メーターの％表示の処理
			let value = document.querySelector(".meter_output1");
			let input = document.querySelector(".meter_input1");
			value.textContent = input.value
			input.addEventListener("input", (event) => {
				value.textContent = event.target.value
			});
		}
	);

	/* 商品登録ポップアップ表示 */
	$('.regist_show').click(
		function() {
			$('.regist_wrapper').fadeIn();
			//メーターの％表示の処理
			let value = document.querySelector(".meter_output2");
			let input = document.querySelector(".meter_input2");
			value.textContent = input.value
			input.addEventListener("input", (event) => {
				value.textContent = event.target.value
			});
		}
	);

	/* ポップアップ閉じる */
	$('.contents_wrapper, .regist_wrapper, .update_wrapper').click(function (e) {
		//モーダルの外側をクリックした場合にのみモーダルを閉じる
		if (e.target === this) {
			$(this).fadeOut();
		}
	});

	$('.close_modal').click(
		function() {
			//モーダルを閉じるボタンがクリックされた場合にモーダルを閉じる
			$('.contents_wrapper, .regist_wrapper, .update_wrapper').fadeOut();
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

/* 商品登録時の空欄防止 */
document.getElementById('Registitem_form').onsubmit = function(event) {
    const name_i = document.getElementById('Registitem_form').name.value;
    const url_i = document.getElementById('Registitem_form').url.value;
    const frequency_i =document.getElementById('Registitem_form').frequency.value;
    const category_i =document.getElementById('Registitem_form').category.value;

    if (name_i === "" || url_i === "" ) {
        event.preventDefault();
         document.getElementById('output').textContent = '必須事項を入力してください';
         }
    if(frequency_i === "" || category_i === ""){
    event.preventDefault();
         document.getElementById('output').textContent = '必須事項を入力してください';}
};

