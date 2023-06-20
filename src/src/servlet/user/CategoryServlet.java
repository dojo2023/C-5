package servlet.user;

import java.io.IOException;
import java.util.List;

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

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
		}

		//セッションスコープからインスタンスを取得する（ユーザーIDを取得する準備）
		LoginUsers user_id = (LoginUsers) session.getAttribute("user_id");

		//選択されたカテゴリ別にselectCateメソッドを起動する
		ItemsDao iDao = new ItemsDao();
		if (request.getParameter("submit").equals("一覧")) {
			//検索処理を行う
			List<Items> cardList3 = iDao.select("", user_id.getUser_id());

			//検索結果をリクエストスコープに格納する
			request.setAttribute("cardList3", cardList3);
		}
		else if (request.getParameter("submit").equals("食料品")) {
			List<Items> cardList3 = iDao.selectCate(1, user_id.getUser_id());
			request.setAttribute("cardList3", cardList3);
		}
		else if (request.getParameter("submit").equals("日用品")) {
			List<Items> cardList3 = iDao.selectCate(2, user_id.getUser_id());
			request.setAttribute("cardList3", cardList3);
		}
		else if (request.getParameter("submit").equals("ケア用品")) {
			List<Items> cardList3 = iDao.selectCate(3, user_id.getUser_id());
			request.setAttribute("cardList3", cardList3);
		}
		else if (request.getParameter("submit").equals("その他")) {
			List<Items> cardList3 = iDao.selectCate(4, user_id.getUser_id());
			request.setAttribute("cardList3", cardList3);
		}

		//カテゴリ検索結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/category_result.jsp");
		dispatcher.forward(request, response);
	}

}
