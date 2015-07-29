package java_config_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mengjian on 15/7/23.
 */

@Configuration
public class AppConfig {

    @Bean(name = "humanbeing")
    public Person getName(){
        return new Student();
    }
}
