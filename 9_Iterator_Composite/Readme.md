# Iterator

## Iterator Pattern
**The Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregates interface and implementation, and places the responsibility where it should be.

## Iterator Class Diagram
![Iterator : Class Diagram](/9_Iterator_Composite/IteratorClassDiagram.png "Iterator : Class Diagram")

## Single Responsibility Principle
A class should have only one reason to change.
Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change. This principle guides us to keep each class to a single responsibility.
