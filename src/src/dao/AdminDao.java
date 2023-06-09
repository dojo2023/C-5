package dao;
//ここから追記
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;






	//ここからログイン処理の編集


	public class AdminDao {
		// ログインできるならtrueを返す
		public boolean isLoginOK(Admin admin) {
			Connection conn = null;
			boolean loginResult = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SELECT文を準備する
				String sql = "select count(*) from Admin where admin_id = ? and admin_pw = ? ";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setString(1, admin.getId());
				pStmt.setString(2,admin.getPw());

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


	}
	//public boolean isLokingOK(Admin admin) {
	//	boolean loginResult = false;
	//	return loginResult;
//	}


	//ログイン処理の編集ここまで

