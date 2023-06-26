package servlet.user;

import java.io.IOException;

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
 * Servlet implementation class InquiryServlet
 */
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("user_id") == null) {
			response.sendRedirect("/mecar/LoginServlet");
			return;
		}
		// お問い合わせページにフォワード（jspに飛ぶ）する
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
//		int inquiry_id = Integer.parseInt(request.getParameter("inquiry_id"));
		String user_id = request.getParameter("user_id");
//		String user_mail = request.getParameter("user_mail");
		String inquiry_subject = request.getParameter("inquiry_subject");
		String inquiry_content = request.getParameter("inquiry_content");
//		int inquiry_status = Integer.parseInt(request.getParameter("inquiry_status"));
//		Date inquiry_date = new Date();

		// 登録処理を行う（データベースに保存する）
		InquiriesDao iDao = new InquiriesDao();
		iDao.insert(new Inquiries(user_id,inquiry_subject,inquiry_content));

		// お問い合わせページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry.jsp");
		dispatcher.forward(request, response);
    }
}
