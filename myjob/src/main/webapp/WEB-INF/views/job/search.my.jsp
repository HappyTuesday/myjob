<%@ page contentType="text/html; charset=UTF-8"%>

<h2>已发布的职位</h2>

<p>
	<a class="btn btn-primary" href="/job/publish">发布新职位</a>
</p>

<div>
	<form class="form js-query-crieria" method="post" action="/job/search/my/data">
		<input type="hidden" name="pageIndex" value="${criteria.pageIndex}" data-bind="value: pageIndex">
		<input type="hidden" name="pageSize" value="${criteria.pageSize}" data-bind="value: pageSize">
		<input type="hidden" name="key" value="${criteria.key}" data-bind="value: key">
		<input type="hidden" name="orderby" value="${criteria.orderby}" data-bind="value: orderby">
		<input type="hidden" name="desc" value="${criteria.desc}" data-bind="value: desc">
	</form>
</div>
	
<div>
	<div class="row">
		<div class="col-md-10">
			<label>排序</label>
			<div class="btn-group">
				<button class="btn btn-default js-orderby" data-orderby-field="updateTime">更新时间</button>
				<button class="btn btn-default js-orderby" data-orderby-field="name">职位名称</button>
				<button class="btn btn-default js-orderby" data-orderby-field="qualification">最低学历</button>
				<button class="btn btn-default js-orderby" data-orderby-field="workingYears">最低工作年限</button>
				<button class="btn btn-default js-orderby" data-orderby-field="amount">招聘人数</button>
			</div>
		</div>
		<div class="col-md-2 btn-group">
			<button class="btn btn-default js-page-previous">上一页</button>
			<button class="btn btn-default js-page-next">下一页</button>
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
				<td data-bind="text: workingLocation"><td>
				<td data-bind="text: amount"></td>
				<td data-bind="text: status"></td>
				<td data-bind="text: updateTime"></td>
				<td>
					<a class="btn btn-default" data-bind="attr: {href: '/job/edit/' + sid()}">修改</a>
					<button class="btn btn-default">刷新</button>
					<button class="btn btn-default">删除</button>
				</td>
			</tr>
		</tbody>
	</table>
	
	<nav>
		<ul class="pagination">
			<li>
				<button class="js-page-previous" aria-label="Previous">
					<span aria-hidden="true">&laquo;</span>
				</button>
			</li>
			<!-- ko foreach: paginationItems -->
			<li><button class="js-page-index" data-bind="text: $data"></button></li>
			<!-- /ko -->
			<li>
				<button class="js-page-next" aria-label="Next">
					<span aria-hidden="true">&raquo;</span>
				</button>
			</li>
		</ul>
	</nav>
</div>

<script src="/scripts/query.js"></script>