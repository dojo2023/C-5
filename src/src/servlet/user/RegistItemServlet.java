package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
import model.Items;
import model.LoginUsers;

/**
 * Servlet implementation class RegistItemServlet
 */
@WebServlet("/RegistItemServlet")
public class RegistItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
		}

		//リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		int price = Integer.parseInt(request.getParameter("price"));
		int category = Integer.parseInt(request.getParameter("category"));
		int frequency = Integer.parseInt(request.getParameter("frequency"));
		int dSwitch = Integer.parseInt(request.getParameter("switch"));
		double meter = Double.parseDouble(request.getParameter("meter"));

		//セッションスコープからインスタンスを取得する（ユーザーIDを取得する準備）
		LoginUsers user_id = (LoginUsers) session.getAttribute("user_id");

		//登録処理を行う
		ItemsDao iDao = new ItemsDao();
		iDao.insert(new Items(0, (String)user_id.getUser_id(), name, url, price, category,
				frequency, dSwitch, meter));

		//メニューサーブレットにリダイレクトする
		response.sendRedirect("/mecar/MenuServlet");
	}
}
