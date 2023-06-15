package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.History;

public class HistoryDao {
	//引数historyで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(History history) {
		Connection conn = null;
		boolean result = false;

		try {
			//JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			//データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			//SQL文を準備する
			String sql = "insert into history values (null, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SQL文を完成させる
			if (history.getItem_id() != 0) {
				pStmt.setInt(1, history.getItem_id());
			}
			else {
				pStmt.setInt(1, 0);
			}
			if (history.getHistory_date() != null && !history.getHistory_date().equals("")) {
				pStmt.setDate(2, history.getHistory_date());
			}
			else {
				pStmt.setDate(2, null);
			}

			//SQL文を実行する
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
			//データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
