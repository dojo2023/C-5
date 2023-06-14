package servlet.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	// お問い合わせ画面にフォワードする。
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry_list.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// お問い合わせ検索結果画面にフォワードする

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/inquiry_result.jsp");
		dispatcher.forward(request, response);
		}
}
