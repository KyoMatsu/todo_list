package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.User;
import util.DbUtil;

public class LoginService {
	
	public User login(String email, String password) {
		String sql = "select * from users where email = ?";
		
		User user = null;
		
		try (
			Connection con = DbUtil.open();
			PreparedStatement stmt = con.prepareStatement(sql);
		){
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// パスワードが一致する場合のみインスタンス化
				System.out.println(rs.getString("password") + password);
				if (rs.getString("password").equals(password))
					user = new User(
							rs.getInt("id"),
							rs.getString("name"),
							rs.getString("password"));
			}
		} catch (Exception e) {
			System.err.println("レコードの取得に失敗しました。");
		}
		
		return user;
	}
}
