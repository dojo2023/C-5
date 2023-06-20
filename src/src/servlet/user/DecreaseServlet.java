package servlet.user;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
import model.Items;
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


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//メニュー画面にフォワ―ドする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
				dispatcher.forward(request, response);
				}


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

				//プルダウンのvalueを取得。ここでは仮名"pullNumberを使用した


				// 減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				//もしサブミットで一斉減量が選択されたら
				if (request.getParameter("SUBMIT").equals("一斉減量")) {
					//もしプルダウンで自動が選択されていたら
					if(request.getParameter("pullNumber").equals("auto")) {bDao.decreaseALL(new Items(0, user_id, "", "",0,0,0,0,0.0));
					}
					else {
				//【保留】プルダウンの仕様待ち
				//プルダウンの数字の文だけ繰り返す？
						bDao.decrease(new Items(0, user_id, "", "",0,0,0,0,0.0));

					}
				}


				//
				//List<Items> cardList = bDao.decreaseALL(new Items(0, user_id, "", "",0,0,0,0,0.0));



				// メニューページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
				dispatcher.forward(request, response);



	}

}
