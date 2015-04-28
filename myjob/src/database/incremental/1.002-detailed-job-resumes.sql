USE myjob;

ALTER TABLE job ADD COLUMN salary double;

DROP TABLE IF EXISTS resume;

CREATE TABLE IF NOT EXISTS resume(
	sid bigint not null primary key auto_increment,
	user_sid bigint not null,
	school varchar(200),
	profession varchar(200),
	gruduate_date date,
	id_card varchar(100) not null,
	birthday date not null,
	gender varchar(10) not null,
	recruitment varchar(200) not null,
	live_city varchar(200),
	marital_status varchar(100),
	politial_affiliation varchar(100),
	qualification varchar(200),
	phone varchar(100),
	expected_job_profession varchar(200),
	expected_job_city varchar(200),
	expected_salary varchar(200),
	current_working_status varchar(200),
	working_years double null,
	certifications varchar(500),
	introduction varchar(1000),
	content varchar(8000),
	status varchar(100) not null,
	update_time date not null
);
