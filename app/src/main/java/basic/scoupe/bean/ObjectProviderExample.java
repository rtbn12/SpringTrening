package basic.scoupe.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class ObjectProviderExample {

    private final ObjectProvider<Waiter> waiterObjectProvider;

    private final ObjectProvider<HeadChef> headChefObjectProvider;

    public ObjectProviderExample(ObjectProvider<Waiter> waiterObjectProvider, ObjectProvider<HeadChef> headChefObjectProvider) {
        this.waiterObjectProvider = waiterObjectProvider;
        this.headChefObjectProvider = headChefObjectProvider;
    }

    public void getAndCompareHeadChef(){
        HeadChef first = headChefObjectProvider.getObject();
        HeadChef seconde = headChefObjectProvider.getObject();
        System.out.println("HeadChef is equals: "+ (first == seconde));
    }

    public void getAndCompareWaiter(){
        Waiter first = waiterObjectProvider.getObject();
        Waiter seconde = waiterObjectProvider.getObject();
        System.out.println("Waiters is equals: " + (first == seconde));
    }
}
