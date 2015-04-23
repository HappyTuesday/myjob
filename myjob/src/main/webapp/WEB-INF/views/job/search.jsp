<%@ page contentType="text/html; charset=UTF-8"%>

<link rel="stylesheet" type="text/css" href="/content/main_user.css">
<div class="tabbable"> 
	<div class="tab-content">
		<div class="tab-pane active" id="tab1">
			<div class="search" id="select">
				<div class="title">
					<span><strong>职位筛选：</strong></span>
				</div>
				<div class="allOptions">
					<ul class="list-unstyled">
						<li class="condition1">
							<div class="col-md-1 option1">
								地区:
							</div>
							<ul class="col-md-11 list-unstyled value1">
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
							<ul class="col-md-11 list-unstyled value2">
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
							<ul class="col-md-11 list-unstyled value3">
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
			</div>
			<div class="sort">
				<span>排序：</span>
				<button type="button" class="btn btn-default">薪资</button>
				<button type="button" class="btn btn-default">薪资</button>
				<button type="button" class="btn btn-default">薪资</button>
				
			</div>
			<div class="searchResult">
				<ul class="list-unstyled">
					<li>
						<div class="col-md-2">职位名称</div>
						<div class="col-md-2">公司名称</div>
						<div class="col-md-2">职位月薪</div>
						<div class="col-md-2">工作地点</div>
						<div class="col-md-2">发布时间</div>
						<div class="col-md-2">简历投递</div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称1</a></div>
						<div class="col-md-2"><a href="#">公司名称1</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
						<!-- <div class="form-group">
							<label for="inputMessage" class="col-md-2 control-label">留言</label>
							<div class="col-md-4">
								<textarea class="form-control" row="3"></textarea>
							</div>
						</div> -->
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称2</a></div>
						<div class="col-md-2"><a href="#">公司名称2</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称3</a></div>
						<div class="col-md-2"><a href="#">公司名称3</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称4</a></div>
						<div class="col-md-2"><a href="#">公司名称4</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称5</a></div>
						<div class="col-md-2"><a href="#">公司名称5</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称6</a></div>
						<div class="col-md-2"><a href="#">公司名称6</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称7</a></div>
						<div class="col-md-2"><a href="#">公司名称7</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称8</a></div>
						<div class="col-md-2"><a href="#">公司名称8</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称9</a></div>
						<div class="col-md-2"><a href="#">公司名称9</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
					<li>
						<div class="col-md-2"><a href="#">职位名称10</a></div>
						<div class="col-md-2"><a href="#">公司名称10</a></div>
						<div class="col-md-2">面议</div>
						<div class="col-md-2">上海</div>
						<div class="col-md-2">2015-04-14</div>
						<div class="col-md-2"><button type="submit" class="btn btn-default">投递</button></div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>