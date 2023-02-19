## Template Method Pattern
The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Who does what ?
* Template Method
  *  Subclasses decide how to implement steps in an algorithm
*  Strategy
   *  Encapsulate interchangeable behaviors and use delegation to decide which behavior to use.
*  Factory Method
   *  Subclasses decide which conrete classes to instantiate.

## Hollywood Principle
Don't call us, we'll call you.
(abstract methods, comparable interface, hooks and frameworks)

## Bullet Points
* A template method defines the steps of an algorithm, deferring to subclasses for the implementation of those steps.
* The Template Method Pattern gives us an important technique for code reuse.
* The template method's abstract class may define concrete methods, abstract methods, and hooks.
* Abstract methods are implemented by subclasses.
* Hooks are methods that do nothing or default behavior in hte abstract class, but may be overriden in the subclass
* To prevent subclasses from changing the algorithm in the template method, declare the template method as final.
* The Hollywood Principle guides us to put decision making in high level modules that can decide how and when to call low-level modules.
* You'll see lots of uses of the Template Method Pattern in real-world code, but (as with any pattern) don't expect it all to be designed "by the book".
* The Strategy and Template Method Patterns both encapsulate algorithms, the first by composition and the other by inheritance.
* Factory Method is a specialization of Template Method.