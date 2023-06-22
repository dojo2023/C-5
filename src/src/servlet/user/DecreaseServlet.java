package servlet.user;

//担当：羽田

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
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

				//【保留】プルダウンのvalueを取得。ここでは仮名"pullNumberを使用した
				String pullStr =request.getParameter("pullNumber");
				int pull = Integer.parseInt(pullStr);

				//自動減量用
				//現在日時を取得

						LocalDate currentDate = LocalDate.now();

					/*
					// 指定の形式にフォーマット
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						String formattedDate = currentDate.format(formatter);

						*/

						//【保留】usersからselectしてuser_dateを出す
						Date user_date = null;

						//user_idはdata型なのでlocalDateに変換
				         LocalDate logDate = LocalDate.ofInstant(user_date.toInstant(), ZoneId.systemDefault());


						// 経過日数の計算
						long daysLong = ChronoUnit.DAYS.between(logDate,currentDate);
						int decDay = (int)daysLong;


			        /*DAO用
			    	pStmt.setInt(1, decDay);
					pStmt.setString(2, user_id);
					*/



				// 減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				//もしサブミットで一斉減量が選択されたら
				if (request.getParameter("submit").equals("一斉減量")) {

					//プルダウンで自動選択
					if(pull == 0) {bDao.decreaseALL(decDay,user_id);
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

				// メニューサーブレットにリダイレクト
				response.sendRedirect("/mecar/MenuServlet");



}

}


