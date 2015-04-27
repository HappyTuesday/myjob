<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>公司注册</title>
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
				<span class="title1">欢迎注册</span>
			</div>
		</div>
		<div class="row login-body">
			<div class="col-md-6 col-md-offset-3 login-content">
				<form method="post" action="/register/company" role="form" class="form-horizontal">
					<div class="form-group">
						<span class="col-md-4 title2">公司用户</span>
						<span class="col-md-5 col-md-offset-3"><font style="font-size:16px">已有账号，</font><a href="#" style="font-size:18px"><font>直接登录</font></a></span>
					</div>
					<div class="form-group">
						<h4 class="col-md-12">账户信息</h4>
						<div class="form-group">
							<div class="form-group">
								<label for="account_name" class="col-md-2 control-label">用户名</label>
								<div class="col-md-8">
									<input class="form-control" type="text" name="account.loginName" value="${model.account.loginName }"/>
								</div>
							</div>
							<div class="form-group">
								<label for="account_password" class="col-md-2 control-label">密码</label>
								<div class="col-md-8">
									<input class="form-control" type="password" name="account.password" value="${model.account.password }"/>
								</div>
							</div>
							<div class="form-group">
								<label for="account_email" class="col-md-2 control-label">邮箱</label>
								<div class="col-md-8">
									<input class="form-control" type="email" name="account.email" value="${model.account.email }"/>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<h4 class="col-md-12">公司信息</h4>
						<div class="form-group">
							<div class="form-group">
								<label for="company_name" class="col-md-2 control-label">公司名称</label>
								<div class="col-md-8">
									<input class="form-control" type="text" name="name" value="${model.name }"/>
								</div>
							</div>
							<div class="form-group">
								<label for="company_category" class="col-md-2 control-label">行业类型</label>
								<div class="col-md-8">
									<input class="form-control" type="text" name="category" value="${model.category }"/>
								</div>
							</div>
							<div class="form-group">
								<label for="company_address" class="col-md-2 control-label">公司地址</label>
								<div class="col-md-2">
									<input class="form-control" type="text" name="location.province" value="${model.location.province }" placeholder="省"/>
								</div>
								<div class="col-md-2">
									<input class="form-control" type="text" name="location.city" value="${model.location.city }" placeholder="市"/>
								</div>
								<div class="col-md-2">	
									<input class="form-control" type="text" name="location.postCode" value="${model.location.postCode }" placeholder="邮编"/>
								</div>
								<div class="col-md-2">
									<input class="form-control" type="text" name="location.address" value="${model.location.address }" placeholder="地址"/>
								</div>
							</div>
							<div class="form-group">
								<label for="company_description" class="col-md-2 control-label">公司简介</label>
								<div class="col-md-8">
									<textarea class="form-control" name="description">${model.description}</textarea>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<button type="button" class="col-md-8 col-md-offset-2 btn btn-register" name="register">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
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
