<%@ page contentType="text/html; charset=UTF-8"%>

<div id="viewjob">
	<div class="companyInfo">
		<h3>${job.name }</h3>
		<hr>
		<h4>${job.company.name }</h4>
		<ul class="list-unstyled">
			<li><strong>公司行业：</strong>${job.company.category }</li>
			<li><strong>公司地址：</strong>${job.company.location.province}${job.company.location.city}${job.company.location.address}</li>
		</ul>
	</div>
	<div class="jobDetail">
		<h4>职位信息</h4>
		<ul class="list-unstyled">
			<li><strong>最低学历：</strong>${job.qualification }</li>
			<li><strong>工作年限：</strong>${job.workingYears }年</li>
			<li><strong>工作地点：</strong>${job.workingLocation.province}${job.workingLocation.city}${job.workingLocation.address}</li>
			<li><strong>招聘人数：</strong>${job.amount }</li>
		</ul>
		<div>
			<span><strong>职位描述：</strong></span><br>
			<pre>${job.description}</pre>
		</div>
		<div>
			<h4>公司简介</h4>
			<pre>${job.company.description }</pre>
		</div>
	</div>
</div>