CREATE TABLE IF NOT EXISTS account(
	sid bigint not null primary key auto_increment,
	login_name varchar(200) not null,
	password varchar(200) not null,
	type varchar(100) not null
);

CREATE TABLE IF NOT EXISTS geographic_site(
	sid bigint not null primary key auto_increment,
	province varchar(200) not null,
	city varchar(200) not null,
	address varchar(400) not null,
	post_code varchar(10) not null
);

CREATE TABLE IF NOT EXISTS company(
	sid bigint not null primary key,
	name varchar(200) not null,
	category varchar(200) not null,
	description varchar(2000),
	location_sid bigint not null,
	status varchar(100) not null,
	create_date date not null
);

CREATE TABLE IF NOT EXISTS user(
	sid bigint not null primary key,
	name varchar(200) not null,
	status varchar(100) not null,
	create_date date not null
);

CREATE TABLE IF NOT EXISTS job(
	sid bigint not null primary key auto_increment,
	company_sid not null,
	name varchar(200) not null,
	profession varchar(200) not null,
	qualification varchar(200) not null,
	working_location_sid bigint not null,
	working_years int not null,
	description varchar(1000) not null,
	status varchar(100) not null,
	update_time date not null
);

CREATE TABLE IF NOT EXISTS resume(
	sid bigint not null primary key auto_increment,
	user_sid bigint not null,
	id_card varchar(100) not null,
	gender varchar(10) not null,
	birthday date not null,
	school varchar(200),
	profession varchar(200),
	qualification varchar(200),
	gruduate_date date,
	working_years int not null,
	introduction varchar(1000),
	content varchar(8000),
	status varchar(100) not null,
	update_time date not null
);

CREATE TABLE IF NOT EXISTS job_request(
	job_sid bigint not null,
	resume_sid bigint not null,
	status varchar(100) not null,
	request_time date not null,
	response_time date,
	request_comment varchar(1000),
	hr_remark varchar(1000)
);
