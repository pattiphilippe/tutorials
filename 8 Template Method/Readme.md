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

