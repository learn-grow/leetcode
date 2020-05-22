package com.tx.saga.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: lisy
 * @version: : Compensable , v0.1 2020年05月22日 10:40 上午
 * @remark: the Compensable is 补偿方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Compensable {

    /**
     * 根据补偿方法对事务进行补偿回滚
     * @return
     */
    String compensationMethod() default "";
}
