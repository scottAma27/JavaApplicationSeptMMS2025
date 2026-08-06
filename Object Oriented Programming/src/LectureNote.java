/*
u can only use extends for a concrict class and a abstract class.
Abstraction:

Abstraction class: it is a class that cannot be intantaiated(you cannot create an object from it directly). 
It is used as a blueprint for other classes. 

interface:
In Java, an interface is a collection of abstract methods, constants, 
and other members that define a contract or a set of rules that must be followed by any class that implements it. 
Think of an interface like a blueprint or a template for a class. 
It defines what methods a class should have, but not how they're implemented.

Key characteristics of interfaces:Abstract methods: 
Interfaces can only have abstract methods (no implementation) unless they're default or static (Java 8+).
Constants: Interfaces can have public static final constants.
No constructors: Interfaces can't be instantiated.
No state: Interfaces can't have instance variables (except static final constants).
Multiple inheritance: A class can implement multiple interfaces.
*/