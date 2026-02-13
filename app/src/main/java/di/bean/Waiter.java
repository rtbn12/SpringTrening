package di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Waiter {

//    @Autowired
    private  Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void takeOrder(String order){
        System.out.println("Waiter takes order: " + order);
        kitchen.cook(order);
    }

//    @Autowired
//    public void setKitchen(Kitchen kitchen) {
//        this.kitchen = kitchen;
//    }
}
