package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtil {
	// セッションに保存
	public static void setSession(HttpServletRequest req, String k, Object o) {
		HttpSession session = req.getSession();
		session.setAttribute(k, o);
	}

	// セッション破棄
	public static void clearSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
	}
}
