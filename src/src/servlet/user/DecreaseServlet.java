package servlet.user;

//担当：羽田

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
import dao.UsersDao;
import model.LoginUsers;


/**
 * Servlet implementation class DecreaseServlet
*/



@WebServlet("/DecreaseServlet")
public class DecreaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DecreaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


//メニューから、一斉減量サーブレットを呼び出す


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
				HttpSession session = request.getSession();


				//インスタンスを取り出す
				LoginUsers sessionuser_id = (LoginUsers) session.getAttribute("user_id");
				//中身のuser_idを取得する
				String user_id = (String)sessionuser_id.getUser_id();

				//プルダウンのvalueを取得。ここでは仮名"pullNumberを使用した
				String pullStr =request.getParameter("pullNumber");
				int pull = Integer.parseInt(pullStr);

				//自動減量用
				//現在日時を取得

				UsersDao aDao = new UsersDao();
						Date nowDate = new Date();
						Date userDate = aDao.getDate(user_id);




						long daysLong = (nowDate.getTime() - userDate.getTime()) * (24 * 60 * 60 * 1000);
						int decDay = (int)daysLong;
						System.out.println("日数：" + decDay);


						// 経過日数の計算
//						currentDate.
//						long daysLong = ChronoUnit.DAYS.between(userDate,currentDate);
//						int decDay = (int)daysLong;





				//減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				//もしサブミットで一斉減量が選択されたら
				if (request.getParameter("submit").equals("一斉減量")) {

					//プルダウンで自動選択
					if(pull == 0) {
						bDao.decreaseALL(decDay,user_id);
					}

					//プルダウンで日数選択
					else if(pull == 1) {
						//1日
						int num = 0;
						while (num < 1){
							bDao.decrease(user_id);
							num++;
						}
					}else if(pull== 2) {
						//2日
						int num = 0;
						while (num < 2){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull== 3) {
						//3日
						int num = 0;
						while (num < 3){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull== 4) {
						//1週間
						int num = 0;
						while (num < 7){
							bDao.decrease(user_id);
							num++;
								}


					}

				}


				// java.util.Dateを取得
			    java.util.Date javaDate = new java.util.Date();

			    // java.util.Dateをjava.sql.Dateに変換
			    Date sqlDate = new Date(javaDate.getTime());

			  //user_dateを現在の日付でアップデート
			    UsersDao upDao = new UsersDao();
			    upDao.update_date(sqlDate,user_id);




				// メニューサーブレットにリダイレクト
				response.sendRedirect("/mecar/MenuServlet");



}

/*
	private Date getDate(String user_id) {


		Connection conn = null;
		Date user_date = null;
		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/EM", "C5", "mecar");

			// SELECT文を準備する
			String sql3 = "select USER_DATE from Users where USER_ID = ?";
			PreparedStatement pStmt3 = conn.prepareStatement(sql3);

			//SQL文を完成させる。
			pStmt3.setString(1, user_id);

			//SQL文を実行する
			ResultSet rs3 = pStmt3.executeQuery();

			rs3.next();
			user_date = rs3.getDate("user_date");
		}

		  // 全ての例外を受け取る
	    catch(Exception e){
				e.printStackTrace();
//				data = null;
	    }

		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
//					data = null;
				}
			}
		}
		// 結果を返す
		return user_date;
	}
*/


}


