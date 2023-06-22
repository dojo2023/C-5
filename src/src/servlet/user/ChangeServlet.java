package servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangeServlet
 */
@WebServlet("/ChangeServlet")
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//文字コードの指定
		request.setCharacterEncoding("UTF-8");

		//テスト用
		System.out.println(request.getParameter("BUTTON"));

		//登録変更ページにフォワ―ドする（分岐）
		//パスワード変更
		if (request.getParameter("BUTTON").equals("パスワード変更")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/change_password.jsp");
			dispatcher.forward(request, response);
		}
		//メールアドレス変更
		else if (request.getParameter("BUTTON").equals("メールアドレス変更")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/change_mail.jsp");
			dispatcher.forward(request, response);
		}
	}

}
