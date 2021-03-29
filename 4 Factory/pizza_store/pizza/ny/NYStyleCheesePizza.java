package pizza_store.pizza.ny;

import pizza_store.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza(){
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        this.toppings.add("Grated Reggiano Cheese");
    }

}
