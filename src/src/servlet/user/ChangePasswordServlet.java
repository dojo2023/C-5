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
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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

		String test = "出来ないなあ";

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("USER_ID");
		String user_pw = request.getParameter("USER_PW");

		// IDとPWの一致確認を行う
		UsersDao iDao = new UsersDao();
		if (iDao.isLoginOK(new Users(user_id, user_pw))) {	// ログイン成功

			// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			user_id = request.getParameter("USER_ID");
			user_pw = request.getParameter("USER_NEWPW");
			String user_mail = request.getParameter("USER_MAIL");
			String pw = request.getParameter("PW");

			// 更新
				// 更新成功
				if (iDao.update(new Users(user_id, user_pw,user_mail))) {
					test = "更新成功";
				}
				// 更新失敗
				else {
					test = "更新失敗";
				}

			// テスト
			System.out.println(test);
			System.out.println(user_id);
			System.out.println(user_pw);
			System.out.println(user_mail);
			System.out.println(pw);

			// メニューサーブレットにリダイレクトする
			response.sendRedirect("/mecar/MenuServlet");
		}

		// ID or PASSが違う
		else {
			  // 元のページにフォワードする。
			  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/change_password.jsp");
			  dispatcher.forward(request, response);
		}
	}
}
