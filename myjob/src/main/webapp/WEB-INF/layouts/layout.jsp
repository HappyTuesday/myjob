<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>
		<tiles:insertAttribute name="title" />
	</title>
	<meta name="viewport" content="width=device-width" initial-scale="1.0">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="./content/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./content/main_user.css">
</head>
<body>
	<div class="container">
		<div class="top">
			<a href="#">您好，请登录</a>
			<a href="#">免费注册</a>
			<!--<a href="#">退出</a>-->
		</div>
		<div class="logo">
			<div class="image">
				<a href="#">
					<img src="#" alt="logo" width="170" height="60">
				</a>
			</div>
			<div class="input-group word">
				<input type="text" class="form-control" placeholder="请输入关键字" aria-describedby="basic-addon1">
				<span class="input-group-addon" id="basic-addon1">搜索</span>
			</div>
		</div>

		<div class="bottom">
			<font>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</font>
		</div>
	</div>
	<script type="text/javascript" src="/scripts/lib/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="/scripts/lib/knockout-3.3.0.js"></script>
	<script src="./scripts/lib/jquery.min.js" type="text/javascript"></script>
	<script src="./scripts/lib/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>