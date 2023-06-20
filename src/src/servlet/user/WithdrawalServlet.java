package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDao;

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

		request.setCharacterEncoding("UTF-8");
		String ID = "${user_id.user_id}";
		//削除する
		UsersDao uDao = new UsersDao();
		if (uDao.delete(ID)) {	// 削除成功
			del = "削除成功！";
		}
		else {						// 削除失敗
			del = "削除失敗！";
		}

		// テスト用出力
		System.out.println(del);


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
