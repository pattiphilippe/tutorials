package pizza_store.ingredient_factory;

import pizza_store.ingredients.cheese.Cheese;
import pizza_store.ingredients.cheese.MozzarellaCheese;
import pizza_store.ingredients.clam.Clam;
import pizza_store.ingredients.clam.FrozenClam;
import pizza_store.ingredients.dough.Dough;
import pizza_store.ingredients.dough.ThickCrustDough;
import pizza_store.ingredients.pepperoni.Pepperoni;
import pizza_store.ingredients.pepperoni.SlicedPepperoni;
import pizza_store.ingredients.sauce.PlumTomatoSauce;
import pizza_store.ingredients.sauce.Sauce;
import pizza_store.ingredients.veggie.BlackOlive;
import pizza_store.ingredients.veggie.EggPlant;
import pizza_store.ingredients.veggie.Spinach;
import pizza_store.ingredients.veggie.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie [] veggies = {new BlackOlive(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
    
}
