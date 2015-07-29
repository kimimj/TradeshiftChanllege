package java_config_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mengjian on 15/7/23.
 */
public class App {

    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person obj = (Person) context.getBean("humanbeing");
        obj.human();
    }
}
