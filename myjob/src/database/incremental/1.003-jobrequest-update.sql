USE myjob;

DROP TABLE IF EXISTS job_request;

CREATE TABLE IF NOT EXISTS job_request(
	sid bigint not null primary key auto_increment,
	job_sid bigint not null,
	resume_sid bigint not null,
	status varchar(100) not null,
	request_time date not null,
	response_time date,
	request_comment varchar(1000),
	hr_remark varchar(1000)
);
