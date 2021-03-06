<%@ page contentType="text/html; charset=UTF-8"%>

<h2>已回复的职位申请记录</h2>

<div data-bind="with: query">
	<div class="row">
		<div class="col-md-10">
			<label>排序</label>
			<div class="btn-group" data-bind="foreach: orderbyFields">
				<button class="btn btn-default" data-bind="text: title, click: $parent.setOrderby"></button>
			</div>
		</div>
		<nav class="col-md-2">
			<ul class="pager">
				<li data-bind="css: {disabled:isPreviousPageDisabled()}"><a data-bind="click: previousPage">上一页</a></li>
				<li data-bind="css: {disabled:isNextPageDisabled()}"><a data-bind="click: nextPage">下一页</a></li>
			</ul>
		</nav>
	</div>
	
	<table class="table">
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
				<th>HR留言</th>
				<th></th>
			</tr>
		</thead>
		<tbody data-bind="foreach: records">
			<tr>
				<td>
					<a data-bind="text: job.name, attr: {href: '/job/'+job.sid}"></a>
				</td>
				<td data-bind="text: job.profession"></td>
				<td data-bind="text: job.qualification"></td>
				<td data-bind="text: job.workingYears"></td>
				<td data-bind="text: job.workingLocation.city"></td>
				<td data-bind="text: job.amount"></td>
				<td data-bind="text: job.salary"></td>
				<td>
					<a data-bind="text: resume.name, attr: {href: '/resume/'+resume.sid}"></a>
				</td>
				<td data-bind="text: status"></td>
				<td data-bind="text: requestTime"></td>
				<td data-bind="text: requestComment"></td>
				<td data-bind="text: hrRemark"></td>
			</tr>
		</tbody>
	</table>
	
	<nav>
		<ul class="pagination">
			<li data-bind="css: {disabled:isPreviousPageDisabled()}"><a data-bind="click: previousPage"><span aria-hidden="true">&laquo;</span></a></li>
			<!-- ko foreach: paginationItems -->
			<li data-bind="css: {active:$parent.isCurrentPage($data)}"><a data-bind="text: $data + 1, click: $parent.setPageIndex"></a></li>
			<!-- /ko -->
			<li data-bind="css: {disabled:isNextPageDisabled()}"><a data-bind="click: nextPage"><span aria-hidden="true">&raquo;</span></a></li>
		</ul>
	</nav>
</div>

<script src="/scripts/query-view-model.js"></script>

<script>
	query.url = "/job/response/sent/data";
	query.criteria.orderby('responseTime');
	
	query.orderbyFields = [
		{name: 'responseTime', title: '回复时间'},
		{name: 'requestTime', title: '投递时间'},
		{name: 'job.name', title: '职位名称'},
		{name: 'job.qualification', title: '最低学历'},
		{name: 'job.workingYears', title: '最低工作年限'},
		{name: 'job.amount', title: '招聘人数'},
		{name: 'job.salary', title: '月薪'},
		{name: 'resume.name', title: '简历名称'}
	];
	
	$(function(){
		query.execute();
	});
</script>
