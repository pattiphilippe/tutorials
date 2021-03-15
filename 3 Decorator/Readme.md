##Sharpen your pencil
public class Beverage {
    public static final double MILK_PRICE = 0.5;

    public double cost() {
        double cost = 0.0;
        if(hasMilk){
            cost += MILK_PRICE
        }
    }
}
public class DarkRoast extends Beverage {
    public static final double DARK_ROAST_PRICE = 3.0;

    public double cost () {
        double cost = super.cost();
        cost += DARK_ROAST_PRICE;
        return cost;
    }
}