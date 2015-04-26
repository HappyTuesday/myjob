<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>个人注册</title>
	<meta name="viewport" content="width=device-width">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/content/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/content/login.css">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<a href="#">
					<img src="./image/logo.png" alt="logo" width="175" height="108">
				</a>
				<span class="title1">欢迎注册</span>
			</div>
		</div>
		<div class="row login-body">
			<div class="col-md-4 col-md-offset-4 login-content">
				<form role="form" class="form-horizontal" method="post" action="/register/user">
					<div class="form-group">
						<span class="col-md-4 title2">用户登录</span>
						<span class="col-md-6 col-md-offset-1"><font style="font-size:16px">已有账号，</font><a href="#" style="font-size:18px"><font>直接登录</font></a></span>
					</div>
					<div class="form-group">
						<label for="user_name" class="col-md-2 control-label">用户名</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="user.loginName" value="${model.account.loginName }"/>
						</div>
					</div>
					<div class="form-group">
						<label for="user_password" class="col-md-2 control-label">密码</label>
						<div class="col-md-8">
							<input class="form-control" type="password" name="user.password" value="${model.account.password }"/>
						</div>
					</div>
					<div class="form-group">
						<label for="user_email" class="col-md-2 control-label">邮箱</label>
						<div class="col-md-8">
							<input class="form-control" type="email" name="user.email" value="${model.account.email }"/>
						</div>
					</div>
					<div class="form-group">
						<botton type="botton" class="col-md-8 col-md-offset-2 btn btn-register" name="register">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
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
</body>
</html>