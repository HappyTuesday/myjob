<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>
		<tiles:insertAttribute name="title" />
	</title>
	<meta name="viewport" content="width=device-width">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/content/bootstrap.min.css">
	<!-- <link rel="stylesheet" type="text/css" href="/content/main_user.css"> -->
	<link rel="stylesheet" type="text/css" href="/content/site.css">
	<script src="/scripts/lib/jquery-2.1.3.js"></script>
	<script src="/scripts/lib/bootstrap.min.js"></script>
	<script src="/scripts/lib/knockout-3.3.0.js"></script>
	<script src="/scripts/site.js"></script>
</head>
<body>
	<script src="/scripts/prepare-view-model.js"></script>
	
	<header>
		<nav class="navbar navbar-default">
		  	<div class="container">
		  		<form class="navbar-form navbar-right" action="/logout" method="post">
					<c:choose>
						<c:when test="${loginAccount!=null}">
							欢迎：<span>${loginAccount.loginName}</span>
							<button class="btn btn-default" type="submit">退出</button>
						</c:when>
						<c:otherwise>
							<a href="/login">您好，请登录</a>
							<a href="/register/user">免费注册</a>
						</c:otherwise>
					</c:choose>
				</form>
		  	</div>
	  	</nav>
	</header>
	
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<a class="logo" href="/">
					<img src="/images/logo.png" alt="logo">
				</a>
			</div>
			<div class="col-md-6 input-group">
				<input type="text" class="form-control" data-bind="value: query.criteria.key" placeholder="请输入关键字">
				<span class="input-group-btn">
					<button class="btn btn-default" data-bind="click: query.globalSearch">搜索</button>
				</span>
			</div>
		</div>
	</div>
	
	<div class="container">
		<tiles:insertAttribute name="menu" />
	</div>
	
	<div class="container">
		<tiles:insertAttribute name="body" />
	</div>
	
	<footer>
		<p>copyright&copy;2015&nbsp;&nbsp;&nbsp;软件1112&nbsp;成兴玲&nbsp;&nbsp;&nbsp;版权所有</p>
	</footer>
	
	<script src="/scripts/apply-view-model.js"></script>
</body>
</html>