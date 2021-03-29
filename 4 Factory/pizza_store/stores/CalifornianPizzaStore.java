package pizza_store.stores;

import pizza_store.pizza.Pizza;
import pizza_store.pizza.californian.*;

public class CalifornianPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CalifornianStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new CalifornianStyleVeggiePizza();
        } else if(type.equals("clam")){
            return new CalifornianStyleClamPizza();
        } else if(type.equals("pepperoni")){
            return new CalifornianStylePepperoniPizza();
        } else return null;
    }

    //TODO put on pizza : ananas, chocolate, french fries, coffee beans, salmon
}
