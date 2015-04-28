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
				<th>状态</th>
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
				<td data-bind="text: status"></td>
				<td data-bind="text: updateTime"></td>
				<td class="btn-group">
					<a class="btn btn-default" data-bind="attr: {href: '/job/edit/' + sid}">修改</a>
					<button class="btn btn-default" data-bind="click: $parent.refreshJob">刷新</button>
					<button class="btn btn-default" data-bind="click: $parent.unshelveJob">下架</button>
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
	query.url = "/job/search/my/data";
	
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