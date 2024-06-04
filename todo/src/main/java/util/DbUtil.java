package util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbUtil {
	public static Connection open() throws NamingException, SQLException {
		// 例外を逃れる（throws）
		Connection con = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/mariadb");
		con = ds.getConnection();
		return con;
	}

	public static void close(Connection con) {
		// 例外をcatch
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("データベース終了時エラー");
		}
	}
}
