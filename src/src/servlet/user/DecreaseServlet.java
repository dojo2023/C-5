package servlet.user;

/*
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BcDAO;
import dao.ItemsDao;
import model.Bc;
import model.Items;
import model.Result;
//担当：羽田
/**
 * Servlet implementation class DecreaseServlet

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

				//user_idを取得する
				String user_id = (String) session.getAttribute("user_id");


				// 減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				if (request.getParameter("SUBMIT").equals("一斉減量")) {
					bDao.decreaseALL(new Items(0, user_id, "", "",0,0,0,0,0.0)}
				else if




				//
				//List<Items> cardList = bDao.decreaseALL(new Items(0, user_id, "", "",0,0,0,0,0.0));





				// 検索結果をリクエストスコープに格納する
				//request.setAttribute("データ名", 登録するデータ);
				//cardListはDAOで名前がつけられている
				request.setAttribute("cardList", cardList);

				// メニューページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search_result.jsp");
				dispatcher.forward(request, response);



	}

}*/
