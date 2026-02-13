package basic;

import basic.config.RestauranConfiguration;
import basic.staff.Barista;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRestauran {
    public static void main(String[] args) {
        ApplicationContext manager = new AnnotationConfigApplicationContext(RestauranConfiguration.class);
        Barista barista = manager.getBean("barista", Barista.class);
        barista.makeCoffee();

    }
}
