<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
	<title>
		<tiles:insertAttribute name="title" />
	</title>
	<meta charset="UTF-8" />
	<link type="text/css" rel="stylesheet" href="/content/site.css" />
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div id="menu">
		<tiles:insertAttribute name="menu"/>
	</div>
	<div id="body_wrapper">
		<tiles:insertAttribute name="body"/>
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
	<script type="text/javascript" src="/scripts/lib/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="/scripts/lib/knockout-3.3.0.js"></script>
</body>
</html>