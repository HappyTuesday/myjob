function post(url, data){
	var success = arguments[2], error = arguments[3];
	
	$.ajax({
		url: url,
		method: 'POST',
		data: data,
		success: function(rs){
			if(success){
				success(rs);
			}
		},
		error: function(rs){
			if(error){
				error();
			}else{
				$('html').html(rs.responseText);
			}
		}
	});
}