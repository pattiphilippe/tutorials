package pizza_store;

import pizza_store.pizza.Pizza;
import pizza_store.stores.*;

public class PizzaTestDrive {
    public static void main(String [] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza);
        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza);
        System.out.println();
    }
}
