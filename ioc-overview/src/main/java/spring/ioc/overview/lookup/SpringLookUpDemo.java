package spring.ioc.overview.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.ioc.overview.annotation.Super;
import spring.ioc.overview.domain.User;

import java.util.Map;

/**
 * @author: lisy
 * @version: : SpringLookUpDemo , v0.1 2020年05月10日 7:41 下午
 * @remark: the SpringLookUpDemo is spring 依赖查找
 */
public class SpringLookUpDemo {

    /**
     * 根据bean名称查找-实时查找
     * @param args
     */
    public static void main(String[] args) {

        //配置xml文件 启动spring上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INFO/spring-look-context.xml");
        //依赖查找-按照名称实时查找
        LookUpRealTime(beanFactory);
        //依赖查找-按照名称延时查找
        LookUpInLazy(beanFactory);
        //依赖查找-按照类型查找
        LookUpByType(beanFactory);
        //依赖查找-按照复合类型查找-集合
        LookUpCollectionByType(beanFactory);
        //依赖查找-通过注解查找
        LookUpByAnnotaion(beanFactory);

    }

    //延时查找
    public static void LookUpInLazy(BeanFactory beanFactory){
        ObjectFactory<User> user = (ObjectFactory) beanFactory.getBean("objectFactoryCreatingFactoryBean");
        User u = user.getObject();
        System.out.println("按照名称延时查找: lazy " + u.toString());
    }

    //实时查找
    private static void LookUpRealTime(BeanFactory beanFactory){
        User user = (User) beanFactory.getBean("user");
        System.out.println("按照名称实时查找:" + user.toString());
    }


    private static void LookUpByAnnotaion(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String , User> users = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("@super 注解对象 " + users);
        }
    }

    //按照复合类型查找 -集合
    private static void LookUpCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String , User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("all 集合对象 "  + users);
        }
    }

    //按照单一类型查找
    private static void LookUpByType(BeanFactory beanFactory) {
        User user = (User) beanFactory.getBean(User.class);
        System.out.println("按照类型 bytype " + user.toString());
    }
}
