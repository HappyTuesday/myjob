<h2>login</h2>

<form method="post" action="/login">
	<div>
		${error}
	</div>
	<div>
		<span>login name:</span><input type="text" name="loginName"/>
	</div>
	<div>
		<span>password:</span><input type="password" name="password"/>
	</div>
	<div>
		<span><input type="checkbox" name="rememberMe"/>remember me?</span>
	</div>
	<div>
		<input type="submit" value="login"/>
	</div>
</form>