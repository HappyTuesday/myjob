<%@ page contentType="text/html; charset=UTF-8"%>

<h2>搜索职位</h2>

<form class="search">
	<div class="title">
		<h3>职位筛选：</h3>
	</div>
	<div class="allOptions">
		<ul class="list-unstyled">
			<li class="condition1">
				<div class="col-md-1 option1">
					地区:
				</div>
				<ul class="col-md-11 list-inline value1">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox1" value="option1"> 上海
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox2" value="option2"> 苏州
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox3" value="option3"> 南京
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox4" value="option4"> 北京
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox5" value="option5"> 广州
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox6" value="option6"> 深圳
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox7" value="option7"> 武汉
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox8" value="option8"> 成都
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox9" value="option9"> 宁波
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox10" value="option10"> 杭州
						</label>
					</li>
				</ul>
			</li>
			<li class="condition2">
				<div class="col-md-1 option2">
					职业:
				</div>
				<ul class="col-md-11 list-inline value2">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox11" value="option11"> 软件工程师
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox12" value="option12"> 数据库开发工程师
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox13" value="option13"> 系统分析师
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox14" value="option14"> 系统架构设计师
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox15" value="option15"> 游戏开发
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox16" value="option16"> 网页设计/制作/美工
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox17" value="option17"> WEB前端开发
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox18" value="option18"> 软件测试
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox19" value="option19"> 用户体验设计
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox20" value="option20"> 网络工程师
						</label>
					</li>
				</ul>
			</li>
			<li class="condition3">
				<div class="col-md-1 option3">
					行业:
				</div>
				<ul class="col-md-11 list-inline value3">
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox21" value="option21"> 计算机软件
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox22" value="option22"> 计算机硬件
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox23" value="option23"> 互联网/电子商务
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox24" value="option24"> 通信/电信/网络设备
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox25" value="option25"> 外包服务
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox26" value="option26"> IT服务（系统/数据/维护）
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox27" value="option27"> 网络游戏
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox28" value="option28"> 电子技术/半导体/集成电路
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox29" value="option29"> 保险
						</label>
					</li>
					<li>
						<label class="checkbox-inline">
						  <input type="checkbox" id="inlineCheckbox30" value="option30"> 银行
						</label>
					</li>
				</ul>
			</li>
		</ul>
	</div>
</form>

<div data-bind="with: query">
	<div class="row">
		<div class="col-md-10">
			<label>排序</label>
			<div class="btn-group" data-bind="foreach: orderbyFields">
				<button class="btn btn-default" data-bind="text: title, click: $parent.setOrderby"></button>
			</div>
		</div>
		<div class="col-md-2 btn-group">
			<button class="btn btn-default" data-bind="click: previousPage, attr: {disabled:isPreviousPageDisabled()}">上一页</button>
			<button class="btn btn-default" data-bind="click: nextPage, attr: {disabled:isNextPageDisabled()}">下一页</button>
		</div>
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
				<th>状态</th>
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
				<td data-bind="text: status"></td>
				<td data-bind="text: updateTime"></td>
				<td>
					<button class="toggle" data-bind="click: $parent.toggleExpand, css: {expanded: expanded}"></button>
				</td>
			</tr>
			<tr data-bind="visible: expanded">
				<td colspan="11">
					<div>
						<div>
							<h4>公司简介：</h4>
							<pre data-bind="text: company.descripton"></pre>
						</div>
						<div>
							<h4>详细信息：</h4>
							<pre data-bind="text: description"></pre>
						</div>
					</div>
					<div class="row">
						<div class="input-group col-md-12">
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
			<li>
				<button data-bind="click: previousPage, attr: {disabled:isPreviousPageDisabled()}">
					<span aria-hidden="true">&laquo;</span>
				</button>
			</li>
			<!-- ko foreach: paginationItems -->
			<li><button data-bind="text: $data + 1, click: $parent.setPageIndex"></button></li>
			<!-- /ko -->
			<li>
				<button data-bind="click: nextPage, attr: {disabled:isNextPageDisabled()}">
					<span aria-hidden="true">&raquo;</span>
				</button>
			</li>
		</ul>
	</nav>
</div>

<script src="/scripts/query-view-model.js"></script>

<script>
	query.url = "/job/search/data";
	
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
	
	$(function(){
		query.execute();
	});
</script>
