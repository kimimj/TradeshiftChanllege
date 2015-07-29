package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mengjian on 15/7/22.
 */
public class App {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("SpringBean.xml");

        helloworld obj = (helloworld) context.getBean("helloBean");

        obj.printHello();

    }

}
