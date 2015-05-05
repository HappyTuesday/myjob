<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>修改简历</h2>

<form:form modelAttribute="resumeEditModel" class="form" method="post" action="/resume/edit/${resumeEditModel.sid}">
	
	<div class="group row">
		<p>
			<form:errors path="*"/>
		</p>
	</div>
	
	<div class="group row">
		<h3>个人信息</h3>
	  	<div class="form-group row">
	    	<label class="col-md-1 control-label" for="name">简历名称</label>
	    	<div class="col-md-11">
				<form:input path="name" class="form-control" id="name"/>
	    	</div>
	  	</div>
		<div class="form-group row">
			<label class="col-md-1 control-label" for="genderMale">性别</label>
			<div class="col-md-11">
				<label class="radio-inline" for="genderMale">
				  	<form:radiobutton path="gender" id="genderMale" value="male"/>男
				</label>
				<label class="radio-inline" for="genderFemal">
				  	<form:radiobutton path="gender" id="genderFemal" value="female"/>女
				</label>
			</div>
		</div>
	  	<div class="form-group row">
	    	<label class="col-md-1 control-label" for="birthday">出生日期</label>
	    	<div class="col-md-11">
				<form:input path="birthday" type="date" class="form-control" id="birthday"/>
	    	</div>
	  	</div>
	  	<div class="form-group row">
			<label class="col-md-1 control-label" for="recruitment">籍贯</label>
			<div class="col-md-11">
				<form:input path="recruitment" class="form-control" id="recruitment" placeholder="籍贯"/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label" for="liveCity">现居住城市</label>
			<div class="col-md-11">
				<form:input path="liveCity" type="text" class="form-control" id="liveCity" placeholder=""/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">婚姻状况</label>
			<div class="col-md-11">
				<label class="radio-inline">
				  	<form:radiobutton path="maritalStatus" value="unMarried"/>未婚
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="maritalStatus" value="married"/>已婚
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="maritalStatus" value="unknown"/>未知
				</label>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">政治面貌</label>
			<div class="col-md-11">
				<label class="radio-inline">
				  	<form:radiobutton path="politialAffiliation" value="中共党员（含预备党员）"/>中共党员（含预备党员）
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="politialAffiliation" value="团员"/>团员
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="politialAffiliation" value="群众"/>群众
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="politialAffiliation" value="民主党派"/>民主党派
				</label>
				<label class="radio-inline">
				  	<form:radiobutton path="politialAffiliation" value="无党派人士"/>无党派人士
				</label>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">身份证</label>
			<div class="col-md-11">
				<form:input path="idCard" class="form-control" placeholder="身份证"/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">手机</label>
			<div class="col-md-11">
				<form:input path="phone" type="tel" class="form-control" placeholder="手机号码"/>
			</div>
		</div>
	</div>
	<div class="group row">
		<h3>求职意向</h3>
		<div class="form-group row">
			<label class="col-md-1 control-label">期望工作城市</label>
			<div class="col-md-11">
				<form:input path="expectedJobCity" class="form-control" placeholder=""/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">期望从事行业</label>
			<div class="col-md-11">
				<form:input path="expectedJobProfession" class="form-control" placeholder=""/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">期望月薪</label>
			<div class="col-md-11">
				<form:select path="expectedSalary" class="form-control" data-placeholder="请选择">
					<form:option value="1000">1000元/月以下</form:option>
				  	<form:option value="2000">1000-2000元/月</form:option>
				  	<form:option value="4000">2001-4000元/月</form:option>
				  	<form:option value="6000">4001-6000元/月</form:option>
				  	<form:option value="8000">6001-8000元/月</form:option>
				  	<form:option value="10000">8001-10000元/月</form:option>
				  	<form:option value="20000">10001-20000元/月</form:option>
				  	<form:option value="30000">20000元/月以上</form:option>
				</form:select>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">工作状态</label>
			<div class="col-md-11">
				<form:select path="currentWorkingStatus" class="form-control" data-placeholder="请选择">
					<form:option value="目前离职，可立即上岗"/>
				  	<form:option value="目前在职，考虑换个新环境"/>
				  	<form:option value="对现有工作还算满意，若有更好的机会也可考虑"/>
				  	<form:option value="应届毕业生"/>
				</form:select>
			</div>
		</div>
	</div>
	<div class="group row">
		<h3>自我评价</h3>
		<div class="form-group row">
			<div class="col-md-12">
				<form:textarea path="introduction" class="form-control" rows="3"/>
			</div>
		</div>
	</div>
	<div class="group row">
		<h3>教育经历</h3>
		<div class="form-group row">
	    	<label class="col-md-1 control-label">学校名称</label>
	    	<div class="col-md-11">
				<form:input path="school" class="form-control"/>
	    	</div>
	  	</div>
	  	<div class="form-group row">
			<label class="col-md-1 control-label">毕业时间</label>
			<div class="col-md-11">
				<form:input path="graduatedDate" type="date" class="form-control" placeholder=""/>
			</div>
		</div>
	  	<div class="form-group row">
			<label class="col-md-1 control-label">专业名称</label>
			<div class="col-md-11">
				<form:input path="profession" class="form-control" placeholder=""/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-md-1 control-label">学历</label>
			<div class="col-md-11">
				<form:select path="qualification" class="form-control" data-placeholder="请选择">
				  	<form:option value="associate">大专</form:option>
				  	<form:option value="bachelor">本科</form:option>
				  	<form:option value="master">硕士</form:option>
				  	<form:option value="doctor">博士</form:option>
				  	<form:option value="other">其他</form:option>
				</form:select>
			</div>
		</div>
	</div>
	<div class="group row">
		<h3>语言能力</h3>
		<div class="form-group row">
	    	<label class="col-md-1 control-label">证书名称</label>
	    	<div class="col-md-11">
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="大学英语六级"/> 大学英语六级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="大学英语四级"/>大学英语四级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="专业英语八级"/>专业英语八级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="专业英语六级"/>专业英语六级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="雅思"/>雅思
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="托福"/>托福
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="日语一级"/>日语一级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="日语二级"/>日语二级
				</label>
			</div>
	  	</div>
	</div>
	<div class="group row">
		<h3>计算机能力</h3>
		<div class="form-group row">
	    	<label class="col-md-1 control-label">证书名称</label>
	    	<div class="col-md-11">
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="全国计算机一级"/>全国计算机一级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="全国计算机二级"/>全国计算机二级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="全国计算机三级"/>全国计算机三级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="全国计算机四级"/>全国计算机四级
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="初级程序员"/>初级程序员
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="高级程序员"/>高级程序员
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="全国软考"/>全国软考
				</label>
				<label class="checkbox-inline">
				  <form:checkbox path="certifications" value="系统分析员"/>系统分析员
				</label>
			</div>
	  	</div>
	</div>
	<div class="group row">
		<h3>简历内容</h3>
		<div class="form-group row">
			<div class="col-md-11">
				<form:textarea path="content" class="form-control" rows="10"/>
			</div>
		</div>
	</div>
	<div class="group row">
		<div class="form-group row">
	    	<div class="col-md-12"> 
	      		<button type="submit" class="btn btn-success">提交</button>
	    	</div>
		</div>
	</div>
</form:form>