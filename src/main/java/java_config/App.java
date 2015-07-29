package java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mengjian on 15/7/23.
 */
public class App {

    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(AppConfig.class);
        IAnimal obj = (IAnimal) context.getBean("animal");
        obj.makeSound();
    }
}
