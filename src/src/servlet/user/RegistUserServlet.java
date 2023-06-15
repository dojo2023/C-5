package servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BcDAO;
import model.Bc;
import model.Result;

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

	// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			String user_auto_id = request.getParameter("user_auto_id");
			String user_id = request.getParameter("user_id");
			String user_pw = request.getParameter("user_pw");
			String user_mail = request.getParameter("user_mail");


			// 登録処理を行う
			UsersDAO bDao = new UsersDAO();
			if (bDao.insert(new Bc(user_auto_id,user_id,user_pw,user_mail))) {	// 登録成功
				request.setAttribute("result",
				new Result("登録成功！", "レコードを登録しました。", "/mecar/RegistServlet"));
			}
			else {												// 登録失敗
				request.setAttribute("result",
				new Result("登録失敗！", "レコードを登録できませんでした。", "/mecar/RegistServlet"));
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインサーブレットにリダイレクトする
		response.sendRedirect("/mecar/LoginServlet");
	}

}
