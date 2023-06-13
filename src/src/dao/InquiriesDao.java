package dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import model.Inquiries;

public class InquiriesDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Inquiries> select(Inquiries param) {
	Connection conn = null;
	List<Inquiries> inqueriesList = new ArrayList<Inquiries>();
	}
}
