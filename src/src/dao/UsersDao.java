package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Users;
public class UsersDao {
	// ログインできるならtrueを返す
		public boolean isLoginOK(Users users) {
			Connection conn = null;
			boolean loginResult = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SELECT文を準備する
				String sql = "select count(*) from Users where USER_ID = ? and USER_PW = ?";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setString(1, users.getUser_id());
				pStmt.setString(2,users.getUser_pw());

				// SELECT文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();

				// ユーザーIDとパスワードが一致するユーザーがいたかどうかをチェックする
				rs.next();
				if (rs.getInt("count(*)") == 1) {
					loginResult = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				loginResult = false;
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
				loginResult = false;
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
						loginResult = false;
					}
				}
			}

			// 結果を返す
			return loginResult;
		}






//		キーワード検索
	public List<Users> select(String keyWord) {
		//[0]
		//[1,2]
		Connection conn = null;
		List<Users> usersList = new ArrayList<Users>();

		if(keyWord==null) {
			keyWord = "";
		}
		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			String sql = "select * from Users WHERE user_id LIKE ? OR user_mail LIKE ? ORDER BY user_id";

			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, "%" + keyWord+ "%");
			pStmt.setString(2, "%" + keyWord+ "%");
//			pStmt.setString(3, "%" + keyWord+ "%");
//			pStmt.setString(4, "%" + keyWord+ "%");
//			pStmt.setString(5, "%" + keyWord+ "%");
//			pStmt.setString(6, "%" + keyWord+ "%");

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Users users = new Users(
				rs.getString("user_id"),
				rs.getString("user_mail")
				);
				usersList.add(users);
			}
	}

		  // 全ての例外を受け取る
	    catch(Exception e){
				e.printStackTrace();
				usersList = null;
	    }

		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
					usersList = null;
				}
			}
		}
		// 結果を返す
		return usersList;
    }


		// 引数memberで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Users member) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する
				String sql = "insert into USERS values (null, ?, ?, ?, null)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
//				if (member.getUser_auto_id() != null && !member.getUser_auto_id().equals("")) {
//					pStmt.setString(1, member.getUser_auto_id());
//				}
//				else {
//					pStmt.setString(1, null);
//				}

				if (member.getUser_id() != null && !member.getUser_id().equals("")) {
					pStmt.setString(1, member.getUser_id());
				}
				else {
					pStmt.setString(1, null);
				}

				if (member.getUser_pw() != null && !member.getUser_pw().equals("")) {
					pStmt.setString(2, member.getUser_pw());
				}
				else {
					pStmt.setString(2, null);
				}

				if (member.getUser_mail() != null && !member.getUser_mail().equals("")) {
					pStmt.setString(3, member.getUser_mail());
				}
				else {
					pStmt.setString(3, null);
				}

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 結果を返す
			return result;
		}


		// 引数cardで指定されたレコードを更新し、成功したらtrueを返す
		public boolean update(Users member) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する
				String sql = "update Users set user_pw=?, user_mail=? where user_auto_id=?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (member.getUser_pw() != null && !member.getUser_pw().equals("")) {
					pStmt.setString(1, member.getUser_pw());
				}
				else {
					pStmt.setString(1, null);
				}

				if (member.getUser_mail() != null && !member.getUser_mail().equals("")) {
					pStmt.setString(2, member.getUser_mail());
				}
				else {
					pStmt.setString(2, null);
				}

				pStmt.setInt(3, member.getUser_auto_id());

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 結果を返す
			return result;
		}

		// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
		public boolean delete(int user_auto_id) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する
				String sql = "delete from Users where user_auto_id =?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				pStmt.setInt(1,user_auto_id);

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				// データベースを切断
				if (conn != null) {
					try {
						conn.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 結果を返す
			return result;
		}

}
