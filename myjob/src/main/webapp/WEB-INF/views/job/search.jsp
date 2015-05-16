<%@ page contentType="text/html; charset=UTF-8"%>

<h2>搜索职位</h2>

<div data-bind="with: query">
	<h3>职位筛选：</h3>
	<div data-bind="click: filterChange">
		<ul class="list-unstyled">
			<li class="row">
				<div class="col-md-1">
					地区:
				</div>
				<ul class="col-md-11 list-inline filter-options" data-bind="foreach: filter.city, css:{empty: !criteria.city().length}">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" data-bind="value: value, checked: $parent.criteria.city"><span data-bind="text: display"></span>
						</label>
					</li>
				</ul>
			</li>
			<li class="row">
				<div class="col-md-1">
					最低学历:
				</div>
				<ul class="col-md-11 list-inline filter-options" data-bind="foreach: filter.qualification, css:{empty: !criteria.qualification().length}">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" data-bind="value: value, checked: $parent.criteria.qualification"><span data-bind="text: display"></span>
						</label>
					</li>
				</ul>
			</li>
			<li class="row">
				<div class="col-md-1">
					行业:
				</div>
				<ul class="col-md-11 list-inline filter-options" data-bind="foreach: filter.profession, css:{empty: !criteria.profession().length}">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" data-bind="value: value, checked: $parent.criteria.profession"><span data-bind="text: display"></span>
						</label>
					</li>
				</ul>
			</li>
		</ul>
	</div>
	
	<h3>职位搜索结果：</h3>
	<div>
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
					<th>公司名称</th>
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
					<td>
						<a data-bind="text: name, attr: {href: '/job/'+sid}"></a>
					</td>
					<td data-bind="text: company.name"></td>
					<td data-bind="text: profession"></td>
					<td data-bind="text: qualification"></td>
					<td data-bind="text: workingYears"></td>
					<td data-bind="text: workingLocation.city"></td>
					<td data-bind="text: amount"></td>
					<td data-bind="text: salary"></td>
					<td data-bind="text: updateTime"></td>
					<td>
						<button class="toggle" data-bind="click: $parent.toggleExpand, css: {expanded: expanded}"></button>
					</td>
				</tr>
				<tr data-bind="visible: expanded">
					<td colspan="10">
						<pre data-bind="text: description"></pre>
						<div class="row">
							<div class="input-group col-md-6 col-md-offset-6">
								<span class="input-group-addon">留言：</span>
								<input type="text" class="form-control" data-bind="value: jobRequest.requestComment">
								<span class="input-group-btn">
									<button class="btn btn-default" data-bind="click: $parent.postJobRequest">投递</button>
								</span>
							</div>
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
</div>

<script src="/scripts/query-view-model.js"></script>

<script>
	query.url = "/job/search/data";
	query.criteria.orderby('updateTime');
	
	query.filter = {
		city: ko.observable([]),
		profession: ko.observable([]),
		qualification: ko.observable([])
	}
	
	query.criteria.city = ko.observableArray([]);
	query.criteria.profession = ko.observableArray([]);
	query.criteria.qualification = ko.observableArray([]);
	
	query.orderbyFields = [
		{name: 'updateTime', title: '更新时间'},
		{name: 'name', title: '职位名称'},
		{name: 'qualification', title: '最低学历'},
		{name: 'workingYears', title: '最低工作年限'},
		{name: 'amount', title: '招聘人数'},
		{name: 'salary', title: '月薪'}
	];
	
	query.preprocessQueryResult = function(queryResult){
		for(var i in queryResult.records){
			var record = queryResult.records[i];
			record.expanded = ko.observable(false);
			record.jobRequest = {
				requestComment: ko.observable('')
			}
		}
	}
	
	query.toggleExpand = function(record){
		record.expanded(!record.expanded());
	}
	
	query.postJobRequest = function(job){
		job.jobRequest.jobSid = job.sid;
		
		post("/job/request/post", job.jobRequest, function(){
			alert("投递成功");
			job.expanded(false);
		});
	}
	
	query.globalSearch = function(){
		post("/job/search/filter/data",{
			key: query.criteria.key()
		},function(filter){
			for(var p in query.filter){
				query.filter[p](filter[p]);
			}
			query.execute();
		})
	}
	
	query.filterChange = function(data,event){
		if(event.target.nodeName == 'INPUT'){
			query.execute();
		}
		return true;
	}
	
	$(function(){
		query.globalSearch();
	});
</script>
