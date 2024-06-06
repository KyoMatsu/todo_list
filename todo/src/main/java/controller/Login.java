package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import services.LoginService;
import util.SessionUtil;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログアウト処理
		Map<String, String[]> param = request.getParameterMap();
		
		if(param.containsKey("logout")) {
			SessionUtil.clearSession(request);
		}
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ログイン処理
		String name = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		LoginService ls = new LoginService();
		User login_user = ls.login(name, pass);
		
		if (login_user != null) {
			// セッションにユーザー情報を保管
			SessionUtil.setSession(request, "user", login_user);
			response.sendRedirect("/todo/TaskList");
		} else {
			doGet(request, response);
		}
	}
}
