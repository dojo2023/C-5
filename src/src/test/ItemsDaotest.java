package test;
import java.util.List;

import dao.ItemsDao;
import model.Items;


public class ItemsDaotest {
	public static void main(String[] args) {
		ItemsDao dao = new ItemsDao();




		//updateSwitch()のテスト

		  System.out.println("---------- updateSwitch()のテスト ----------");
		  //商品ID 2の化粧水のみ対象とする
		  //int item_id,int item_switch
		  if (dao.updateSwitch(2,0)) {
			System.out.println("切り替え成功！");
			}
		  else {
			  System.out.println("切り替え失敗！");}


		  System.out.println("---------- switchの確認 ----------");
			List<Items> cardList13 = dao.selectsub(new Items(0, "yamada", "化粧水", "",0,0,0,0,0.0));
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




	// selectCate()のカテゴリー別テスト。
	//int item_category, String user_id

			System.out.println("---------- selectCate()のカテゴリー別テスト ----------");
			List<Items> cardList2 = dao.selectCate(1, "yamada");
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


		//selectのkeywordテスト
		//String keyWord, String user_id

			System.out.println("---------- selectのkeywordテスト ----------");
			List<Items> cardList12 = dao.select("水", "yamada");
			for (Items card : cardList12) {
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


/*
			// selectsub()のテスト。
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
*/


			//decreaseALL()
			System.out.println("---------- decreaseALL() ----------");

			int decDay = 2;
			String user_id =  "yamada";
			if (dao.decreaseALL(decDay,user_id)) {
				System.out.println("一斉減量成功！");


		}else {
				System.out.println("一斉減量失敗！");
			}


			//decreaseL()
			System.out.println("---------- decreaseL() ----------");


			//String user_id =  "yamada";
			if (dao.decrease(user_id)) {
				System.out.println("一回減量成功！");


		}else {
				System.out.println("一回分減量失敗！");
			}



}

	}
