<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>

<head>
<meta charset="utf-8">
<title>MyTodo | <c:out value="${ page }" /></title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<!-- 
	<nav class="navbar navbar-dark bg-dark">
		<div class="d-flex justify-content-between">
			<div class="container-fluid">
				<a class="navbar-brand" href="TaskList">MyToDo</a>
			</div>
		</div>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
			<ul class="navbar-nav">
				<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Dropdown </a>
					<ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
						<li><a class="dropdown-item" href="#">Action</a></li>
						<li><a class="dropdown-item" href="#">Another action</a></li>
						<li><a class="dropdown-item" href="#">Something else here</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
 -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid d-flex justify-content-between">
			<div>
				<a class="navbar-brand" href="TaskList">MyToDo</a>
			</div>
			<div>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
								<c:out value="${ user.getName() }" />
							</a>
							<ul class="dropdown-menu dropdown-menu-dark dropdown-menu-end" aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="Login?logout">ログアウト</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
	</nav>

	<nav class="nav">
		<a class="nav-link<c:if test="${ status == '' }"> active</c:if>" href="TaskList">すべて</a>
		<a class="nav-link<c:if test="${ status == 'delay' }"> active</c:if>" href="TaskList?status=delay">遅延中</a>
		<a class="nav-link<c:if test="${ status == 'done' }"> active</c:if>" href="TaskList?status=done">完了済み</a>
	</nav>