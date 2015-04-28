<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="/content/main_user.css">
<div id="resumeInfo">
	<form class="form-horizontal" action="/resume/publish" method="post">
		<div id="generalInfo">
			<span><strong>个人信息</strong></span>
			<hr>
			<div class="form-group">
				<label for="inputSex" class="col-md-2 control-label">性别</label>
				<div class="col-md-4">
					<label class="radio-inline">
					  	<input type="radio" name="gender" id="inlineRadio1" value="male" checked> 男
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="gender" id="inlineRadio2" value="female"> 女
					</label>
				</div>
			</div>
		  	<div class="form-group">
		    	<label for="inputBirth" class="col-md-2 control-label">出生日期</label>
		    	<div class="col-md-4">
					<input type="date" class="form-control" id="inputBirth" name="birthday">
		    	</div>
		  	</div>
		  	<div class="form-group">
				<label for="inputJiguan" class="col-md-2 control-label">籍贯</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputJiguan" placeholder="" name="recruitment">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPlace" class="col-md-2 control-label">现居住城市</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputPlace" placeholder="" name="liveCity">
				</div>
			</div>
			<div class="form-group">
				<label for="inputMarriage" class="col-md-2 control-label">婚姻状况</label>
				<div class="col-md-10">
					<label class="radio-inline">
					  	<input type="radio" name="maritalStatus" id="inlineRadio3" value="unMarried" checked> 未婚
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="maritalStatus" id="inlineRadio4" value="married"> 已婚
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="maritalStatus" id="inlineRadio5" value="unknown"> 未知
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="inputPolity" class="col-md-2 control-label">政治面貌</label>
				<div class="col-md-10">
					<label class="radio-inline">
					  	<input type="radio" name="politicalAffiliation" id="inlineRadio6" value="中共党员（含预备党员）" checked> 中共党员（含预备党员）
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="politicalAffiliation" id="inlineRadio7" value="团员"> 团员
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="politicalAffiliation" id="inlineRadio8" value="群众"> 群众
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="politicalAffiliation" id="inlineRadio9" value="民主党派"> 民主党派
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="politicalAffiliation" id="inlineRadio10" value="无党派人士"> 无党派人士
					</label>
				</div>
			</div>
			<div class="form-group">
				<label for="inputIdentity" class="col-md-2 control-label">身份证</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputIdentity" placeholder="" name="idCard">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPhone" class="col-md-2 control-label">手机</label>
				<div class="col-md-4">
					<input type="tel" class="form-control" id="inputPhone" placeholder="" name="phone">
				</div>
			</div>
		</div>
		<div id="jobIntension">
			<span><strong>求职意向</strong></span>
			<hr>
			<div class="form-group">
				<label for="inputSite" class="col-md-2 control-label">期望工作城市</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputSite" placeholder="" name="expectedJobCity">
				</div>
			</div>
			<div class="form-group">
				<label for="inputTrade" class="col-md-2 control-label">期望从事行业</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputTrade" placeholder="" name="expectedJobProfession">
				</div>
			</div>
			<div class="form-group">
				<label for="inputSalary" class="col-md-2 control-label">期望月薪</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择" name="expectedSalary">
						<option value="1000">1000元/月以下</option>
					  	<option value="2000">1000-2000元/月</option>
					  	<option value="4000">2001-4000元/月</option>
					  	<option value="6000">4001-6000元/月</option>
					  	<option value="8000">6001-8000元/月</option>
					  	<option value="10000">8001-10000元/月</option>
					  	<option value="20000">10001-20000元/月</option>
					  	<option value="30000">20000元/月以上</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="inputStatus" class="col-md-2 control-label">工作状态</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择" name="currentWorkingStatus">
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
					<textarea class="form-control" row="3" name="introduction"></textarea>
				</div>
			</div>
		</div>
		<div id="education">
			<span><strong>教育经历</strong></span>
			<hr>
			<div class="form-group">
		    	<label for="inputSchool" class="col-md-2 control-label">学校名称</label>
		    	<div class="col-md-4">
					<input type="text" class="form-control" id="inputSchool" name="school">
		    	</div>
		  	</div>
		  	<div class="form-group">
				<label for="inputDate" class="col-md-2 control-label">毕业时间</label>
				<div class="col-md-4">
					<input type="date" class="form-control" id="inputDate" placeholder="" name="graduatedDate">
				</div>
			</div>
		  	<div class="form-group">
				<label for="inputMajor" class="col-md-2 control-label">专业名称</label>
				<div class="col-md-4">
					<input type="text" class="form-control" id="inputMajor" placeholder="" name="profession">
				</div>
			</div>
			<div class="form-group">
				<label for="inputDegree" class="col-md-2 control-label">学历</label>
				<div class="col-md-4">
					<select class="form-control" data-placeholder="请选择" name="qualification">
					  	<option value="associate">大专</option>
					  	<option value="bachelor">本科</option>
					  	<option value="master">硕士</option>
					  	<option value="doctor">博士</option>
					  	<option value="other">其他</option>
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
					  <input type="checkbox" id="inlineCheckbox4" value="大学英语六级" name=" name="qualification"> 大学英语六级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox5" value="大学英语四级" name="qualification"> 大学英语四级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox6" value="专业英语八级" name="qualification"> 专业英语八级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox7" value="专业英语六级" name="qualification"> 专业英语六级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox8" value="雅思" name="qualification"> 雅思
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox9" value="托福" name="qualification"> 托福
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox10" value="日语一级" name="qualification"> 日语一级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox11" value="日语二级" name="qualification"> 日语二级
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
					  <input type="checkbox" id="inlineCheckbox12" value="全国计算机一级" name="qualification"> 全国计算机一级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox13" value="全国计算机二级" name="qualification"> 全国计算机二级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox14" value="全国计算机三级" name="qualification"> 全国计算机三级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox15" value="全国计算机四级" name="qualification"> 全国计算机四级
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox16" value="初级程序员" name="qualification"> 初级程序员
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox17" value="高级程序员" name="qualification"> 高级程序员
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox18" value="全国软考" name="qualification"> 全国软考
					</label>
					<label class="checkbox-inline">
					  <input type="checkbox" id="inlineCheckbox19" value="系统分析员" name="qualification"> 系统分析员
					</label>
				</div>
		  	</div>
		</div>
		<div id="other">
			<span><strong>其他信息</strong></span>
			<hr>
			<div class="form-group">
				<label for="other" class="col-md-2 control-label">内容</label>
				<div class="col-md-4">
					<textarea class="form-control" row="10" name="content"></textarea>
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