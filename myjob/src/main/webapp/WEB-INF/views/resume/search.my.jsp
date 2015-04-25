<%@ page contentType="text/html; charset=UTF-8"%>

<h2>已发布的职位</h2>

<div class="container">
	<div class="row">
		<div class="col-md-1">
			<a class="btn btn-primary" href="/job/publish">发布新职位</a>
		</div>
	</div>
	
	<div class="js-critiera"></div>
		
	<div>
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
			<tbody data-bind="foreach: queryResult.data">
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
	</div>
</div>

