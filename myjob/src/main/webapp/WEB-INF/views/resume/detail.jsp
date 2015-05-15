<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="/content/main_user.css">
<div id="viewResume">
	<div class="summary">
		<h1>${resume.user.name }</h1>
		<span>${resume.gender }<span class="ver-line">|</span></span>
		<span>${resume.maritalStatus }<span class="ver-line">|</span></span>
		<span>${resume.birthday }出生<span class="ver-line">|</span></span>
		<span>籍贯：${resume.recruitment }<span class="ver-line">|</span></span>
		<span>现居于${resume.liveCity }</span><br>
		<span>${resume.politialAffiliation }</span><br>
		<span>身份证：${resume.idCard }</span><br>
		<span>手机：${resume.phone }</span><br>
		<span>邮箱：<a href="#">${resume.user.account.email }</a></span>
	</div>
	<div class="details">
		<dt><h5><strong>求职意向</strong></h5></dt>
		<dd>
			<ul class="list-unstyled">
				<li><strong>期望工作地点：</strong>${resume.expectedJobCity }</li>
				<li><strong>期望从事行业：</strong>${resume.expectedJobProfession }</li>
				<li><strong>期望月薪：</strong>${resume.expectedSalary }元/月</li>
				<li><strong>工作状态：</strong>${resume.currentWorkingStatus }</li>
			</ul>
		</dd>
		<dt><h5><strong>自我评价</strong></h5></dt>
		<dd>
			<pre>${resume.introduction }</pre>
		</dd>
		<dt><h5><strong>教育经历</strong></h5></dt>
		<dd>
			<div class="educationEx">
				<span>${resume.school }<span class="ver-line">|</span></span>
				<span>${resume.profession }<span class="ver-line">|</span></span>
				<span>${resume.qualification }</span>
			</div>
		</dd>
		<dt><h5><strong>语言能力</strong></h5></dt>
		<dd>
			<p>
				${resume.certifications }
			</p>
		</dd>
	</div>
</div>





