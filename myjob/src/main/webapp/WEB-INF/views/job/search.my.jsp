<%@ page contentType="text/html; charset=UTF-8"%>

<h2>已发布的职位</h2>

<p>
	<a class="btn btn-primary" href="/job/publish">发布新职位</a>
</p>

<div data-bind="with: query">
	<div class="row">
		<div class="col-md-10">
			<label>排序</label>
			<div class="btn-group">
				<button class="btn btn-default" data-bind="click: orderby.bind('updateTime')">更新时间</button>
				<button class="btn btn-default" data-bind="click: orderby.bind('name')">职位名称</button>
				<button class="btn btn-default" data-bind="click: orderby.bind('qualification')">最低学历</button>
				<button class="btn btn-default" data-bind="click: orderby.bind('workingYears')">最低工作年限</button>
				<button class="btn btn-default" data-bind="click: orderby.bind('amount')">招聘人数</button>
			</div>
		</div>
		<div class="col-md-2 btn-group">
			<button class="btn btn-default" data-bind="click: previousPage">上一页</button>
			<button class="btn btn-default" data-bind="click: nextPage">下一页</button>
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
				<td data-bind="text: status"></td>
				<td data-bind="text: updateTime"></td>
				<td class="btn-group">
					<a class="btn btn-default" data-bind="attr: {href: '/job/edit/' + sid}">修改</a>
					<button class="btn btn-default" data-bind="click: $parent.refresh">刷新</button>
					<button class="btn btn-default" data-bind="click: $parent.unshelve">下架</button>
				</td>
			</tr>
		</tbody>
	</table>
	
	<nav>
		<ul class="pagination">
			<li>
				<button data-bind="click: previousPage">
					<span aria-hidden="true">&laquo;</span>
				</button>
			</li>
			<!-- ko foreach: paginationItems -->
			<li><button data-bind="text: $data + 1, click: $parent.setPageIndex"></button></li>
			<!-- /ko -->
			<li>
				<button data-bind="click: nextPage">
					<span aria-hidden="true">&raquo;</span>
				</button>
			</li>
		</ul>
	</nav>
</div>

<script src="/scripts/query-view-model.js"></script>

<script>
	query.url = "/job/search/my/data";
	
	query.refresh = function(job){
		post("/job/refresh/" + job.sid, "");
	}
	
	query.unshelve = function(job){
		post("/job/unshelve/" + job.sid, "");
	}
	
	$(function(){
		query.refresh();
	});
</script>