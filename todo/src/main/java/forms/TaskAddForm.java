package forms;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import lombok.Getter;

@Getter
public class TaskAddForm {
	ArrayList<String> errors = new ArrayList<>();
	
	public boolean validate(HttpServletRequest req) {
		
		return titleLength(req.getParameter("title"));
	}
	
	private boolean titleLength(String str) {
		if(str.length() > 20) {
			errors.add("タイトルが長すぎます");
			return false;
		}
		return true;
	}
}
