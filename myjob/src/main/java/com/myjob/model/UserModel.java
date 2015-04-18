package com.myjob.model;

import java.util.Date;

import com.myjob.entity.Account;
import com.myjob.entity.values.UserStatus;

public class UserModel {
	private long sid;
	private String name;
	private AccountModel account;
	private Date createDate;
	private String status;
}
