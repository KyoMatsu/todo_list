package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.TaskService;

/**
 * Servlet implementation class TaskList
 */
@WebServlet("/TaskList")
public class TaskList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf8");
		String status = request.getParameter("status");
		// statusがnullの場合、空文字列に変換
		status = (status == null) ? "" : status;
		request.setAttribute("page", "List");	// title
		request.setAttribute("status", status);	// nav
		
		TaskService ts = new TaskService();
		
		switch(status) {
			case "delay":
				request.setAttribute("tasks", ts.getDelay());
				break;
			case "done":
				request.setAttribute("tasks", ts.getCompleted());
				break;
			default:	// すべて
				request.setAttribute("tasks", ts.selectAll());
		}
		
		request.getRequestDispatcher("/list.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
