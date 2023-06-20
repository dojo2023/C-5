package test;
import dao.ItemsDao;


public class ItemsDaotest {
	public static void main(String[] args) {
		ItemsDao dao = new ItemsDao();


		/*

	// selectCate()のカテゴリー別テスト。

			System.out.println("---------- selectCate()のカテゴリー別テスト ----------");
			List<Items> cardList2 = dao.selectCate(new Items(0, "yamada", "", "",0,1,0,0,0.0));
			for (Items card : cardList2) {
				System.out.println("商品ID：" + card.getItem_id());
				System.out.println("ユーザID：" + card.getUser_id());
				System.out.println("商品名：" + card.getItem_name());
				System.out.println("商品URL：" + card.getItem_url());
				System.out.println("商品価格：" + card.getItem_price());
				System.out.println("カテゴリー：" + card.getItem_category());
				System.out.println("頻度：" + card.getFrequency_purchase());
				System.out.println("スイッチ：" + card.getItem_switch());
				System.out.println("メーター：" + card.getItem_meter());

			}

			System.out.println("---------- selectsub()のカテゴリー別テスト ----------");
			List<Items> cardList10 = dao.selectCate(new Items(0, "yamada", "", "",0,2,0,0,0.0));
			for (Items card : cardList10) {
				System.out.println("商品ID：" + card.getItem_id());
				System.out.println("ユーザID：" + card.getUser_id());
				System.out.println("商品名：" + card.getItem_name());
				System.out.println("商品URL：" + card.getItem_url());
				System.out.println("商品価格：" + card.getItem_price());
				System.out.println("カテゴリー：" + card.getItem_category());
				System.out.println("頻度：" + card.getFrequency_purchase());
				System.out.println("スイッチ：" + card.getItem_switch());
				System.out.println("メーター：" + card.getItem_meter());

			}

			// selectsub()の一覧テスト。
			System.out.println("---------- selectList()の一覧テスト ----------");
			List<Items> cardList13 = dao.selectList(new Items(0, "yamada", "", "",0,0,0,0,0.0));
			for (Items card : cardList13) {
				System.out.println("商品ID：" + card.getItem_id());
				System.out.println("ユーザID：" + card.getUser_id());
				System.out.println("商品名：" + card.getItem_name());
				System.out.println("商品URL：" + card.getItem_url());
				System.out.println("商品価格：" + card.getItem_price());
				System.out.println("カテゴリー：" + card.getItem_category());
				System.out.println("頻度：" + card.getFrequency_purchase());
				System.out.println("スイッチ：" + card.getItem_switch());
				System.out.println("メーター：" + card.getItem_meter());

			}


			// select()のkeywordテスト。
			//【保留】keywordなど変更点があるため後日テスト




			// insert()のテスト
			System.out.println("---------- insert()のテスト ----------");
			Items insRec = new Items(0, "tanaka", "しらたき", "しらたきAmazonURL",2000,1,3,1,67.8);
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");
				List<Items> cardList7 = dao.selectsub(insRec);
				for (Items card : cardList7) {
					System.out.println("商品ID：" + card.getItem_id());
					System.out.println("ユーザID：" + card.getUser_id());
					System.out.println("商品名：" + card.getItem_name());
					System.out.println("商品URL：" + card.getItem_url());
					System.out.println("商品価格：" + card.getItem_price());
					System.out.println("カテゴリー：" + card.getItem_category());
					System.out.println("頻度：" + card.getFrequency_purchase());
					System.out.println("スイッチ：" + card.getItem_switch());
					System.out.println("メーター：" + card.getItem_meter());

				}
			}
			else {
				System.out.println("登録失敗！");
			}



			 //update()のテスト

			  System.out.println("---------- update()のテスト ----------");

			Items upRec = new Items(10, "tanaka", "しらたき", "しらたきAmazonURL",1000,1,3,1,60.0);
			if (dao.update(upRec)) {
				System.out.println("更新成功！");
				List<Items> cardList4 = dao.selectsub(upRec);
				for (Items card : cardList4) {
					System.out.println("商品ID：" + card.getItem_id());
					System.out.println("ユーザID：" + card.getUser_id());
					System.out.println("商品名：" + card.getItem_name());
					System.out.println("商品URL：" + card.getItem_url());
					System.out.println("商品価格：" + card.getItem_price());
					System.out.println("カテゴリー：" + card.getItem_category());
					System.out.println("頻度：" + card.getFrequency_purchase());
					System.out.println("スイッチ：" + card.getItem_switch());
					System.out.println("メーター：" + card.getItem_meter());

				}
			}
			else {
				System.out.println("更新失敗！");
			}





			// delete()のテスト
			System.out.println("---------- delete()のテスト ----------");
			if (dao.delete(10)) {
				System.out.println("削除成功！");
			}
			else {
				System.out.println("削除失敗！");
			}



			//decreaseALL()
			System.out.println("---------- decreaseALL() ----------");
			Items decall = new Items(1, "yamada", "", "",0,0,0,0,0.0);
			if (dao.decreaseALL(decall)) {
				System.out.println("一斉減量成功！");
				List<Items> cardList5 = dao.selectsub(decall);
				for (Items card : cardList5) {
					System.out.println("商品ID：" + card.getItem_id());
					System.out.println("ユーザID：" + card.getUser_id());
					System.out.println("商品名：" + card.getItem_name());
					System.out.println("商品URL：" + card.getItem_url());
					System.out.println("商品価格：" + card.getItem_price());
					System.out.println("カテゴリー：" + card.getItem_category());
					System.out.println("頻度：" + card.getFrequency_purchase());
					System.out.println("スイッチ：" + card.getItem_switch());
					System.out.println("メーター：" + card.getItem_meter());

				}
			}
			else {
				System.out.println("一斉減量失敗！");
			}

*/

}

}
