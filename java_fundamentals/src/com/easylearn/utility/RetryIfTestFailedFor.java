package com.easylearn.utility;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RetryIfTestFailedFor {
	int value() default 0;
}
