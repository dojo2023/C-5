package servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDao;
import model.Users;

/**
 * Servlet implementation class RegistUserServlet
 */
@WebServlet("/RegistUserServlet")
public class RegistUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//新規登録ページにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
		dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
//		String user_auto_id = request.getParameter("user_auto_id");
		String user_id = request.getParameter("ID");
		String user_pw = request.getParameter("PW");
		String user_mail = request.getParameter("MAIL");
		// 登録処理を行う
		UsersDao bDao = new UsersDao();
		if (bDao.insert(new Users(user_id,user_pw,user_mail))) {	// 登録成功
			request.setAttribute("result",
			new Users("登録成功！", "会員登録しました。","/mecar/RegistUserServlet"));

			// ログインサーブレットにリダイレクトする
			response.sendRedirect("/mecar/LoginServlet");
		}
		else {												// 登録失敗
			request.setAttribute("result",
			new Users("登録失敗！", "会員登録できませんでした。","/mecar/RegistUserServlet"));
		}


	}

}
