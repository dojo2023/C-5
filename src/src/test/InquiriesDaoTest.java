package test;

import java.util.List;

import dao.InquiriesDao;
import model.Inquiries;

public class InquiriesDaoTest {
	public static void main(String[] args) {
		InquiriesDao dao = new InquiriesDao();

		// selectのテスト
		System.out.println("---------- selectのテスト ----------");
		List<Inquiries> inquiriesList2 = dao.select(new Inquiries());
		for (Inquiries inquiry : inquiriesList2) {
//			System.out.println("inquiry_id：" + inquiry.getInquiry_id());
			System.out.println("user_id：" + inquiry.getUser_id());
			System.out.println("inquiry_subject：" + inquiry.getInquiry_subject());
			System.out.println("inquiry_content：" + inquiry.getInquiry_content());
			System.out.println("inquiry_status：" + inquiry.getInquiry_status());
			System.out.println("inquiry_date：" + inquiry.getInquiry_date());
			System.out.println();
		}

		// insertのテスト
		System.out.println("---------- insertのテスト ----------");
		Inquiries insRec = new Inquiries("test","件名テスト","本文テスト","test","test");

		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
			List<Inquiries> inquiriesList3 = dao.select(insRec);
			for (Inquiries inquiry : inquiriesList3) {
//				System.out.println("inquiry_id：" + inquiry.getInquiry_id());
				System.out.println("user_id：" + inquiry.getUser_id());
				System.out.println("inquiry_subject：" + inquiry.getInquiry_subject());
				System.out.println("inquiry_content：" + inquiry.getInquiry_content());
				System.out.println("inquiry_status：" + inquiry.getInquiry_status());
				System.out.println("inquiry_date：" + inquiry.getInquiry_date());
			}
		}
		else {
			System.out.println("登録失敗！");
		}
	}
}
