package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDao;
import model.LoginUsers;

/**
 * Servlet implementation class WithdrawalServlet
 */
@WebServlet("/WithdrawalServlet")
public class WithdrawalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// テスト用変数
		String del = "出来ないなあ";

		// セッションスコープに接続
		HttpSession session = request.getSession();

		// 文字コード指定
		request.setCharacterEncoding("UTF-8");

		// セッションスコープからuser_idを取得
		LoginUsers user_id = (LoginUsers) session.getAttribute("user_id");

		//削除する
		UsersDao uDao = new UsersDao();

		//削除できているかテスト用
		// 削除成功
		if (uDao.delete(user_id.getUser_id())) {
			del = "削除成功！";
		}
		// 削除失敗
		else {
			del = "削除失敗！";
		}
		// テスト用出力
		System.out.println(del);
		System.out.println(user_id.getUser_id());


		//ログインサーブレットへリダイレクト
		response.sendRedirect("/mecar/LoginServlet");
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
