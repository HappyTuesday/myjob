<%@ page contentType="text/html; charset=UTF-8"%>

<h2>收到的职位申请记录</h2>

<div data-bind="with: query">
	<div class="row">
		<div class="col-md-10">
			<label>排序</label>
			<div class="btn-group" data-bind="foreach: orderbyFields">
				<button class="btn btn-default" data-bind="text: title, click: $parent.setOrderby"></button>
			</div>
		</div>
		<div class="col-md-2 btn-group">
			<button class="btn btn-default" data-bind="click: previousPage, attr: {disabled:isPreviousPageDisabled}">上一页</button>
			<button class="btn btn-default" data-bind="click: nextPage, attr: {disabled:isNextPageDisabled}">下一页</button>
		</div>
	</div>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>职位名称</th>
				<th>行业</th>
				<th>最低学历</th>
				<th>最低工作年限</th>
				<th>工作地点</th>
				<th>招聘人数</th>
				<th>薪水</th>
				<th>简历名称</th>
				<th>状态</th>
				<th>投递时间</th>
				<th>留言</th>
				<th></th>
			</tr>
		</thead>
		<tbody data-bind="foreach: records">
			<tr>
				<td data-bind="text: job.name"></td>
				<td data-bind="text: job.profession"></td>
				<td data-bind="text: job.qualification"></td>
				<td data-bind="text: job.workingYears"></td>
				<td data-bind="text: job.workingLocation.city"></td>
				<td data-bind="text: job.amount"></td>
				<td data-bind="text: job.salary"></td>
				<th data-bind="text: resume.name"></th>
				<td data-bind="text: status"></td>
				<td data-bind="text: requestTime"></td>
				<td data-bind="text: requestComment"></td>
				<td class="btn-group">
					<button class="btn btn-default" data-bind="click: $parent.acceptRequest">接受</button>
					<button class="btn btn-default" data-bind="click: $parent.rejectRequest">拒绝</button>
				</td>
			</tr>
			<tr data-bind="visible: jobResponse.expanded">
				<td colspan="12">
					<label>留言</label>
					<input type="text" class="form-control" data-bind="value: jobResponse.hrRemark">
				</td>
			</tr>
		</tbody>
	</table>
	
	<nav>
		<ul class="pagination">
			<li>
				<button data-bind="click: previousPage, attr: {disabled:isPreviousPageDisabled}">
					<span aria-hidden="true">&laquo;</span>
				</button>
			</li>
			<!-- ko foreach: paginationItems -->
			<li><button data-bind="text: $data + 1, click: $parent.setPageIndex"></button></li>
			<!-- /ko -->
			<li>
				<button data-bind="click: nextPage, attr: {disabled:isNextPageDisabled}">
					<span aria-hidden="true">&raquo;</span>
				</button>
			</li>
		</ul>
	</nav>
</div>

<script src="/scripts/query-view-model.js"></script>

<script>
	query.url = "/job/request/received/data";
	
	query.orderbyFields = [
		{name: 'requestTime', title: '投递时间'},
		{name: 'job.name', title: '职位名称'},
		{name: 'job.qualification', title: '最低学历'},
		{name: 'job.workingYears', title: '最低工作年限'},
		{name: 'job.amount', title: '招聘人数'},
		{name: 'job.salary', title: '月薪'},
		{name: 'resume.name', title: '简历名称'}
	];
	
	query.preprocessQueryResult = function(queryResult){
		for(var i in queryResult.records){
			var record = queryResult.records[i];
			record.jobResponse = {
				expanded: ko.observable(false),
				hrRemark: ko.observable('')
			}
		}
	}
	
	function acceptOrRejectRequest(command,jobRequest){
		if(!jobRequest.jobResponse.expanded()){
			jobRequest.jobResponse.expanded(true);
			return;
		}
		
		jobRequest.jobResponse.jobRequestSid = jobRequest.sid;
		post("/job/response/" + command, jobRequest.jobResponse, function(){
			query.execute();
		});
	}
	
	query.acceptRequest = function(jobRequest){
		acceptOrRejectRequest('acceptRequest',jobRequest)
	}
	
	query.rejectRequest = function(jobRequest){
		acceptOrRejectRequest('rejectRequest',jobRequest)
	}
	
	$(function(){
		query.execute();
	});
</script>
