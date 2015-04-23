<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="/content/login_user.css">
<div class="container-fluid">
	<div class="div_nav">
		<div class="div_logo">
			<a href="./main.html">
				<img src="xxx.jpg" alt="logo" width="170" height="60">
			</a>
			<font style="font-size:25px;margin-left:20px">欢迎注册</font>
		</div>	
	</div>
	<div class="div_body">
		<div class="div_content">
			<div class="div_login">
				<form role="form" class="form-inline form_login" method="post" action="/register/user">
					<div class="input-group div_title">
						<font style="font-size:23px">个人用户</font>
						<font style="margin-left:140px;font-size:16px">已有账号，</font><a href="./login_user.html" style="font-size:18px"><font>直接登录</font></a>
					</div>
					<div class="input-group input-group-lg">
						<span class="glyphicon glyphicon-user input-group-addon" id="basic-addon1" style="color:#B2BBCD;font-size:20px;"></span>
						<input type="text" name="name" placeholder="邮箱/手机号/用户名" class="form-control" aria-describedby="basic-addon1" required/>
						<!--<a href="javascript:" class="clear" id="username" onclick="clearup()"></a>-->
					</div>
					<div class="input-group input-group-lg div_pwd">
						<span class="glyphicon glyphicon-lock input-group-addon" id="basic-addon2" style="color:#B2BBCD;font-size:20px;"></span>
						<input type="password" name="password1" placeholder="密码" class="form-control" aria-describedby="basic-addon2" required/>
					</div>
					<div class="input-group input-group-lg div_pwd">
						<span class="glyphicon glyphicon-lock input-group-addon" id="basic-addon3" style="color:#B2BBCD;font-size:20px;"></span>
						<input type="password" name="password1" placeholder="重复密码" class="form-control" aria-describedby="basic-addon3" required/>
					</div>
					<botton type="botton" class="btn btn-lg btn-primary btn_register" name="login">注&nbsp;&nbsp;&nbsp;&nbsp;册</button>
				</form>
			</div>
		</div>
	</div>
	<div class="div_bottom">
		<font>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</font>
	</div>
</div>