<%@ page contentType="text/html; charset=UTF-8"%>

<h2>简历搜索</h2>

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
	
	<ul class="list-unstyled" data-bind="foreach: records">
		<li class="resume">
			<h3>
				<a data-bind="text: user.name, attr: {href: '/resume/'+sid}"></a>
			</h3>
			<small data-bind="text: updateTime"></small>
			<p>
				<span><label>学校：</label><span data-bind="text: school"></span></span>
				<span><label>专业：</label><span data-bind="text: profession"></span></span>
				<span><label>毕业时间：</label><span data-bind="text: graduatedDate"></span></span>
			</p>
			<p>
				<span><label>出生年月：</label><span data-bind="text: birthday"></span></span>
				<span><label>性别：</label><span data-bind="text: gender"></span></span>
				<span><label>当前城市：</label><span data-bind="text: liveCity"></span></span>
				<span><label>婚姻状况：</label><span data-bind="text: maritalStatus"></span></span>
				<span><label>政治信仰：</label><span data-bind="text: politialAffiliation"></span></span>
				<span><label>学历：</label><span data-bind="text: qualification"></span></span>
			</p>
			<p>
				<span><label>期望从事的行业：</label><span data-bind="text: expectedJobProfession"></span></span>
				<span><label>期望工作城市：</label><span data-bind="text: expectedJobCity"></span></span>
				<span><label>期望月薪：</label><span data-bind="text: expectedSalary"></span></span>
				<span><label>当前工作状态：</label><span data-bind="text: currentWorkingStatus"></span></span>
			</p>
			<p>
				<span><label>工作年限：</label><span data-bind="text: workingYears"></span></span>
				<span><label>证书：</label><span data-bind="text: certifications"></span></span>
			</p>
		</li>
	</ul>
	
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
	query.url = "/resume/search/data";
	query.criteria.orderby('updateTime');
	
	query.orderbyFields = [
   		{name: 'updateTime', title: '更新时间'},
		{name: 'graduatedDate', title: '毕业时间'},
		{name: 'birthday', title: '出生年月'},
		{name: 'qualification', title: '学历'},
	];
	
	$(function(){
		query.execute();
	});
</script>