package spring.ioc.overview.annotation;

import java.lang.annotation.*;

/**
 * @author: lisy
 * @version: : Super , v0.1 2020年05月10日 8:18 下午
 * @remark: the Super is
 */
@Target({ElementType.TYPE}) //标注使用的地方
@Retention(RetentionPolicy.RUNTIME) //使用的策略 运行时
public @interface Super {
}
