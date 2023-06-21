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
	//selectCate
	//カテゴリー別表示用
	public List<Items> selectCate(int item_category, String user_id) {
		Connection conn = null;
		List<Items> cardList = new ArrayList<Items>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する。追加する
			//slectするのは、結果表にコピーする内容。
			String sql = "select * from Items  WHERE item_category = ? and user_id = ? ORDER BY item_meter ASC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる。追加する
			pStmt.setInt(1, item_category );
			pStmt.setString(2, user_id);

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


	//decreaseALL
	//一斉減量
	//これは１日分減らす処理なので、サーブレットで日数分繰り返してほしい
	//引数pdecで指定されたレコードを登録し、成功したらtrueを返す
	public boolean decreaseALL(String user_id) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			//item_meter = item_meter - 100/日数
			//item_meter = item_meter - (サブクエリで購入頻度の日数FREQUENCY_DAYSを呼び出し、100で除算）
			//整数/整数の除算は小数点がカットされてしまうため、cast(値 as REAL)で小数点を出す
			//最後にwhere USER_ID = ? and ITEM_SWITCH = 0で、ログインユーザーの商品かつ減量停止OFFの商品を出す

			String sql = "UPDATE ITEMS "
					+ "SET ITEMS.ITEM_METER = ITEMS.ITEM_METER - ( "
					+ "    SELECT  cast(100 as REAL)/cast(FREQUENCY_DAYS  as REAL) "
					+ "    FROM FREQUENCY "
					+ "    WHERE ITEMS.FREQUENCY_PURCHASE = FREQUENCY.FREQUENCY_PURCHASE) "
					+ "where  USER_ID  = ?  and ITEM_SWITCH = 0 ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1, user_id);

			// SQL文を実行する
//			if (pStmt.executeUpdate() == 1) {
//				result = true;
//			}
			pStmt.executeUpdate();
			result = true;
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


	//decrease
	//日数ごとの減量（ユーザーにプルダウンで選んでもらう）
	//引数pdecで指定されたレコードを登録し、成功したらtrueを返す
	public boolean decrease(String user_id) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する
			//item_meter = item_meter - 100/日数
			//整数/整数の除算は小数点がカットされてしまうため、cast(値 as REAL)で小数点を出す
			//最後にwhere USER_ID = ? and ITEM_SWITCH = 0で、ログインユーザーの商品かつ減量停止OFFの商品を出す

			String sql = "UPDATE ITEMS "
				+ "SET ITEMS.ITEM_METER = ITEMS.ITEM_METER - ( "
				+ "    SELECT  cast(100 as REAL)/cast(FREQUENCY_DAYS  as REAL) "
				+ "    FROM FREQUENCY "
				+ "    WHERE ITEMS.FREQUENCY_PURCHASE = FREQUENCY.FREQUENCY_PURCHASE) "
				+ "where  USER_ID  = ?  and ITEM_SWITCH = 0 ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setString(1,user_id);
			pStmt.setString(2,user_id);

			// SQL文を実行する
			pStmt.executeUpdate();
			result = true;
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


	//【保留】select
	public List<Items> select(String keyWord, String user_id) {
		Connection conn = null;
		List<Items> cardList = new ArrayList<Items>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SQL文を準備する。追加する
			//slectするのは、結果表にコピーする内容。
			String sql = "select * from Items  WHERE item_name LIKE ? and user_id = ? ORDER BY item_meter ASC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる。追加する
			pStmt.setString(1, "%" + keyWord + "%");
			pStmt.setString(2, user_id);

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
							pStmt.setInt(8, card.getItem_id());



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


	//updateSwitch
	//減量停止ボタン
		public boolean updateSwitch(int item_id,int item_switch) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");
				// SQL文を準備する
							String sql = "update Items set item_switch =? where item_id=?";
							PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる

					if(item_switch == 1) {
							pStmt.setInt(1, 0);}
					else if(item_switch == 0){
						pStmt.setInt(1, 1);}
							pStmt.setInt(2, item_id);

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

	//updateMater
	//リンク先で購入ボタンを押したときに、メーターに100を足すやつ
		public boolean updateMater(int item_id) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");
				// SQL文を準備する
							String sql = "update Items set item_meter = item_meter + 100 where item_id=?";
							PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
							pStmt.setInt(1, item_id);

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
		public boolean delete(int number) {
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
				pStmt.setInt(1, number);

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


	//selectsub
		//selectがkeyword用になったので、item用のselect

		public List<Items> selectsub(Items subcord) {
			Connection conn = null;
			List<Items> cardList = new ArrayList<Items>();

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

				// SQL文を準備する。追加する
				//slectするのは、結果表にコピーする内容。
				String sql = "select * from Items  WHERE item_name LIKE ?  and user_id = ? ORDER BY item_meter ASC";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる。追加する
				if (subcord.getItem_name() != null) {
					pStmt.setString(1, "%" + subcord.getItem_name() + "%");
				}
				else {
					pStmt.setString(1, "%");
				}

					pStmt.setString(2, subcord.getUser_id());





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






}
