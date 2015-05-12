<%@ page contentType="text/html; charset=UTF-8"%>

<h2>我的简历</h2>

<p>
	<a class="btn btn-primary" href="/resume/publish">发布新简历</a>
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
	
	<ul class="list-unstyled" data-bind="foreach: records">
		<li>
			<h3 data-bind="text: name"></h3>
			<small data-bind="text: updateTime"></small>
			<p>
				<span><label>学校：</label><span data-bind="text: school"></span></span>
				<span><label>专业：</label><span data-bind="text: profession"></span></span>
				<span><label>毕业时间：</label><span data-bind="text: graduatedDate"></span></span>
			</p>
			<p>
				<span><label>身份中号码：</label><span data-bind="text: idCard"></span></span> |
				<span><label>出生年月：</label><span data-bind="text: birthday"></span></span> |
				<span><label>性别：</label><span data-bind="text: gender"></span></span> |
				<span><label>祖籍：</label><span data-bind="text: recruitment"></span></span> |
				<span><label>手机号：</label><span data-bind="text: phone"></span></span>
			</p>
			<p>
				<span><label>生活城市：</label><span data-bind="text: liveCity"></span></span>
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
			<h4>自我评价：</h4>
			<p data-bind="text: introduction"></p>
			<h4>详细信息：</h4>
			<p data-bind="text: content"></p>
			<p class="btn-group">
				<button class="btn btn-default" data-bind="click: $parent.refreshResume">刷新</button>
				<a class="btn btn-default" data-bind="attr: {href: '/resume/edit/' + sid}">修改</a>
				<button class="btn btn-default" data-bind="click: $parent.activeResume">设为活动简历</button>
			</p>
		</li>
	</ul>
	
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
	query.url = "/resume/search/my/data";
	
	query.orderbyFields = [
		{name: 'updateTime', title: '更新时间'},
	];
	
	query.refreshResume = function(resume){
		post("/resume/refresh/" + resume.sid, "",function(){
			query.execute();
		});
	}
	
	query.activeResume = function(resume){
		post("/resume/active/" + resume.sid, "",function(){
			query.execute();
		});
	}
	
	$(function(){
		query.execute();
	});
</script>