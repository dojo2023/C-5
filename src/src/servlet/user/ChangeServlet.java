package servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		//文字コードの指定
		request.setCharacterEncoding("UTF-8");


		System.out.println(request.getParameter("BUTTON"));
		//登録変更ページにフォワ―ドする
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// リクエストパラメータを取得する
//		request.setCharacterEncoding("UTF-8");
//		String user_id = request.getParameter("USER_ID");
//		String user_pw = request.getParameter("USER_PW");
////		String user_mail = request.getParameter("USER_MAIL");
//
//		// ログイン処理を行う
//		UsersDao iDao = new UsersDao();
//		if (iDao.isLoginOK(new Users(user_id, user_pw))) {	// ログイン成功
//
//			//UsersDaoにユーザーidを指定してメールアドレスを取得するメソッドを呼び出す。
//			String user_mail = iDao.getMail(user_id) ;
//
//			// セッションスコープにIDを格納する
//			HttpSession session = request.getSession();
//			session.setAttribute("user_id", new LoginUsers(user_id, user_mail));
//
//			// メニューサーブレットにリダイレクトする
//			response.sendRedirect("/mecar/MenuServlet");
//		}
//		else {									// ログイン失敗
//			  // ログインにフォワードする。
//			  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/change_password.jsp");
//			  dispatcher.forward(request, response);
//		}
	}

}
