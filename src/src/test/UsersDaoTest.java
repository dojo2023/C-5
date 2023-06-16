package test;

import dao.UsersDao;
import model.Users;

public class UsersDaoTest {
	public static void main(String[] args) {
		UsersDao dao = new UsersDao();
		testIsLoginOK1();	// ユーザーが見つかる場合のテスト
		testIsLoginOK2();	// ユーザーが見つからない場合のテスト
		// insert()のテスト
		System.out.println("---------- insert()のテスト ----------");
		Users insRec = new Users(0, "yama","word", "MEADO6@meado.jp", null);
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
//			List<Users> cardList3 = dao.select(insRec);
//			for (Users member : cardList3) {
//				System.out.println("User_auto_id：" + member.getUser_auto_id());
//				System.out.println("User_id：" + member.getUser_id());
//				System.out.println("User_pw：" + member.getUser_pw());
//				System.out.println("User_mail：" + member.getUser_mail());
//				System.out.println();
//			}
		}
		else {
			System.out.println("登録失敗！");
		}
	}

	// ユーザーが見つかる場合のテスト
	public static void testIsLoginOK1() {
		UsersDao dao = new UsersDao();
		if (dao.isLoginOK(new Users("yamada", "pass"))) {
			System.out.println("testIsLoginOK1：テストが成功しました");
		}
		else {
			System.out.println("testIsLoginOK1：テストが失敗しました");
		}
	}

	// ユーザーが見つからない場合のテスト
	public static void testIsLoginOK2() {
		UsersDao dao = new UsersDao();
		if (!dao.isLoginOK(new Users("yamada", "password"))) {
			System.out.println("testIsLoginOK2：テストが成功しました");
		}
		else {
			System.out.println("testIsLoginOK2：テストが失敗しました");
		}
	}

}

