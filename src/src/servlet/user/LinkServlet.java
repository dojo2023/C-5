package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;
import model.LoginUsers;

/**
 * Servlet implementation class LinkServlet
 */
@WebServlet("/LinkServlet")
public class LinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LinkServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);

		//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
		}

		//リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");  // 商品名
		String url = request.getParameter("url");  // 商品URL

		// セッションスコープからインスタンスを取得する（商品IDを取得する準備）
		LoginUsers user_id = (LoginUsers) session.getAttribute("user_id");

		//ItemsDaoのメソッドを呼び出し、item_idを取得する
		ItemsDao iDao = new ItemsDao();
		int item_id = iDao.getItemId((String)user_id.getUser_id(), name, url);

		// 残量を＋100する(ための処理をItemsDaoから呼び出す)
		ItemsDao bDao = new ItemsDao();
		bDao.updateMater(item_id);

		// リンク先に飛ぶ(jsp)

	}
}
