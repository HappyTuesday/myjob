<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>登录</title>
	<meta name="viewport" content="width=device-width">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/content/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/content/login.css">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<a class="logo" href="/">
					<img src="/images/logo.png" alt="logo">
				</a>
				<span class="title1">欢迎登录</span>
			</div>
		</div>
		<div class="row login-body">
			<div class="col-md-4 col-md-offset-4 login-content">
				<form role="form" class="form-horizontal" method="post" action="/login">
					<div class="form-group">
						<span class="col-md-10 title2">用户登录</span>
					</div>
					<div class="form-group">
						<!-- <span class="col-md-2 glyphicon glyphicon-user input-group-addon icon" aria-hidden="true"></span> -->
						<label for="user_name" class="col-md-2 control-label">用户名</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="loginName" placeholder="邮箱/手机号/用户名" aria-describedby="basic-addon1" required/>
						</div>
					</div>
					<div class="form-group">
						<!-- <span class="col-md-2 glyphicon glyphicon-lock input-group-addon icon" aria-hidden="true"></span> -->
						<label for="user_password" class="col-md-2 control-label">密码</label>
						<div class="col-md-8">
							<input class="form-control" type="password" name="password" placeholder="密码" aria-describedby="basic-addon2" required/>
						</div>
					</div>
					<div class="form-group">
						<button class="col-md-8 col-md-offset-2 btn btn-login" type="submit" name="login">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
					</div>
					<div class="form-group register">
						<a href="/register/user" class="col-md-offset-5"><span class="glyphicon glyphicon-chevron-right"></span><font>个人注册</font></a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="/register/company">公司注册</a>
					</div>
				</form>
			</div>
		</div>
		<div class="row bottom">
			<div class="col-md-8 col-md-offset-2">
				<div class="row">
					<div class="col-md-6 col-md-offset-4">
						<span>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</span>
					</div>
				</div>
				
			</div>
		</div>
	</div>
	<script src="/scripts/lib/jquery-2.1.3.js"></script>
	<script src="/scripts/lib/bootstrap.min.js"></script>
	<script src="/scripts/lib/knockout-3.3.0.js"></script>
</body>
</html>
