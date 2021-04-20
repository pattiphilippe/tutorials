package pizza_store.stores;

import pizza_store.ingredient_factory.NYPizzaIngredientFactory;
import pizza_store.ingredient_factory.PizzaIngredientFactory;
import pizza_store.pizza.CheesePizza;
import pizza_store.pizza.ClamPizza;
import pizza_store.pizza.PepperoniPizza;
import pizza_store.pizza.Pizza;
import pizza_store.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
