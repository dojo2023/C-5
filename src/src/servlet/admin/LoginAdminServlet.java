package servlet.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDao;
import model.Admin;

/**
 * Servlet implementation class LoginAdminServlet
 */
@WebServlet("/LoginAdminServlet")
public class LoginAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    //ログイン処理の編集まだできるかわからない。ここから

    //dopostが二つあるから後で一つにまとめる。
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		// もしもログインしていなかったらインクエリリストサーブレットにリダイレクトする
		  HttpSession session = request.getSession();
		  if (session.getAttribute("id") == null) {
		  response.sendRedirect("/mecar/InquiryListServlet");
		  return;
		  }

		// ログイン処理を行う
		AdminDao iDao = new AdminDao();
		if (iDao.isLokingOK(new Admin(id, pw))) {	// ログイン成功
			// セッションスコープにIDを格納する
			HttpSession session1 = request.getSession();
			session1.setAttribute("id", new Admin(id, pw));
		}
	}



    //ログイン処理の編集の続きここまで。
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // 管理者ログインにフォワードする。
  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login_admin.jsp");
  dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	//一旦コメントアウトしとく
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// もしもログインしていなかったらインクエリリストサーブレットにリダイレクトする
	  HttpSession session = request.getSession();
	  if (session.getAttribute("id") == null) {
	  response.sendRedirect("/mecar/InquiryListServlet");
	  return;
	  }
	}
	*/


}