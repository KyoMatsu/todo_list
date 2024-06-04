<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"></jsp:include>

<div class="container p-5 text-center d-flex justify-content-center">
	<form class="w-75 text-end" method="post" action="TaskAdd">
		<table class="table table-borderless text-end">
			<tr>
				<td class="align-middle">タイトル</td>
				<td><input name="title" class="form-control" type="text"></td>
			</tr>
			<tr>
				<td class="align-middle">優先度</td>
				<td><select name="priority" class="form-control">
						<option value="3">高</option>
						<option value="2">中</option>
						<option value="1">低</option>
				</select></td>
			</tr>
			<tr>
				<td class="align-middle">期限</td>
				<td><input name="limit_date" class="form-control" type="date"></td>
			</tr>
			<tr>
				<td class="align-middle">内容</td>
				<td><textarea name="description" class="form-control"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><a class="me-3" href="TaskList">キャンセル</a>
					<button class="btn btn-success text-end" type="submit">+
						追加</button></td>
			</tr>
		</table>
	</form>
</div>

<jsp:include page="footer.jsp"></jsp:include>