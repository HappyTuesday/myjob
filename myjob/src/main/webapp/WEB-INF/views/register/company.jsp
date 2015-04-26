<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>公司注册</title>
	<meta name="viewport" content="width=device-width">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/content/bootstrap.min.css">
 	<!-- <link rel="stylesheet" type="text/css" href="/content/login_user.css"> -->
</head>
<body>
	<div class="container">
		<div class="div_nav">
			<div class="div_logo">
				<a class="logo" href="/">
					<img src="/images/logo.png" alt="logo">
				</a>
				<font style="font-size:25px;margin-left:20px">欢迎注册</font>
			</div>	
		</div>
		<div>
			<form method="post" action="/register/company" role="form" class="form-horizontal">
				<div class="form-group">
					<div class="form-group div_title">
						<font style="font-size:23px">公司用户</font>
						<font style="margin-left:140px;font-size:16px">已有账号，</font><a href="./login_user.html" style="font-size:18px"><font>直接登录</font></a>
					</div>
					<h3>账户信息</h3>
					<div class="form-group">
						<div class="form-group">
							<label for="account_name" class="col-md-2 control-label">用户名</label>
							<div class="col-md-4">
								<input class="form-control" type="text" name="account.loginName" value="${model.account.loginName }"/>
							</div>
						</div>
						<div class="form-group">
							<label for="account_password" class="col-md-2 control-label">密码</label>
							<div class="col-md-4">
								<input class="form-control" type="password" name="account.password" value="${model.account.password }"/>
							</div>
						</div>
						<div class="form-group">
							<label for="account_email" class="col-md-2 control-label">邮箱</label>
							<div class="col-md-4">
								<input class="form-control" type="email" name="account.email" value="${model.account.email }"/>
							</div>
						</div>
					</div>
				</div>
				<div class="form-group">
					<h3>公司信息</h3>
					<div class="form-group">
						<div class="form-group">
							<label for="company_name" class="col-md-2 control-label">公司名称</label>
							<div class="col-md-4">
								<input class="form-control" type="text" name="name" value="${model.name }"/>
							</div>
						</div>
						<div class="form-group">
							<label for="company_category" class="col-md-2 control-label">行业类型</label>
							<div class="col-md-4">
								<input class="form-control" type="text" name="category" value="${model.category }"/>
							</div>
						</div>
						<div class="form-group">
							<label for="company_address" class="col-md-2 control-label">公司地址</label>
							<div class="col-md-2">
								<input class="form-control" type="text" name="location.province" value="${model.location.province }" placeholder="province"/>
							</div>
							<div class="col-md-2">
								<input class="form-control" type="text" name="location.city" value="${model.location.city }" placeholder="city"/>
							</div>
							<div class="col-md-2">	
								<input class="form-control" type="text" name="location.postCode" value="${model.location.postCode }" placeholder="post-code"/>
							</div>
							<div class="col-md-2">
								<input class="form-control" type="text" name="location.address" value="${model.location.address }" placeholder="address"/>
							</div>
						</div>
						<div class="form-group">
							<label for="company_description" class="col-md-2 control-label">公司简介</label>
							<div class="col-md-4">
								<textarea class="form-control" name="description">${model.description}</textarea>
							</div>
						</div>
					</div>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-lg">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
				</div>
			</form>
		</div>
		<div class="div_bottom">
			<font>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</font>
		</div>
	</div>
</body>
</html>