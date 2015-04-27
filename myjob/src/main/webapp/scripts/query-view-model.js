
var criteria = {
	pageIndex: ko.observable(0),
	pageSize: ko.observable(10),
	key: ko.observable(''),
	orderby: ko.observable(''),
	desc: ko.observable(true),
}

var query = {
	url: '',
	criteria: criteria,
	paginationSize: 5,
	totalCount: ko.observable(0),
	records: ko.observable([]),
}

query.totalPageCount = ko.computed(function(){
	return Math.ceil(this.totalCount() / this.criteria.pageSize());
},query);

query.paginationItems = ko.computed(function(){
	var totalPageCount = this.totalPageCount();
	var start = this.criteria.pageIndex() - this.criteria.pageIndex() % this.paginationSize;
	var list = [];
	for(var i=start;i < start + this.paginationSize && i < totalPageCount;i++){
		list.push(start + i);
	}
	return list;
},query);

query.execute = function(){
	post(query.url,query.criteria,function(rs){
		query.totalCount(rs.totalCount).records(rs.records);
	});
}

query.setPageIndex = function(pageIndex){
	query.criteria.pageIndex(pageIndex);
	query.execute();
}

query.nextPage = function(){
	query.setPageIndex(query.criteria.pageIndex() + 1);
}

query.previousPage = function(){
	query.setPageIndex(query.criteria.pageIndex() - 1);
}

query.isNextPageDisabled = function(){
	return query.criteria.pageIndex() >= query.totalPageCount() - 1;
}

query.isPreviousPageDisabled = function(){
	return query.criteria.pageIndex() <= 0;
}

query.setOrderby = function(field){
	if(query.criteria.orderby() == field.name){
		query.criteria.desc(!query.criteria.desc());
	}else{
		query.criteria.orderby(field.name);
	}
	
	query.execute();
}

viewModel.query = query;