package servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDao;
import model.Users;

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
		//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/mecar/LoginAdminServlet");
			return;
		}

		//空文字でデータを入力する。カードリスト2とか
		UsersDao aUsers = new UsersDao();

		//クラス名	    変数名     =  代入する値;
		List<Users> cardList2 = aUsers.select("");


		// 検索結果をリクエストスコープに格納する。
		request.setAttribute("cardList2" , cardList2);
		// ユーザー一覧画面にフォワードする。
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/users_list.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ユーザーリザルトjspにフォワードする


		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String keyWord = request.getParameter("keyWord");

		UsersDao aUsers = new UsersDao();

		//クラス名	    変数名     =  代入する値;
		List<Users> cardList = aUsers.select(keyWord);
		// 検索結果をリクエストスコープに格納する。
		request.setAttribute("cardList" , cardList);
		// 結果ページにフォワードする。
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/users_result.jsp");
		dispatcher.forward(request, response);
	}
}
