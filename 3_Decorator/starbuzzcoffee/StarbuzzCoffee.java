package starbuzzcoffee;

import starbuzzcoffee.beverages.Beverage;
import starbuzzcoffee.beverages.DarkRoast;
import starbuzzcoffee.beverages.Espresso;
import starbuzzcoffee.beverages.HouseBlend;
import starbuzzcoffee.condiments.Mocha;
import starbuzzcoffee.condiments.Soy;
import starbuzzcoffee.condiments.Whip;

public class StarbuzzCoffee {
    
    public static void main(String [] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
