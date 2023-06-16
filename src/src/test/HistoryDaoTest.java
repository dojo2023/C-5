package test;

import dao.HistoryDao;
import model.History;

public class HistoryDaoTest {
	public static void main(String[] args) {
		HistoryDao dao = new HistoryDao();

		//insertのテスト
		System.out.println("------------- insertのテスト --------------");
		History insRec = new History(0,1,null);

		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
		}
		else {
			System.out.println("登録失敗！");
		}
	}

}
