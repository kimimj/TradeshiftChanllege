package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mengjian on 15/7/23.
 */

@Configuration
public class AppConfig {

    @Bean(name = "animal")
    public  IAnimal getAnimal(){
        return new Dog();
    }
}
