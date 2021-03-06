<%@ page contentType="text/html; charset=UTF-8"%>

<h2>已发布的职位</h2>

<p>
	<a class="btn btn-primary" href="/job/publish">发布新职位</a>
</p>

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
				<th>更新时间</th>
				<th></th>
			</tr>
		</thead>
		<tbody data-bind="foreach: records">
			<tr>
				<td data-bind="text: name"></td>
				<td data-bind="text: profession"></td>
				<td data-bind="text: qualification"></td>
				<td data-bind="text: workingYears"></td>
				<td data-bind="text: workingLocation.city"></td>
				<td data-bind="text: amount"></td>
				<td data-bind="text: salary"></td>
				<td data-bind="text: updateTime"></td>
				<td>
					<div class="btn-group">
						<a class="btn btn-default" data-bind="attr: {href: '/job/edit/' + sid}">修改</a>
						<button class="btn btn-default" data-bind="click: $parent.refreshJob">刷新</button>
						<button class="btn btn-default" data-bind="click: $parent.unshelveJob">下架</button>
					</div>
				</td>
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
	query.url = "/job/search/my/data";
	query.criteria.orderby('updateTime');
	
	query.orderbyFields = [
		{name: 'updateTime', title: '更新时间'},
		{name: 'name', title: '职位名称'},
		{name: 'qualification', title: '最低学历'},
		{name: 'workingYears', title: '最低工作年限'},
		{name: 'amount', title: '招聘人数'},
		{name: 'salary', title: '月薪'}
	];
	
	query.refreshJob = function(job){
		post("/job/refresh/" + job.sid, "",function(){
			query.execute();
		});
	}
	
	query.unshelveJob = function(job){
		post("/job/unshelve/" + job.sid, "",function(){
			query.execute();
		});
	}
	
	$(function(){
		query.execute();
	});
</script>