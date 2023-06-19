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

/**
 * Servlet implementation class SearchItemServlet
 */
@WebServlet("/SearchItemServlet")
public class SearchItemServlet extends HttpServlet {
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

		//リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String keyWord = request.getParameter("item_name");

		//検索処理を行う
		ItemsDao iDao = new ItemsDao();
		List<Items> cardList = iDao.select(keyWord);

		//検索結果をリクエストスコープに格納する。
		request.setAttribute("cardList", cardList);

		//結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search_result.jsp");
		dispatcher.forward(request, response);
	}

}
