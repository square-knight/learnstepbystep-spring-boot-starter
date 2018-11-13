package com.fxp.myaop.function;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Usage:
 * <p>
 * Description:
 * User: fuxinpeng
 * Date: 2018-11-13
 * Time: 3:56 PM
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WithAspect {
    String value() default "";
}
