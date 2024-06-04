package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import beans.Task;
import util.CommonUtil;
import util.DbUtil;

public class TaskService {

	public ArrayList<Task> selectAll() {
		String sql = "select * from tasks order by limit_date";

		ArrayList<Task> tasks = new ArrayList<>();
		// try-with-resources
		// ()内のリソースを自動的にクローズする
		try (
				Connection con = DbUtil.open();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			// PreparedStatementがクローズされるタイミングでクローズされる
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Task task = new Task(
						rs.getInt("id"),
						CommonUtil.convSqlDateToLocalDate(rs.getDate("limit_date")),
						rs.getInt("priority"),
						rs.getString("title"),
						rs.getString("description"),
						rs.getBoolean("completed"));
				tasks.add(task);
			}
		} catch (Exception e) {
			System.err.println("レコードの取得に失敗しました。");
		}
		return tasks;
	}
	
	public ArrayList<Task> getDelay() {
		String sql = "select * from tasks where limit_date < current_date and completed = 0 order by limit_date";

		ArrayList<Task> tasks = new ArrayList<>();
		// try-with-resources
		// ()内のリソースを自動的にクローズする
		try (
				Connection con = DbUtil.open();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			// PreparedStatementがクローズされるタイミングでクローズされる
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Task task = new Task(
						rs.getInt("id"),
						CommonUtil.convSqlDateToLocalDate(rs.getDate("limit_date")),
						rs.getInt("priority"),
						rs.getString("title"),
						rs.getString("description"),
						rs.getBoolean("completed"));
				tasks.add(task);
			}
		} catch (Exception e) {
			System.err.println("レコードの取得に失敗しました。");
		}
		return tasks;
	}
	
	public ArrayList<Task> getCompleted() {
		String sql = "select * from tasks where completed = 1 order by limit_date";

		ArrayList<Task> tasks = new ArrayList<>();
		// try-with-resources
		// ()内のリソースを自動的にクローズする
		try (
				Connection con = DbUtil.open();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			// PreparedStatementがクローズされるタイミングでクローズされる
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Task task = new Task(
						rs.getInt("id"),
						CommonUtil.convSqlDateToLocalDate(rs.getDate("limit_date")),
						rs.getInt("priority"),
						rs.getString("title"),
						rs.getString("description"),
						rs.getBoolean("completed"));
				tasks.add(task);
			}
		} catch (Exception e) {
			System.err.println("レコードの取得に失敗しました。");
		}
		return tasks;
	}

	public int insert(Task task) {
		String sql = "insert into tasks(limit_date, priority, title, description) values (?, ?, ?, ?)";

		int count = 0;
		try (
				Connection con = DbUtil.open();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			// ?に値をバインド
			stmt.setDate(1, CommonUtil.convLocalDateToSqlDate(task.getLimit_date()));
			stmt.setInt(2, task.getPriority());
			stmt.setString(3, task.getTitle());
			stmt.setString(4, task.getDescription());

			// sqlの実行
			count = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int completeTask(String id) {
		String sql = "update tasks set completed = 1 where id = ?";

		int count = 0;
		try (
				Connection con = DbUtil.open();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			// ?に値をバインド
			stmt.setInt(1, CommonUtil.convStrToInt(id));

			// sqlの実行
			count = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
