package starbuzzcoffee.condiments;
import starbuzzcoffee.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
