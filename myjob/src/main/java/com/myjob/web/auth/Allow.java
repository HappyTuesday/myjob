package com.myjob.web.auth;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Inheritance;

import com.myjob.entity.values.AccountType;

@Documented
@Inheritance
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Allow {
	AccountType[] value() default {AccountType.user,AccountType.company};
}
