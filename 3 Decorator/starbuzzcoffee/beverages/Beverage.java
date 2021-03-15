package starbuzzcoffee.beverages;
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public String toString(){
        return getDescription() + " $" + cost();
    }
}