package basic.scoupe;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@ComponentScan("basic.scoupe")
public class ConfigurationRestoran {

    @Bean
    public UUID uuid(){
        return UUID.randomUUID();
    }
}
