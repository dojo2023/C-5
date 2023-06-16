package servlet.user;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InquiriesDao;

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
		int inquiry_id = Integer.parseInt(request.getParameter("inquiry_id"));
		String user_id = request.getParameter("user_id");
		String user_mail = request.getParameter("user_mail");
		String inquiry_subject = request.getParameter("inquiry_subject");
		String inquiry_content = request.getParameter("inquiry_content");
		int inquiry_status = Integer.parseInt(request.getParameter("inquiry_status"));
		Date inquiry_date = new Date();

		// データベースに保存する
		InquiriesDao iDao = new InquiriesDao();
//		if (iDao.insert(new Inquies(inquiry_id,user_id,user_mail,inquiry_subject,
//				inquiry_content,inquiry_status,inquiry_date))) {	// 登録成功
//			request.setAttribute("result",
//			new ("登録成功！", "レコードを登録しました。", "/simpleBC/MenuServlet"));
		}
//		else {	// 登録失敗
//			request.setAttribute("result",
//			new Inquiries("登録失敗！", "レコードを登録できませんでした。", "/simpleBC/MenuServlet"));
//		}

		// お問い合わせページにフォワードする
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry.jsp");
//		dispatcher.forward(request, response);
    }
//}
