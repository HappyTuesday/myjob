<h2>register company</h2>

<form method="post" action="/register/company">
	<div>
		<h3>account info</h3>
		<div>
			<div>
				<span>login name:</span><input type="text" name="account.loginName" value="${model.account.loginName }"/>
			</div>
			<div>
				<span>password:</span><input type="password" name="account.password" value="${model.account.password }"/>
			</div>
			<div>
				<span>email:</span><input type="email" name="account.email" value="${model.account.email }"/>
			</div>
		</div>
	</div>
	<div>
		<h3>company info</h3>
		<div>
			<div>
				<span>company name</span><input type="text" name="name" value="${model.name }"/>
			</div>
			<div>
				<span>category:</span><input type="text" name="category" value="${model.category }"/>
			</div>
			<div>
				<span>location:</span>
				<input type="text" name="location.province" value="${model.location.province }" placeholder="province"/>
				<input type="text" name="location.city" value="${model.location.city }" placeholder="city"/>
				<input type="text" name="location.postCode" value="${model.location.postCode }" placeholder="post-code"/>
				<input type="text" name="location.address" value="${model.location.address }" placeholder="address"/>
			</div>
			<div>
				<span>description:</span><textarea name="description">${model.description}</textarea>
			</div>
		</div>
	</div>
	<div>
		<input type="submit" value="create"/>
	</div>
</form>