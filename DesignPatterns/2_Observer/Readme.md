## Sharpen your pencil
A. true
B. true
C. true
D. true
E. true
F. ?

## Observer Pattern
**The Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and upodated automatically.

## Design Principles
- Strive for loosely coupled designs between objects that interact.

## Bullet Points
* The Observer Pattern defines a one-to-many relationship between objects.
* Subjects update Oservers using a common interface
* Observers of any concrete type can participate in the pattern as long as they implement the Observer interface.
* Observers are loosely coupled in that the Subject knows nothing about them, other than they implement the Observer interface.
* You can push or pull data from the Subject when using the pattern (pull is onsidered more "correct").
* Swing makes heavy use of the Observer Pattern, as do many GUI frameworks.
* You'll also find the pattern in many other places, including RxJava, JavaBeans, and RMI, as well as in other language frameworks, like Cocoa, Swift, and JavaScript events.
* The Observer Pattern is related to the Pusblish/Subscribe Pattern, which is for more complex situations iwth multiple Subjects and/or multiple message types.
* The Observer Pattern is a commonly used pattern, and we'll see it again when we learn about Model-View-Controller.

## Design Principle Challenge
* Principle :
  Identify the aspects of your application that vary and separate them from what stays the same. 
  * Application :
    The thing that varies in the Observer Pattern is the state of the Subject and the number and types of Observers. With this pattern, you can vary the objects that are dependent on the state of the Subject, without having to change that Subject. That's called planning ahead!
* Principle : 
  Program to an interface, not an implementation.
  * Application :
    Both the Subject and Observers use interfaces. The Subject keeps track of objects implementing the Observer interface, while the Observers register with, and get notified by, the Subjet interface. As we've seen, this keeps things nice and loosely coupled.
* Principle :
  Favor composition over inheritance.
  * Application :
    The Observer Pattern uses composition to compose any number of Observers with their Subject. These relationships aren't set up by some kind of inheritance hierarchy. No, they are set up at runtime by composition!
      
