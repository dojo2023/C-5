package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
				String sql = "insert into USERS values (?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (member.getUser_auto_id() != null && !member.getUser_auto_id().equals("")) {
					pStmt.setString(1, member.getUser_auto_id());
				}
				else {
					pStmt.setString(1, null);
				}

				if (member.getUser_id() != null && !member.getUser_id().equals("")) {
					pStmt.setString(2, member.getUser_id());
				}
				else {
					pStmt.setString(2, null);
				}

				if (member.getUser_pw() != null && !member.getUser_pw().equals("")) {
					pStmt.setString(3, member.getUser_pw());
				}
				else {
					pStmt.setString(3, null);
				}

				if (member.getUser_mail() != null && !member.getUser_mail().equals("")) {
					pStmt.setString(4, member.getUser_mail());
				}
				else {
					pStmt.setString(4, null);
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
}
