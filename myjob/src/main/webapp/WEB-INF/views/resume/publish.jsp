<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="/content/main_user.css">
<div id="resumeInfo">
	<form class="form-horizontal">
		<div id="generalInfo">
			<span><strong>个人信息</strong></span>
			<hr>
			<div class="form-group">
				<label for="inputName" class="col-md-2 control-label">姓名</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputName" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputSex" class="col-md-2 control-label">性别</label>
				<div class="col-md-4">
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions1" id="inlineRadio1" value="option1" checked> 男
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions1" id="inlineRadio2" value="option2"> 女
					</label>
				</div>
			</div>
		  	<div class="form-group">
		    	<label for="inputBirth" class="col-md-2 control-label">出生日期</label>
		    	<div class="col-md-4">
					<input type="date" class="form-control" id="inputBirth">
		    	</div>
		  	</div>
		  	<div class="form-group">
				<label for="inputJiguan" class="col-md-2 control-label">籍贯</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputJiguan" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPlace" class="col-md-2 control-label">现居住城市</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputPlace" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputMarriage" class="col-md-2 control-label">婚姻状况</label>
				<div class="col-md-10">
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions2" id="inlineRadio3" value="option3" checked> 未婚
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions2" id="inlineRadio4" value="option4"> 已婚
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions2" id="inlineRadio5" value="option5"> 离异
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="inputPolity" class="col-md-2 control-label">政治面貌</label>
				<div class="col-md-10">
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions3" id="inlineRadio6" value="option6" checked> 中共党员（含预备党员）
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions3" id="inlineRadio7" value="option7"> 团员
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions3" id="inlineRadio8" value="option8"> 群众
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions3" id="inlineRadio9" value="option9"> 民主党派
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="inlineRadioOptions3" id="inlineRadio10" value="option10"> 无党派人士
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="inputIdentity" class="col-md-2 control-label">身份证</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputIdentity" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPhone" class="col-md-2 control-label">手机</label>
				<div class="col-md-4">
					<input type="tel" class="form-control" id="inputPhone" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail" class="col-md-2 control-label">邮箱</label>
				<div class="col-md-4">
					<input type="email" class="form-control" id="inputEmail" placeholder="">
				</div>
			</div>
		</div>
		<div id="jobIntension">
			<span><strong>求职意向</strong></span>
			<hr>
			<div class="form-group">
				<label for="inputJobQuality" class="col-md-2 control-label">期望工作性质</label>
				<div class="col-md-8">
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox1" value="option1"> 全职
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox2" value="option2"> 兼职
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox3" value="option3"> 实习
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="inputSite" class="col-md-2 control-label">期望工作地点</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputSite" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputJob" class="col-md-2 control-label">期望从事职业</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputJob" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputTrade" class="col-md-2 control-label">期望从事行业</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputTrade" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputSalary" class="col-md-2 control-label">期望月薪</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择">
						<option>1000元/月以下</option>
					  	<option>1000-2000元/月</option>
					  	<option>2001-4000元/月</option>
					  	<option>4001-6000元/月</option>
					  	<option>6001-8000元/月</option>
					  	<option>8001-10000元/月</option>
					  	<option>10001-20000元/月</option>
					  	<option>20000元/月以上</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="inputStatus" class="col-md-2 control-label">工作状态</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择">
						<option>目前离职，可立即上岗</option>
					  	<option>目前在职，考虑换个新环境</option>
					  	<option>对现有工作还算满意，若有更好的机会也可考虑</option>
					  	<option>应届毕业生</option>
					</select>
				</div>
			</div>
		</div>
		<div id="evaluation">
			<span><strong>自我评价</strong></span>
			<hr>
			<div class="form-group">
				<label for="inputEvaluation" class="col-md-2 control-label">内容</label>
				<div class="col-md-4">
					<textarea class="form-control" row="3"></textarea>
				</div>
			</div>
		</div>
		<div id="education">
			<span><strong>教育经历</strong></span>
			<hr>
			<div class="form-group">
		    	<label for="inputSchool" class="col-md-2 control-label">学校名称</label>
		    	<div class="col-md-4">
					<input type="text" class="form-control" id="inputSchool">
		    	</div>
		  	</div>
		  	<div class="form-group">
				<label for="inputDate" class="col-md-2 control-label">入学时间</label>
				<div class="col-md-4">
					<input type="date" class="form-control" id="inputDate" placeholder="">
				</div>
			</div>
			<div class="form-group">
		    	<label for="inputAcademic" class="col-md-2 control-label">院系名称</label>
		    	<div class="col-md-4">
					<input type="text" class="form-control" id="inputAcademic">
		    	</div>
		  	</div>
		  	<div class="form-group">
				<label for="inputMajor" class="col-md-2 control-label">专业名称</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputMajor" placeholder="">
				</div>
			</div>
			<div class="form-group">
				<label for="inputDegree" class="col-md-2 control-label">学历</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择">
					  	<option>初中</option>
					  	<option>高中</option>
					  	<option>中专</option>
					  	<option>大专</option>
					  	<option>本科</option>
					  	<option>硕士</option>
					  	<option>博士</option>
					  	<option>其他</option>
					</select>
				</div>
			</div>
		</div>
		<div id="language">
			<span><strong>语言能力</strong></span>
			<hr>
			<div class="form-group">
		    	<label for="inputCertificate1" class="col-md-2 control-label">证书名称</label>
		    	<div class="col-md-10">
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox4" value="option1"> 大学英语六级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox5" value="option2"> 大学英语四级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox6" value="option1"> 专业英语八级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox7" value="option2"> 专业英语六级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox8" value="option3"> 雅思
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox9" value="option1"> 托福
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox10" value="option2"> 日语一级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox11" value="option3"> 日语二级
					</label>
				</div>
		  	</div>
		</div>
		<div id="computer">
			<span><strong>计算机能力</strong></span>
			<hr>
			<div class="form-group">
		    	<label for="inputCertificate2" class="col-md-2 control-label">证书名称</label>
		    	<div class="col-md-10">
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox12" value="option1"> 全国计算机一级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox13" value="option2"> 全国计算机二级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox14" value="option1"> 全国计算机三级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox15" value="option2"> 全国计算机四级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox16" value="option3"> 初级程序员
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox17" value="option1"> 高级程序员
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox18" value="option2"> 全国软考
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox19" value="option3"> 系统分析员
					</label>
				</div>
		  	</div>
		</div>
		<div id="tijiao">
			<hr>
			<div class="form-group">
		    	<div class="col-md-offset-2 col-md-10"> 
		      		<button type="submit" class="btn btn-success" id="btn3">提交</button>
		    	</div>
			</div>
		</div>
	</form>
</div>