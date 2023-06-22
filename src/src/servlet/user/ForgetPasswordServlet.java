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
 * Servlet implementation class ForgetPasswordServlet
 */
@WebServlet("/ForgetPasswordServlet")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//パスワード再登録ページにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/forget.jsp");
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
		String user_mail = request.getParameter("MAIL");
		String user_pw = request.getParameter("PW");
		// 更新処理を行う
		UsersDao bDao = new UsersDao();
		if (request.getParameter("SUBMIT").equals("確定")) {
			if (bDao.update_pw(user_pw,user_id,user_mail)) {	// 更新成功
				request.setAttribute("result",
				new Users("更新成功！", "レコードを更新しました。", "/mecar/ForgetPasswordServlet"));
			}
			else {												// 更新失敗
				request.setAttribute("result",
				new Users("更新失敗！", "レコードを更新できませんでした。", "/mecar/ForgetPasswordServlet"));
			}
		}

	}

}
