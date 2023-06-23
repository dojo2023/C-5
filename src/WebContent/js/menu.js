'use strict';

/* 減量停止・再開スイッチを押したときの処理（ON・OFFの書き換え） */



/* 商品を削除するときのダイアログボックス */

/* htmlの書き方
							<a onclick="MoveCheck();" class="任意のクラス">
								<label for="(任意のラベル)" class="（任意のクラス）">
									<span>削除</span>
								</label>
							</a>
*/

function MoveCheck() {
	if( confirm("削除しますか") ) {
        window.location.href = "/mecar/UpdateItemServlet";
    }
    else {
        alert("削除を取り消しました。");
    }
}



