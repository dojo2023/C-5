package test;
import java.util.List;

import dao.ItemsDao;
import model.Items;

public class ItemsDaotest {
	public static void main(String[] args) {
		ItemsDao dao = new ItemsDao();


	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			List<Items> cardList2 = dao.select(new Items(0, "yamada", "クイック", "",0,0,0,0,0.0));
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



			// insert()のテスト
			System.out.println("---------- insert()のテスト ----------");
			Items insRec = new Items(0, "tanaka", "しらたき", "しらたきAmazonURL",2000,1,3,1,67.8);
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");
				List<Items> cardList3 = dao.select(insRec);
				for (Items card : cardList3) {
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
				List<Items> cardList4 = dao.select(upRec);
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

}

}
