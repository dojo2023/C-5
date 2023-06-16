package test;

public class ItemsDaotest {

	/*
	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			List<Items> cardList2 = dao.select(new Items("", "", "a","","","","","","","",""));
			for (Items card : cardList2) {
				System.out.println("NUMBER：" + card.getNumber());
				System.out.println("Name：" + card.getName());
				System.out.println("ADDRESS：" + card.getAddress());
				System.out.println("COMPANY_NAME：" + card.getCompany_name());
				System.out.println("DEPARTMENT_NAME：" + card.getDepartment_name());
				System.out.println("POST_NAME：" + card.getPost_name());
				System.out.println("ZIP_CODE：" + card.getZip_code());
				System.out.println("TEL：" + card.getTel());
				System.out.println("EMAIL：" + card.getEmail());
				System.out.println("REMAKES：" + card.getRemakes());
				System.out.println("BOOKMARK：" + card.getBookmark());
				System.out.println();
			}



			// insert()のテスト
			System.out.println("---------- insert()のテスト ----------");
			Items insRec = new Items("", "tanaka", "しらたき", "しらたきAmazonURL","2000","1","3","1","67.8");
			if (dao.insert(insRec)) {
				System.out.println("登録成功！");
				List<Items> cardList3 = dao.select(insRec);
				for (Items card : cardList3) {
					System.out.println("NUMBER：" + card.getItem_id());
					System.out.println("Name：" + card.getUser_id());
					System.out.println("ADDRESS：" + card.getItem_name());
					System.out.println("COMPANY_NAME：" + card.getItem_url());
					System.out.println("DEPARTMENT_NAME：" + card.getItem_price());
					System.out.println("POST_NAME：" + card.getItem_category());
					System.out.println("ZIP_CODE：" + card.getFrequency_purchase());
					System.out.println("TEL：" + card.getItem_switch());
					System.out.println("EMAIL：" + card.getItem_meter());

				}
			}
			else {
				System.out.println("登録失敗！");
			}


			/*
			 //update()のテスト

			  System.out.println("---------- update()のテスト ----------");

			Bc upRec = new Bc("0007", "山本更太郎", "埼玉県春日部市", "しゃけ社","更新部門","主任部門","666-6666","666-666-6666","kousin@gamil.com","更新","sky");
			if (dao.update(upRec)) {
				System.out.println("更新成功！");
				List<Bc> cardList4 = dao.select(upRec);
				for (Bc card : cardList4) {
					System.out.println("NUMBER：" + card.getNumber());
					System.out.println("Name：" + card.getName());
					System.out.println("ADDRESS：" + card.getAddress());
					System.out.println("COMPANY_NAME：" + card.getCompany_name());
					System.out.println("DEPARTMENT_NAME：" + card.getDepartment_name());
					System.out.println("POST_NAME：" + card.getPost_name());
					System.out.println("ZIP_CODE：" + card.getZip_code());
					System.out.println("TEL：" + card.getTel());
					System.out.println("EMAIL：" + card.getEmail());
					System.out.println("REMAKES：" + card.getRemakes());
					System.out.println("BOOKMARK：" + card.getBookmark());
					System.out.println();
				}
			}
			else {
				System.out.println("更新失敗！");
			}






			// delete()のテスト
			System.out.println("---------- delete()のテスト ----------");
			if (dao.delete("0007")) {
				System.out.println("削除成功！");
			}
			else {
				System.out.println("削除失敗！");
			}

*/
}
