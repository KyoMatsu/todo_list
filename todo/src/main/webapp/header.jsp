<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <title>MyTodo | <c:out value="${ page }" /></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
	<nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="TaskList">MyToDo</a>
        </div>
    </nav>
    <nav class="nav">
        <a class="nav-link<c:if test="${ status == '' }"> active</c:if>" href="TaskList">すべて</a>
        <a class="nav-link<c:if test="${ status == 'delay' }"> active</c:if>" href="TaskList?status=delay">遅延中</a>
        <a class="nav-link<c:if test="${ status == 'done' }"> active</c:if>" href="TaskList?status=done">完了済み</a>
    </nav>