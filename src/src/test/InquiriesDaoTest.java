package test;

import java.util.List;

import dao.InquiriesDao;
import model.Inquiries;

public class InquiriesDaoTest {
	public static void main(String[] args) {
		InquiriesDao dao = new InquiriesDao();

		// selectのテスト
		System.out.println("---------- selectのテスト ----------");
		List<Inquiries> inquiriesList2 = dao.select("");
		for (Inquiries inquiry : inquiriesList2) {
//			System.out.println("inquiry_id：" + inquiry.getInquiry_id());
			System.out.println("user_id：" + inquiry.getUser_id());
			System.out.println("user_mail：" + inquiry.getUser_mail());
			System.out.println("inquiry_subject：" + inquiry.getInquiry_subject());
			System.out.println("inquiry_content：" + inquiry.getInquiry_content());
//			System.out.println("inquiry_status：" + inquiry.getInquiry_status());
//			System.out.println("inquiry_date：" + inquiry.getInquiry_date());
			System.out.println();
		}

		// insertのテスト
		System.out.println("---------- insertのテスト ----------");
		Inquiries insRec = new Inquiries(0,"yamada","mail@test","件名テスト0623","本文テスト",0,null);

		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
			List<Inquiries> inquiriesList3 = dao.select("0623");
			for (Inquiries inquiry : inquiriesList3) {
				System.out.println("inquiry_id：" + inquiry.getInquiry_id());
				System.out.println("user_id：" + inquiry.getUser_id());
				System.out.println("user_mail：" + inquiry.getUser_mail());
				System.out.println("inquiry_subject：" + inquiry.getInquiry_subject());
				System.out.println("inquiry_content：" + inquiry.getInquiry_content());
				System.out.println("inquiry_status：" + inquiry.getInquiry_status());
				System.out.println("inquiry_date：" + inquiry.getInquiry_date());
			}
		}
		else {
			System.out.println("登録失敗！");
		}

		// updateのテスト
		System.out.println("---------- updateのテスト ----------");
		int inquiry_status =2;
		int inquiry_id = 4;

		if (dao.update(inquiry_status,inquiry_id)) {
			System.out.println("ステータス更新成功！");
			List<Inquiries> inquiriesList4 = dao.select("1");
			for (Inquiries inquiry : inquiriesList4) {
				System.out.println("inquiry_id：" + inquiry.getInquiry_id());
				System.out.println("user_id：" + inquiry.getUser_id());
				System.out.println("user_mail：" + inquiry.getUser_mail());
				System.out.println("inquiry_subject：" + inquiry.getInquiry_subject());
				System.out.println("inquiry_content：" + inquiry.getInquiry_content());
				System.out.println("inquiry_status：" + inquiry.getInquiry_status());
				System.out.println("inquiry_date：" + inquiry.getInquiry_date());
			}
		}
		else {
			System.out.println("ステータス更新失敗！");
		}
	}
}
