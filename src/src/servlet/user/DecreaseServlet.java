package servlet.user;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
import model.LoginUsers;


//担当：羽田
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
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
				HttpSession session = request.getSession();
				if (session.getAttribute("user_id") == null) {
					response.sendRedirect("/mecar/LoginServlet");
					return;

				}

				//インスタンスを取り出す
				LoginUsers sessionuser_id = (LoginUsers) session.getAttribute("user_id");
				//中身のuser_idを取得する
				String user_id = (String)sessionuser_id.getUser_id();

				//【保留】プルダウンのvalueを取得。ここでは仮名"pullNumberを使用した
				String pull =request.getParameter("pullNumber");


				// 減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				//もしサブミットで一斉減量が選択されたら
				if (request.getParameter("SUBMIT").equals("一斉減量")) {

					//プルダウンで自動が選択されていたら
					if(pull.equals("自動更新")) {bDao.decreaseALL(user_id);
					}


					else if(pull.equals("1日")) {

						int num = 0;
						while (num < 1){
							bDao.decrease(user_id);
							num++;
						}
					}else if(pull.equals("2日")) {
						int num = 0;
						while (num < 2){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull.equals("3日")) {
						int num = 0;
						while (num < 3){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull.equals("1週間")) {
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


