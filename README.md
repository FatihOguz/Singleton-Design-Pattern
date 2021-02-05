# Singleton-Design-Pattern
Question:
You have implemented the Singleton design pattern as a class named (very
originally) “Singleton”.
1. What happens if someone tries to clone a Singleton object using the clone() method
inherited from Object? Does it lead to the creation of a second distinct Singleton object?
Justify your answer. (5 points)
2. Clonin Singletons should not be allowed. How can you prevent the cloning of a Singleton
object? (5 points)
Let’s assume the class Singleton is a subclass of class Parent, that fully implements the Cloneable
interface. How would you answer questions 1 and 2 in this case? (5 points)


report:


The clone method from the object class does not use the new keyword and produces an object by
copying.For this reason, the object clone method generates an object from the singleton class.
I created an object named singleton from the singleton class. I changed the name in the reference I
got with the clone method of the object class. The other was not affected.


If we replace the return value of the clone method with the this keyword instead of super.clone, a
new clone will not be created.




