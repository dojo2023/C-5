package servlet.user;

//担当：羽田
/**
 * Servlet implementation class DecreaseServlet
*/

/*

@WebServlet("/DecreaseServlet")
public class DecreaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DecreaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


//メニューから、一斉減量サーブレットを呼び出す


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				HttpSession session = request.getSession();


				//インスタンスを取り出す
				LoginUsers sessionuser_id = (LoginUsers) session.getAttribute("user_id");
				//中身のuser_idを取得する
				String user_id = (String)sessionuser_id.getUser_id();

				//【保留】プルダウンのvalueを取得。ここでは仮名"pullNumberを使用した
				String pullStr =request.getParameter("pullNumber");
				int pull = Integer.parseInt(pullStr);

				//現在日時を取得
				date nowdate =


				// 減量システム処理を行う
				ItemsDao bDao = new ItemsDao();
				//もしサブミットで一斉減量が選択されたら
				if (request.getParameter("submit").equals("一斉減量")) {

					//どこが動いていないかテスト
					bDao.decrease(user_id);

/*
					//プルダウンで自動が選択されていたら
					if(pull == 0) {bDao.decreaseALL(user_id);
					}


					else if(pull == 1) {
						//1日
						int num = 0;
						while (num < 1){
							bDao.decrease(user_id);
							num++;
						}
					}else if(pull== 2) {
						//2日
						int num = 0;
						while (num < 2){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull== 3) {
						//3日
						int num = 0;
						while (num < 3){
							bDao.decrease(user_id);
							num++;
								}
					}else if(pull== 4) {
						//1週間
						int num = 0;
						while (num < 7){
							bDao.decrease(user_id);
							num++;
								}


					}
				}

				// メニューサーブレットにリダイレクト
				response.sendRedirect("/mecar/MenuServlet");


	}
}

}

*/
