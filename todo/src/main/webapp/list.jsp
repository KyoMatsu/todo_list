<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"></jsp:include>

<div class="container p-5">
	<div class="row">
		<div class="col-12 text-end">
			<button type="button" class="btn btn-success">+ 追加</button>
		</div>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th scope="col"></th>
				<th scope="col">期限</th>
				<th scope="col">優先度</th>
				<th scope="col">タイトル</th>
				<th scope="col">内容</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">
					<input class="form-check-input" type="checkbox">
				</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
			</tr>
			<tr>
				<th scope="row">
					<input class="form-check-input" type="checkbox">
				</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
			</tr>
			<tr>
				<th scope="row">
					<input class="form-check-input" type="checkbox">
				</th>
				<td colspan="2">Larry the Bird</td>
				<td>@twitter</td>
			</tr>
		</tbody>
	</table>
</div>

<jsp:include page="footer.jsp"></jsp:include>