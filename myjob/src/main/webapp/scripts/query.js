// The view model used to bind the elements in HTML
var viewModel = {
	pageIndex: ko.observable(0),
	pageSize: ko.observable(10),
	key: ko.observable(''),
	orderby: ko.observable(''),
	desc: ko.observable(true),
	totalCount: ko.observable(0),
	records: ko.observable([])
}

viewModel.paginationItems = ko.computed(function(){
	var start = this.pageIndex() - this.pageIndex() % this.paginationSize;
	var list = [];
	for(var i=0;i<this.paginationSize;i++){
		list.push(start + i);
	}
	return list;
},viewModel);

// Apply bindings to view model
ko.applyBindings(viewModel);

// bind the pagination/sort button.
$('.js-page-previous').click(function(){
	viewModel.pageIndex(viewModel.pageIndex() - viewModel.paginationSize);
	executeQuery();
});

$('.js-page-next').click(function(){
	viewModel.pageIndex(viewModel.pageIndex() + viewModel.paginationSize);
	executeQuery();
});

$('.js-page-index').click(function(){
	viewModel.pageIndex($(this).attr('data-page-index'));
	executeQuery();
});

$('.js-orderby').click(function(){
	if(viewModel.orderby() == $(this).attr('data-orderby')){
		viewModel.desc(!viewModel.desc());
	}else{
		viewModel.orderby($(this).attr('data-orderby'));
	}
	
	executeQuery();
});

$('.js-search-start').click(function(){
	executeQuery();
})

// Refresh current page
$(function(){
	executeQuery();
});

function executeQuery(){
	var form = $('.js-query-crieria');
	$.ajax({
		url: form.attr('action'),
		method: form.attr('method'),
		data: form.serialize(),
		success: function(qr){
			viewModel.totalCount(qr.totalCount).records(qr.records);
		}
	});
}