# Iterator and Composite

## Iterator Pattern
**The Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregates interface and implementation, and places the responsibility where it should be.

## Iterator Class Diagram
![Iterator : Class Diagram](/9_Iterator_Composite/IteratorClassDiagram.png "Iterator : Class Diagram")

## Single Responsibility Principle
A class should have only one reason to change.
Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change. This principle guides us to keep each class to a single responsibility.

## Composite Pattern
**The Composite Pattern** allows you to ocmpose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Composite Class Diagram
![Composite : Class Diagram](/9_Iterator_Composite/CompositeClassDiagram.png "Composite : Class Diagram")

## Bullet Points
* An Iterator allows access to an aggregate's elements without exposing its internal structure.
* An Iterator takes the job of iterating over an aggregate and encapsulates it in another object.
* When using an Iterator, we relieve the aggregate of the responsibility of supporting operations for traversing its data.
* An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.
* The Iterable interface provides a means of getting an iterator and enables Java's enhanced for loop.
* We should strive to assign only one responsibility to each class.
* The Composite Pattern allows clients to treat composites and individual objects uniformly.
* A Component is any object in a Composite structure. Components may be other composites or leaves.
* There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs.