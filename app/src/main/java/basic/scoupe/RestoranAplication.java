package basic.scoupe;

import basic.scoupe.bean.HeadChef;
import basic.scoupe.bean.ObjectProviderExample;
import basic.scoupe.bean.OrderProcessor;
import basic.scoupe.bean.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class RestoranAplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationRestoran.class);
//        System.out.println(context.getBean(HeadChef.class) == context.getBean(HeadChef.class));
//        System.out.println(context.getBean(Waiter.class) == context.getBean(Waiter.class));

        HeadChef first = context.getBean(HeadChef.class);
        HeadChef seconde = context.getBean(HeadChef.class);
        first.setName("Alex");

        System.out.println(first.toString());
        System.out.println(seconde.toString());

        Waiter firstWaiter = context.getBean(Waiter.class, UUID.randomUUID());
        Waiter secondeWaiter = context.getBean(Waiter.class, UUID.randomUUID());

        System.out.println(firstWaiter.toString());
        System.out.println(secondeWaiter.toString());

        firstWaiter.setOrder("coffee");
        System.out.println(firstWaiter.toString());
        System.out.println(secondeWaiter.toString());

        ObjectProviderExample objectProviderExample = context.getBean(ObjectProviderExample.class);

        objectProviderExample.getAndCompareHeadChef();
        objectProviderExample.getAndCompareWaiter();

        OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);
        orderProcessor.processOrder("Coffe", 9);





    }
}
