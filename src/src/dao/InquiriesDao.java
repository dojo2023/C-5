package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Inquiries;

public class InquiriesDao {

//		キーワード検索
	public List<Inquiries> select(String keyWord) {
		//[0]
		//[1,2]
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
			String sql = "select * from Inquiries LEFT OUTER JOIN users  ON users .user_id = inquiries .user_id "
					+ "WHERE Inquiries.user_id LIKE ? "
					+ "OR user_mail LIKE ?"
					+ "OR inquiry_subject LIKE ? "
					+ "OR inquiry_content LIKE ? ";
//					+ "OR inquiry_status LIKE ? "
//					+ "OR inquiry_date LIKE ? ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, "%" + keyWord+ "%");
			pStmt.setString(2, "%" + keyWord+ "%");
			pStmt.setString(3, "%" + keyWord+ "%");
			pStmt.setString(4, "%" + keyWord+ "%");
//			pStmt.setString(5, "%" + keyWord+ "%");
//			pStmt.setString(6, "%" + keyWord+ "%");

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Inquiries inquiries = new Inquiries(
				rs.getInt("inquiry_id"),
				rs.getString("inquiries.user_id"),
				rs.getString("user_mail"),
				rs.getString("inquiry_subject"),
				rs.getString("inquiry_content"),
				rs.getInt("inquiry_status"),
				rs.getDate("inquiry_date")
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
			String sql = "insert into Inquiries  values (null, ?, ?, ?, 0, CURRENT_DATE)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (inquiry.getUser_id() != null && !inquiry.getUser_id().equals("")) {
				pStmt.setString(1, inquiry.getUser_id());
			}
			else {
				pStmt.setString(1, null);
			}
			if (inquiry.getInquiry_subject() != null && !inquiry.getInquiry_subject().equals("")) {
				pStmt.setString(2, inquiry.getInquiry_subject());
			}
			else {
				pStmt.setString(2, null);
			}
			if (inquiry.getInquiry_content() != null && !inquiry.getInquiry_content().equals("")) {
				pStmt.setString(3, inquiry.getInquiry_content());
			}
			else {
				pStmt.setString(3, null);
			}
			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
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

	// 対応ステータスの更新
		// 引数inquiryで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(int inquiry_status,int inquiry_id) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			String sql = "update Inquiries "
					+ "set inquiry_status=? "
					+ "where inquiry_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, inquiry_status);
			pStmt.setInt(2, inquiry_id);

			// SQL文を実行する
//			if (pStmt.executeUpdate() == 1) {
//				result = true;
//			}
			pStmt.executeUpdate();
			result = true;
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


