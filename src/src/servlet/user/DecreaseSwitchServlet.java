package servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemsDao;

//担当：羽田
/**
 * Servlet implementation class DecreaseSwitchServlet
 */
@WebServlet("/DecreaseSwitchServlet")
public class DecreaseSwitchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DecreaseSwitchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
			}
		//商品IDを取得する
		request.setCharacterEncoding("UTF-8");
		String itemStr = request.getParameter("item_id");
		int item_id = Integer.parseInt(itemStr);

		String switchStr = request.getParameter("item_switch");
		int item_switch = Integer.parseInt(switchStr);



		// 減量停止のswitch切り替え処理を行う
		ItemsDao bDao = new ItemsDao();
		bDao.updateSwitch(item_id,item_switch);

		// メニューサーブレットにフォワードする
		response.sendRedirect("/mecar/MenuServlet");

	}

}


