package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Items;



public class ItemsDao {

	//select

	public List<Items> select(Items param) {
		Connection conn = null;
		List<Items> cardList = new ArrayList<Items>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する。追加する
			//slectするのは、結果表にコピーする内容。
			String sql = "select * from Items WHERE item_name LIKE ? ORDER BY item_meter ASC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる。追加する
			if (param.getItem_name() != null) {
				pStmt.setString(1, "%" + param.getItem_name() + "%");
			}
			else {
				pStmt.setString(1, "%");
			}


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Items card = new Items(
				rs.getInt("item_id"),
				rs.getString("user_id"),
				rs.getString("item_name"),
				rs.getString("item_url"),
				rs.getInt("item_price"),
				rs.getInt("item_category"),
				rs.getInt("frequency_purchase"),
				rs.getInt("item_switch"),
				rs.getDouble("item_meter")
				);
				cardList.add(card);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			cardList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			cardList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					cardList = null;
				}
			}
		}

		// 結果を返す
		return cardList;
	}

	//insert
	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Items card) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する
				String sql = "insert into items values (null, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる

					pStmt.setString(1, card.getUser_id());


					pStmt.setString(2, card.getItem_name());

					pStmt.setString(3, card.getItem_url());


				if (card.getItem_price()!=0) {
					//もしitem_priceが0でない（入力データが０なのはあり得ないが）なら
					//4番目の？に入力されたデータを入れる
					pStmt.setInt(4, card.getItem_price());
				}
				else {
					pStmt.setInt(4, 0);
				}

				pStmt.setInt(5, card.getItem_category());

				pStmt.setInt(6, card.getFrequency_purchase() );

				pStmt.setInt(7, card.getItem_switch());

				pStmt.setDouble(8, card.getItem_meter());



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

	//update
		public boolean update(Items card) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");
				// SQL文を準備する
							String sql = "update Items set   item_name =?, item_url =?, item_price =?, item_category =?, frequency_purchase =?, item_switch =?, item_meter =? where item_id=?";
							PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる


							if (card.getItem_name() != null && !card.getItem_name().equals("")) {
								pStmt.setString(1, card.getItem_name());
							}
							else {
								pStmt.setString(1, null);
							}


							if (card.getItem_url() != null && !card.getItem_url().equals("")) {
								pStmt.setString(2, card.getItem_url());
							}
							else {
								pStmt.setString(2, null);
							}


							if (card.getItem_price() != 0 ) {
								pStmt.setInt(3, card.getItem_price());
							}
							else {
								pStmt.setInt(3, 0);
							}


							if (card.getItem_category() != 0) {
								pStmt.setInt(4, card.getItem_category());
							}
							else {
								pStmt.setInt(4, 0);
							}


							if (card.getFrequency_purchase() != 0) {
								pStmt.setInt(5, card.getFrequency_purchase());
							}
							else {
								pStmt.setInt(5, 3);
							}


							if (card.getItem_switch() != 0) {
								pStmt.setInt(6, card.getItem_switch());
							}
							else {
								pStmt.setInt(6, 0);
							}


							if (card.getItem_meter() != 0) {
								pStmt.setDouble(7, card.getItem_meter());
							}
							else {
								pStmt.setDouble(7, 0);
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

//delete
		// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
		public boolean delete(String number) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する
				String sql = "delete from Items where item_id=?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				pStmt.setString(1, number);

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
