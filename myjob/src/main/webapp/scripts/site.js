function post(url, data){
	var success = arguments[2], error = arguments[3];
	
	$.ajax({
		url: url,
		method: 'POST',
		data: data,
		success: function(rs){
			switch(rs.code){
			case 'success':
				if(success){
					success(rs.value);
				}
				break;
			case 'error':
				if(error){
					error(rs.value);
				}else{
					alert(rs.value);
				}
				break;
			case 'redirect':
				window.location.href = rs.value;
				break;
			}
		},
		error: function(rs){
			$('html').html(rs.responseText);
		}
	});
}