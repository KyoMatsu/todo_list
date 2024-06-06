<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyToDo | Login</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/common.css" type="text/css" />
</head>
<body>
	<div class="main">
		<form action="Login" method="post">
			<div class="login-box">
				<label>メールアドレス</label> <input class="form-control" type="email"
					name="email" placeholder="xxx@xxx.xxx" /> <label>パスワード</label> <input
					class="form-control" type="password" name="pass" placeholder="パスワード" />

				<button class="mt-3 btn btn-primary" type="submit">ログイン</button>
			</div>
		</form>
	</div>
</body>
</html>