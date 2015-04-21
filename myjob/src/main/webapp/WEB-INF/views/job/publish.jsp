<%@ page contentType="text/html; charset=UTF-8"%>

<h2>publish a new job</h2>

<form method="post" action="/job/publish">
	<div>
		<span>name: </span><input type="text" name="name" value="${model.name}">
	</div>
	<div>
		<span>profession: </span><input type="text" name="profession" value="${model.profession }">
	</div>
	<div>
		<span>qualification: </span><input type="text" name="qualification" value="${model.qualification }">
	</div>
	<div>
		<span>working years: </span><input type="text" name="workingYears" value="${model.workingYears }">
	</div>
	<div>
		<span>amount: </span><input type="number" name="amount" value="${model.amount }">
	</div>
	<div>
		<span>description: </span><textarea name="description">${model.description}</textarea>
	</div>
	<div>
		<input type="submit" value="submit">
	</div>
</form>