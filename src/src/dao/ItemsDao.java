package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Items;



public class ItemsDao {

	//select



	//insert
	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
		public boolean insert(Items card) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("jdbc:h2:file:C:/pleiades/workspace/data/EM");

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
							String sql = "update Items set  item_id=?, ADDRESS=?, COMPANY_NAME=?, DEPARTMENT_NAME=?, POST_NAME=?, ZIP_CODE=?,TEL=?, EMAIL=?, REMAKES=? , BOOKMARK=? where NUMBER=?";
							PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる


							if (card.getName() != null && !card.getName().equals("")) {
								pStmt.setString(1, card.getName());
							}
							else {
								pStmt.setString(1, null);
							}


							if (card.getAddress() != null && !card.getAddress().equals("")) {
								pStmt.setString(2, card.getAddress());
							}
							else {
								pStmt.setString(2, null);
							}


							if (card.getCompany_name() != null && !card.getCompany_name().equals("")) {
								pStmt.setString(3, card.getCompany_name());
							}
							else {
								pStmt.setString(3, null);
							}


							if (card.getDepartment_name() != null && !card.getDepartment_name().equals("")) {
								pStmt.setString(4, card.getDepartment_name());
							}
							else {
								pStmt.setString(4, null);
							}


							if (card.getPost_name() != null && !card.getPost_name().equals("")) {
								pStmt.setString(5, card.getPost_name());
							}
							else {
								pStmt.setString(5, null);
							}


							if (card.getZip_code() != null && !card.getZip_code().equals("")) {
								pStmt.setString(6, card.getZip_code());
							}
							else {
								pStmt.setString(6, null);
							}


							if (card.getTel() != null && !card.getTel().equals("")) {
								pStmt.setString(7, card.getTel());
							}
							else {
								pStmt.setString(7, null);
							}


							if (card.getEmail() != null && !card.getEmail().equals("")) {
								pStmt.setString(8, card.getEmail());
							}
							else {
								pStmt.setString(8, null);
							}


							if (card.getRemakes() != null && !card.getRemakes().equals("")) {
								pStmt.setString(9, card.getRemakes());
							}
							else {
								pStmt.setString(9, null);
							}


							if (card.getBookmark() != null && !card.getBookmark().equals("")) {
								pStmt.setString(10, card.getBookmark());
							}
							else {
								pStmt.setString(10, null);
							}

							pStmt.setString(11, card.getNumber());



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
