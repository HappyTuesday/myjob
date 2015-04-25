<%@ page contentType="text/html; charset=UTF-8"%>

<h2>发布新职位</h2>

<form class="form-horizontal" method="post" action="/job/publish">
	<div class="form-group">
		<label class="col-md-2 control-label" for="job_name">职位名称</label>
		<div class="col-md-10">
			<input class="form-control" id="job_name" type="text" name="name" value="${model.name}">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="profession">行业</label>
		<div class="col-md-10">
			<input class="form-control" id="profession" type="text" name="profession" value="${model.profession }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="qualification">最低学历</label>
		<div class="col-md-10">
			<select class="form-control" id="qualification" name="qualification" data-value="${model.qualification}">
				<option value="other">其他</option>
				<option value="associate">专科</option>
				<option value="bachelor">本科</option>
				<option value="master">硕士</option>
				<option value="doctor">博士</option>
			</select>
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="working_years">最低工作年限</label>
		<div class="col-md-10">
			<input class="form-control" id="working_years" type="text" name="workingYears" value="${model.workingYears }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="working_location_province">工作地点</label>
		<div class="col-md-2">
			<input class="form-control" id="working_location_province" type="text" name="workingLocation.province" value="${model.workingLocation.province}" placeholder="省份">
		</div>
		<div class="col-md-2">
			<input class="form-control" id="working_location_city" type="text" name="workingLocation.city" value="${model.workingLocation.city}" placeholder="城市">
		</div>
		<div class="col-md-2">
			<input class="form-control" id="working_location_post_code" type="text" name="workingLocation.postCode" value="${model.workingLocation.postCode}" placeholder="邮编">
		</div>
		<div class="col-md-4">
			<input class="form-control" id="working_location_address" type="text" name="workingLocation.address" value="${model.workingLocation.address}" placeholder="地址">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="amount">招收人数</label>
		<div class="col-md-10">
			<input class="form-control" id="amount" type="number" name="amount" value="${model.amount }">
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label" for="description">详细信息</label>
		<div class="col-md-10">
			<textarea class="form-control" id="description" name="description" rows="30">${model.description}</textarea>
		</div>
	</div>
	<div class="form-group">
		<div class="col-md-offset-2 col-md-10">
			<button class="btn btn-default" type="submit">发布</button>
		</div>
	</div>
</form>