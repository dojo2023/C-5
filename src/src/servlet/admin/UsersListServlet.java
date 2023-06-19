package servlet.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDao;

/**
 * Servlet implementation class UsersListServlet
 */
@WebServlet("/UsersListServlet")
public class UsersListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// ユーザー一覧画面にフォワードする。
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/users_list.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ユーザーリザルトjspにフォワードする


			// もしもログインしていなかったらログインサーブレットにリダイレクトする
			//HttpSession session = request.getSession();
			//if (session.getAttribute("id") == null) {
			//response.sendRedirect("/mecar/LoginAdminServlet");
			//return;
			//}

			// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			String keyWord = request.getParameter("keyWord");

			//検索処理を行う
			UsersDao aUsers = new UsersDao();
//まだできてないから三宅君ができたらだす。			List<Users> cardList = aUsers.select(keyWord);
			// 検索結果をリクエストスコープに格納する。
//まだできてないから三宅君ができたらだす。			request.setAttribute("cardList" , cardList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/users_result.jsp");
		dispatcher.forward(request, response);
	}
}
