package pizza_store.ingredient_factory;

import pizza_store.ingredients.cheese.Cheese;
import pizza_store.ingredients.cheese.ReggianoCheese;
import pizza_store.ingredients.clam.Clam;
import pizza_store.ingredients.clam.FreshClam;
import pizza_store.ingredients.dough.Dough;
import pizza_store.ingredients.dough.ThinCrustDough;
import pizza_store.ingredients.pepperoni.Pepperoni;
import pizza_store.ingredients.pepperoni.SlicedPepperoni;
import pizza_store.ingredients.sauce.MarinaraSauce;
import pizza_store.ingredients.sauce.Sauce;
import pizza_store.ingredients.veggie.Garlic;
import pizza_store.ingredients.veggie.Mushroom;
import pizza_store.ingredients.veggie.Onion;
import pizza_store.ingredients.veggie.RedPepper;
import pizza_store.ingredients.veggie.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
    
}
