package servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.InquiriesDao;
import model.Inquiries;

/**
 * Servlet implementation class InquiryListServlet
 */
@WebServlet("/InquiryListServlet")
public class InquiryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//もしもログインしていなかったらログインサーブレットにリダイレクトする
			HttpSession session = request.getSession();
			if (session.getAttribute("id") == null) {
				response.sendRedirect("/mecar/LoginAdminServlet");
				return;
			}
		//空文字でデータを入力する。カードリスト2とか
		InquiriesDao aInquiries = new InquiriesDao();

		//クラス名	    変数名     =  代入する値;
		List<Inquiries> cardList2 = aInquiries.select("");


		// 検索結果をリクエストスコープに格納する。
		request.setAttribute("cardList2" , cardList2);

	// お問い合わせ画面にフォワードする。
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry_list.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/mecar/LoginAdminServlet");
			return;
		}

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String keyWord = request.getParameter("keyWord");


		InquiriesDao aInquiries = new InquiriesDao();

		//クラス名	    変数名     =  代入する値;
		List<Inquiries> cardList = aInquiries.select(keyWord);

		// 検索結果をリクエストスコープに格納する。
		request.setAttribute("cardList" , cardList);

		// 結果ページにフォワードする。
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry_result.jsp");
		dispatcher.forward(request, response);
		}
}
