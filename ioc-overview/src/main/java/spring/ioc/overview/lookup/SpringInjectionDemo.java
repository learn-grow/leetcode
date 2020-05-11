package spring.ioc.overview.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.ioc.overview.annotation.Super;
import spring.ioc.overview.domain.User;
import spring.ioc.overview.repository.UserRepository;

import java.util.Map;

/**
 * @author: lisy
 * @version: : SpringLookUpDemo , v0.1 2020年05月10日 7:41 下午
 * @remark: the SpringLookUpDemo is spring 依赖注入
 */
public class SpringInjectionDemo {

    /**
     * 根据bean名称查找-实时查找
     * @param args
     */
    public static void main(String[] args) {

        //配置xml文件 启动spring上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INFO/spring-injection-context.xml");

        UserRepository userRepository = (UserRepository)beanFactory.getBean("userRepository");
        for (User user : userRepository.getUsers()) {
            System.out.println(user.toString());
        }

    }

}
