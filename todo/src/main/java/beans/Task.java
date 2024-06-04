package beans;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import util.CommonUtil;

@Getter @Setter @AllArgsConstructor
public class Task {
	private int id;
	private LocalDate limit_date;
	private int priority;
	private String title;
	private String description;
	private boolean completed;
	
	// 本当は書かない
	public Task(HttpServletRequest req) {
		limit_date = CommonUtil.convStrToLocalDate(req.getParameter("limit_date"));
		priority = CommonUtil.convStrToInt(req.getParameter("priority"));
		title = req.getParameter("title");
		description = req.getParameter("description");
	}
}
