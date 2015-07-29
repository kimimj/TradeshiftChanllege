package loosely_coupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mengjian on 15/7/22.
 */
public class APP {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext(new String[] {"Spring-Output.xml"});

        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");

        output.generatorOutput();
    }
}
