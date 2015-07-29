package java_config_test;

import helloworld.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mengjian on 15/7/23.
 */
public class AppforBean {


        private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("Person_Bean.xml");

        forBean obj = (forBean) context.getBean("PersonBean");

        obj.printBean();

    }
}

