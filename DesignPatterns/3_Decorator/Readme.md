# Decorator

## Decorator Pattern
**The Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Class Diagram
![Decorator Pattern : Class Diagram](/3_Decorator/DecoratorClassDiagram.jpg "Decorator Pattern : Class Diagram")

## OO Principles
Classes should be open for extension but closed for modification.
Our goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code. What do we get if we accomplish this? Designs that are resilient to change and flexible enough to take on new functionnality to meet changing requirements.

## Bullet Points
* Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
* In our designs we should allow behavior to be extended without the need to modify existing code.
* Composition and delegation can often be used to add new behaviors at runtime.
* The Decorator Pattern provides an alternative to subclassing for extending behavior.
* The Decorator Pattern involves a set of dexorator classes that are used to wrap concrete components.
* Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)
* Decorators change the behavior of their components by adding new functionnality before and/or after (or even in place of) method calls to the component.
* You can wrap a component with any number of decorators.
* Decorators are typically transparent to the client of the component - that is, unless the client is relying on the component's concrete type.
* Decorators can result in many small objects in our design, and overuse can be complex.

## Sharpen your pencil
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