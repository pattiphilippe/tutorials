package pizza_store.pizza;

import pizza_store.ingredients.cheese.Cheese;
import pizza_store.ingredients.clam.Clam;
import pizza_store.ingredients.dough.Dough;
import pizza_store.ingredients.pepperoni.Pepperoni;
import pizza_store.ingredients.sauce.Sauce;
import pizza_store.ingredients.veggie.Veggie;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggie [] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
