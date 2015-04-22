<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="./content/login_user.css">
<div>
	${error}
</div>
<div class="div_nav">
	<div class="div_logo">
		<a href="./main.html">
			<img src="xxx.jpg" alt="logo" width="170" height="60">
		</a>
		<font style="font-size:25px;margin-left:20px">欢迎登录</font>
	</div>	
</div>
<div class="div_body">
	<div class="div_login">
		<form class="form_login" method="post" action="/login">
			<div class="div_title">
				<font style="font-size:23px">个人用户</font>
				<a href="./register_user.html" style="margin-left:200px;font-size:20px;"><i class="glyphicon glyphicon-chevron-right" style="font-size:18px"></i><font>立即注册</font></a>
			</div>
			<div class="div_name">
				<i class="glyphicon glyphicon-user" style="float:left;margin-left:12px;margin-right:12px;color:#B2BBCD;font-size:20px;text-align:center;line-height:38px"></i>
				<input type="text" name="loginName" placeholder="邮箱/手机号/用户名" style="float:left;border:0px;width:354px;height:38px;padding-left:10px;font-size:15px;border-left:1px solid silver"/>
			</div>
			<div class="div_pwd">
				<i class="glyphicon glyphicon-lock" style="float:left;margin-left:12px;margin-right:12px;color:#B2BBCD;font-size:20px;text-align:center;line-height:38px"></i>
				<input type="password" name="password" placeholder="密码" style="float:left;border:0px;width:354px;height:38px;padding-left:10px;font-size:15px;border-left:1px solid silver"/>
			</div>
			<div class="div_button">
				<input type="submit" name="login" value="登&nbsp;&nbsp;&nbsp;&nbsp;录" style="width: 400px;height:40px;background-color: #E4393C;font-size: 21px;color: white;">
			</div>
		</form>
	</div>
</div>
<div class="div_bottom">
	<font>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</font>
</div>
