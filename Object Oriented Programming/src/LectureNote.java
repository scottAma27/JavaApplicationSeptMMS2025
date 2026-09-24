/*
Inheritance: works when two class have something in common.
Note: set store unix type of codes.
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

Association:
it is the relationship between two or more classes where one class uses or interacts with another. 
in other words, it shows how object of one class are connected to object of another class. 
it also works when both classes don't realy have something in common and that's when association come's in 

tyoes: 
one-to-one: this is when one object is associated with exactly one object of another class.
one-to-many: ths when an object is associated with multipule objects of another class.
many-to-one:
many-to-many:

two main types of Association
1. HAS-A Association: it is classified into two parts 
      Aggregation
      Composition
2. IS-A Assiociation: is also effered to as inheitance 

Aggregation: is a special type of Association that repesents a "HAS-A" relationship between two classes.
it means one class contains another class, but both can exsit independently. In other words,
it is a strong type of relationship. its just like  Strong Entity 
class A has Class B, but itf Class A is destroyed, Class B can still live on it's own. 
E.g A doctor can still move to another hospital if the other work place is demolished, etc 

Composition: it does the opposite of a Aggregation e.g tree and leaves, Building and walls, car and engine, etc 
*/