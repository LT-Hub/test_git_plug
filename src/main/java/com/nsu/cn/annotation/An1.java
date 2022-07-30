package com.nsu.cn.annotation;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface An1 {
    String value() default "00000000";
}
