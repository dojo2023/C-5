package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDao;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserServlet() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // リクエストパラメータから削除するユーザーIDを取得
        String userId = request.getParameter("userId");

        // UsersDaoのインスタンスを作成
        UsersDao usersDao = new UsersDao();

        // ユーザーを削除
        boolean success = usersDao.delete(userId);

        if (success) {
            // 削除成功の場合の処理
            response.sendRedirect("/mecar/UsersListServlet");
        } else {
            // 削除失敗の場合の処理
            // エラーメッセージなどを設定し、エラーページにフォワードするなどの処理を行う
            // 例: request.setAttribute("errorMessage", "削除に失敗しました。");
            //     RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
            //     dispatcher.forward(request, response);
        }
    }
}