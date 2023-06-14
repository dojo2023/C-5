package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Inquiries;

public class InquiriesDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Inquiries> select(Inquiries param) {
	  Connection conn = null;
	  List<Inquiries> inquiriesList = new ArrayList<Inquiries>();

	  try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			String sql = "select * from Inquiries WHERE inquiry_id LIKE ? OR user_id LIKE ? ORDER BY inquiry_id";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (param.getInquiry_id() != null) {
				pStmt.setString(1, "%" + param.getInquiry_id() + "%");
			}
			else {
				pStmt.setString(1, "%");
			}
			if (param.getUser_id() != null) {
				pStmt.setString(2, "%" + param.getUser_id() + "%");
			}
			else {
				pStmt.setString(2, "%");
			}
			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Inquiries inquiries = new Inquiries(
				rs.getString("inquiry_id"),
				rs.getString("user_id"),
				rs.getString("inquiry_subject"),
				rs.getString("inquiry_content"),
				rs.getString("inquiry_status"),
				rs.getString("inquiry_date")
				);
				inquiriesList.add(inquiries);
	     }
	}

	  // 全ての例外を受け取る
	  catch(Exception e){
			e.printStackTrace();
			inquiriesList = null;
	  }
	  finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
					inquiriesList = null;
	            }
			}
      }
	  // 結果を返す
	  return inquiriesList;
    }

//		キーワード検索
	public List<Inquiries> select(String keyWord) {
		Connection conn = null;
		List<Inquiries> inquiriesList = new ArrayList<Inquiries>();

		if(keyWord==null) {
			keyWord = "";
		}
		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			String sql = "select * from Inquiries WHERE inquiry_id LIKE ? "
					+ "OR user_id LIKE ? "
					+ "OR inquiry_subject LIKE ? "
					+ "OR inquiry_content LIKE ? "
					+ "OR inquiry_status LIKE ? "
					+ "OR inquiry_date LIKE ? ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, "%" + keyWord+ "%");
			pStmt.setString(2, "%" + keyWord+ "%");
			pStmt.setString(3, "%" + keyWord+ "%");
			pStmt.setString(4, "%" + keyWord+ "%");
			pStmt.setString(5, "%" + keyWord+ "%");
			pStmt.setString(6, "%" + keyWord+ "%");

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Inquiries inquiries = new Inquiries(
				rs.getString("inquiry_id"),
				rs.getString("user_id"),
				rs.getString("inquiry_subject"),
				rs.getString("inquiry_content"),
				rs.getString("inquiry_status"),
				rs.getString("inquiry_date")
				);
				inquiriesList.add(inquiries);
			}
	}

		  // 全ての例外を受け取る
	    catch(Exception e){
				e.printStackTrace();
				inquiriesList = null;
	    }

		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
					inquiriesList = null;
				}
			}
		}
		// 結果を返す
		return inquiriesList;
    }

//		お問い合わせの登録
	// 引数inquiryで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Inquiries inquiry) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			String sql = "insert into BC values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (inquiry.getInquiry_id() != null && !inquiry.getInquiry_id().equals("")) {
				pStmt.setString(1, inquiry.getInquiry_id());
			}
			else {
				pStmt.setString(1, null);
			}
			if (inquiry.getUser_id() != null && !inquiry.getUser_id().equals("")) {
				pStmt.setString(2, inquiry.getUser_id());
			}
			else {
				pStmt.setString(2, null);
			}
			if (inquiry.getInquiry_subject() != null && !inquiry.getInquiry_subject().equals("")) {
				pStmt.setString(3, inquiry.getInquiry_subject());
			}
			else {
				pStmt.setString(3, null);
			}
			if (inquiry.getInquiry_content() != null && !inquiry.getInquiry_content().equals("")) {
				pStmt.setString(4, inquiry.getInquiry_content());
			}
			else {
				pStmt.setString(4, null);
			}
			if (inquiry.getInquiry_status() != null && !inquiry.getInquiry_status().equals("")) {
				pStmt.setString(5, inquiry.getInquiry_status());
			}
			else {
				pStmt.setString(5, null);
			}
			if (inquiry.getInquiry_date() != null && !inquiry.getInquiry_date().equals("")) {
				pStmt.setString(6, inquiry.getInquiry_date());
			}
			else {
				pStmt.setString(6, null);
			}
	    }
		// 全ての例外を受け取る
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	// 結果を返す
	return result;
	}
}
