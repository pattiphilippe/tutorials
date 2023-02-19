# State 

## State Pattern
**The StatePattern** allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## State Class Diagram
![State : Class Diagram](/10_State/StateClassDiagram.PNG "State : Class Diagram")

## Bullet Points
* The State Pattern allows an object tot have many diffrent behaviors that are based on its internal state.
* Unlike a procedural state machine, the State Pattern represents each state as a full-blown class.
* The Context gets its behavior by delegating to the current state object it is composed with.
* By encapsulating each state into a class, we localize any changes that will need to be made.
* The State and Strategy Patterns have the same class diagram, but they differ in intent.
* The Strategy Pattern typically configures Context classes with a behavior or algorithm.
* The State Pattern allows a Context to change its behavior as the state of the Context changes.
* State transition can be controlled by the State classes or by the Context classes.
* Using the State Pattern will typically result in a greater number of classes in your design.
* State classes may be shared among Context instances.