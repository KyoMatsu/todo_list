<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="header.jsp"></jsp:include>

<div class="container p-5 text-center d-flex justify-content-center">
	<form class="w-75 text-end" method="post" action="">
		<table class="table table-borderless text-end">
			<tr>
				<td class="align-middle">タイトル</td>
				<td><input class="form-control" type="text"></td>
			</tr>
			<tr>
				<td class="align-middle">優先度</td>
				<td><select class="form-control">
						<option>高</option>
						<option>中</option>
						<option>低</option>
				</select></td>
			</tr>
			<tr>
				<td class="align-middle">期限</td>
				<td><input class="form-control" type="date"></td>
			</tr>
			<tr>
				<td class="align-middle">内容</td>
				<td><textarea class="form-control"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><a class="me-3" href="#">キャンセル</a>
					<button class="btn btn-success text-end" type="submit">+
						追加</button></td>
			</tr>
		</table>

	</form>
</div>


<jsp:include page="footer.jsp"></jsp:include>