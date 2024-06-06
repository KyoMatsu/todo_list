package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Task;
import forms.TaskAddForm;
import services.TaskService;

/**
 * Servlet implementation class TaskAdd
 */
@WebServlet("/TaskAdd")
public class TaskAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("page", "Add");
		request.getRequestDispatcher("/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf8");
		// バリデーションチェック
		TaskAddForm taf = new TaskAddForm();
		
		if(taf.validate(request)) {
			// タスク新規登録
			TaskService ts = new TaskService();
			ts.insert(new Task(request));
			response.sendRedirect("/todo/TaskList");			
		} else {
			// 登録画面
			request.setAttribute("errors", taf.getErrors());
			doGet(request, response);
		}
	}

}
