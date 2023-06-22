package test;

import java.util.List;

import dao.UsersDao;
import model.Users;

public class UsersDaoTest {
	public static void main(String[] args) {
		UsersDao dao = new UsersDao();
		testIsLoginOK1();	// ユーザーが見つかる場合のテスト
		testIsLoginOK2();	// ユーザーが見つからない場合のテスト

		// select()のテスト
		System.out.println("---------- select()のテスト ----------");
		List<Users> member2 = dao.select("");
		for (Users member : member2) {
			System.out.println("User_auto_id：" + member.getUser_auto_id());
			System.out.println("User_id：" + member.getUser_id());
			System.out.println("User_pw：" + member.getUser_pw());
			System.out.println("User_mail：" + member.getUser_mail());
			System.out.println();
		}

		// insert()のテスト
		System.out.println("---------- insert()のテスト ----------");
		Users insRec = new Users(0, "ya","word", "MEADO6@meado.jp", null);
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
			List<Users> member1 = dao.select("");
			for (Users member : member1) {
				System.out.println("User_auto_id：" + member.getUser_auto_id());
				System.out.println("User_id：" + member.getUser_id());
				System.out.println("User_pw：" + member.getUser_pw());
				System.out.println("User_mail：" + member.getUser_mail());
				System.out.println();
			}
		}
		else {
			System.out.println("登録失敗！");
		}


		// update()のテスト
//		System.out.println("---------- update()のテスト ----------");
//		Users upRec = new Users("ya","pw","MEADO5@meado.jp");
//		if (dao.update(upRec)) {
//			System.out.println("更新成功！");
//			List<Users> member3 = dao.select("");
//			for (Users member : member3) {
//				System.out.println("User_auto_id：" + member.getUser_auto_id());
//				System.out.println("User_id：" + member.getUser_id());
//				System.out.println("User_pw：" + member.getUser_pw());
//				System.out.println("User_mail：" + member.getUser_mail());
//				System.out.println();
//			}
//		}
//		else {
//			System.out.println("更新失敗！");
//		}

		// update_pw()のテスト
				System.out.println("---------- update_pw()のテスト ----------");
				String user_id = "ya";
				String user_mail = "MEADO6@meado.jp";
				String user_pw = "ya";

				if (dao.update_pw(user_id,user_mail,user_pw)) {
					System.out.println("更新成功！");
				}
				else {
					System.out.println("更新失敗！");
				}



		// delete()のテスト
		System.out.println("---------- delete()のテスト ----------");
		if (dao.delete("ya")) {
			System.out.println("削除成功！");
			List<Users> member4 = dao.select("");
			for (Users member : member4) {
				System.out.println("User_auto_id：" + member.getUser_auto_id());
				System.out.println("User_id：" + member.getUser_id());
				System.out.println("User_pw：" + member.getUser_pw());
				System.out.println("User_mail：" + member.getUser_mail());
				System.out.println();
			}
		}
		else {
			System.out.println("削除失敗！");
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

