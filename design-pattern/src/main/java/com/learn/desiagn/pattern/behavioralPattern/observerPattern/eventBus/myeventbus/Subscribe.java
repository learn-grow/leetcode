package com.learn.desiagn.pattern.behavioralPattern.observerPattern.eventBus.myeventbus;

import com.google.common.annotations.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: lisy
 * @version: : Subscribe , v0.1 2020年04月30日 4:25 下午
 * @remark: the Subscribe is
 */
@Retention(RetentionPolicy.RUNTIME) //定义该注解的保留时间长短，运行期间
@Target(ElementType.METHOD) //修饰注解可使用的范围，用于方法上
@Beta //只是标注该版本的目前状况
public @interface Subscribe {
    /**
     * 用于标明观察者中的那个函数可以接受消息
     */

}
    /**
     * 1 @Retention 应用到一个注解上的时候，它解释说明了这个注解的存活时间。 它的取值如下：
     * RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视
     * RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
     * RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
     * 2 @Documented 它的作用是能够将注解中的元素包含到 Javadoc 中去
     * 3 @Target 指定了注解运用的地方。 你可以这样理解，当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。 类比到标签，原本标签是你想张贴到哪个地方就到哪个地方，但是因为 @Target 的存在，它张贴的地方就非常具体了，比如只能张贴到方法上、类上、方法参数上等等。@Target 有下面的取值
     * ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
     * ElementType.CONSTRUCTOR 可以给构造方法进行注解
     * ElementType.FIELD 可以给属性进行注解
     * ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
     * ElementType.METHOD 可以给方法进行注解
     * ElementType.PACKAGE 可以给一个包进行注解
     * ElementType.PARAMETER 可以给一个方法内的参数进行注解
     * ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
     * 4 @Inherited Inherited 是继承的意思，子类继承了超类的注解。意思很容易理解。
     * 5 @Repeatable是java1.8加进来的，表示的是可重复，就好比一个人有好几个身份。
     * 6 @Deprecated java预置的注解其实还是比较多的，但是我们只要调出几个比较重要的就好了。
     *
     *
     */
