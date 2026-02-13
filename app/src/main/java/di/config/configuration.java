package di.config;


import di.bean.Kitchen;
import di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di")
public class configuration {


    @Bean
    public Waiter waiter (Kitchen kitchen){
        return new Waiter(kitchen);
    }
}
