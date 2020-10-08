package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KeisanServlet
 */
public class KeisanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KeisanServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//取ってくるエンコードを設定する
		request.setCharacterEncoding("UTF-8");
		//jspから入力された値を取ってくる&変数用意して格納
		String su1s = (String) request.getParameter("su1");
		String su2s = (String) request.getParameter("su2");
		String keihou = (String) request.getParameter("keihou");
		//String ⇒ intにした後に格納するための変数
		int su1 = 0;
		int su2 = 0;
		//エラーが起こった時表示するため用の変数
		String err = null;
		//計算結果を入れるための変数
		int result = 0;

		try {
			//String ⇒ intにする
			su1 = Integer.parseInt(su1s);
			su2 = Integer.parseInt(su2s);
		} catch (NumberFormatException ne) {
			//数字じゃないものが入力されているためエラーメッセージを格納
			System.out.println("文字列からint型に変換する際にえらー起きたよ");
			err = "整数を記入してください";
		}

		//計算するためのクラスをインスタンス化する
		Kei k = new Kei();

		if (keihou.equals("tasu")) {
			//足し算
			result = k.tasum(su1, su2);
		} else if (keihou.equals("hiku")) {
			//引き算
			result = k.hikum(su1, su2);
		} else if (keihou.equals("kakeru")) {
			//掛け算
			result = k.kakerum(su1, su2);
		} else if (keihou.equals("waru")) {
			//割り算
			result = k.warum(su1, su2);
		} else {
			//なんか問題発生したためエラーメッセージを格納
			err = "なんか問題発生した";
		}

		//エラー表示用と計算結果を
		//リクエストオブジェクトにセット
		request.setAttribute("err", err);
		request.setAttribute("result", result);
		//計算結果画面に遷移
		RequestDispatcher rd = request.getRequestDispatcher("jsp/kekka.jsp");
		rd.forward(request, response);

	}

}
