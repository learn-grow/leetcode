package com.lock.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: lisy
 * @version: : ReflectTest , v0.1 2020年04月12日 5:26 下午
 * @remark: the ReflectTest is
 */
public class ReflectTest {
    /**
     * class对象
     * getClasses()	 返回一个数组，数组中包含该类中所有公共类和接口类的对象
     * getDeclaredClasses()	 返回一个数组，数组中包含该类中所有类和接口类的对象
     * newInstance() 创建类的实例
     * forName(String className)
     *
     * filed 类中属性相关
     * getField(String name)	获得某个公有的属性对象
     * getFields()	获得所有公有的属性对象
     * getDeclaredField(String name)	获得某个属性对象
     * getDeclaredFields()	获得所有属性对象
     *
     * annotation
     * getAnnotation(Class<A> annotationClass)	返回该类中与参数类型匹配的公有注解对象
     * getAnnotations()	返回该类所有的公有注解对象
     * getDeclaredAnnotation(Class<A> annotationClass)	返回该类中与参数类型匹配的所有注解对象
     * getDeclaredAnnotations()	返回该类所有的注解对象
     *
     * method 方法获取
     * getMethod(String name, Class...<?> parameterTypes)	获得该类某个公有的方法
     * getMethods()	获得该类所有公有的方法
     * getDeclaredMethod(String name, Class...<?> parameterTypes)	获得该类某个方法
     * getDeclaredMethods()	获得该类所有方法
     *
     */

    /**
     * 反射创建类实例
     */
    public static void reflectNewInstance(){
        try {
            Class<?> classBook = Class.forName("com.lock.demo.Book"); //获取class
            //Class<?> classBook1 = Book.class; //获取class对象

            Object objectBook = classBook.newInstance(); //创建类实例

            Book book = (Book) objectBook;
            book.setName("java");
            book.setAuthor("Oracle");
            System.out.println(book.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射构造函数
     */
    public static void reflectPrivateConstructor(){
        try {
            Class<?> classBook = Book.class;
            Constructor<?> constructors = classBook.getDeclaredConstructor(String.class,String.class);
            constructors.setAccessible(true);
            Object objectBook = constructors.newInstance("C++","C");
            Book book = (Book) objectBook;
            System.out.println(book.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射私有方法
     */
    public static void reflectPrivateMethod(){
        try {
            Class<?> classBook = Class.forName("com.lock.demo.Book");
            Method methodBook = classBook.getDeclaredMethod("getStr",int.class);
            methodBook.setAccessible(true);
            Object o = classBook.newInstance();
            String str = (String) methodBook.invoke(o,0);
            System.out.println(str);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void reflectPrivateFiled(){
        try {
            Class<?> classBook = Class.forName("com.lock.demo.Book");
            Object object = classBook.newInstance();
            Field field = classBook.getDeclaredField("TAG");
            field.setAccessible(true);
            field.set(object,"改变");
            String tag = (String) field.get(object);
            System.out.println(tag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void reflectPrivateFiled1(){
        try {
            Class<?> classBook = Class.forName("com.lock.demo.Book");
            Object object = classBook.newInstance();
            Field[] fields = classBook.getDeclaredFields();
            for (Field field1 : fields) {
                System.out.println(field1.getType().getName());
//                if (){
//                    field1.setAccessible(true);
//                    field1.set(object,"改变");
//                    String tag = (String) field1.get(object);
//                    System.out.println(tag);
//                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        reflectPrivateFiled1();
    }
}
