package pizza_store.ingredient_factory;

import pizza_store.ingredients.cheese.Cheese;
import pizza_store.ingredients.clam.Clam;
import pizza_store.ingredients.dough.Dough;
import pizza_store.ingredients.pepperoni.Pepperoni;
import pizza_store.ingredients.sauce.Sauce;
import pizza_store.ingredients.veggie.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
