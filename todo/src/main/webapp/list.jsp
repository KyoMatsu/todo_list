<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="util.CommonUtil" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>

<div class="container p-5">
	<div class="row">
		<div class="col-12 text-end">
			<a href="TaskAdd" class="btn btn-success">+ 追加</a>
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
			<c:forEach var="task" items="${ tasks }">
				<tr>
					<th scope="row">
						<input class="form-check-input" type="checkbox">
					</th>
					<td><c:out value="${ CommonUtil.formatLimitDate(task.getLimit_date()) }" /></td>
					<td><c:out value="${ CommonUtil.formatPriority(task.getPriority()) }" /></td>
					<td><c:out value="${ task.getTitle() }" /></td>
					<td><c:out value="${ task.getDescription() }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<jsp:include page="footer.jsp"></jsp:include>