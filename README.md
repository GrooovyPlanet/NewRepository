Paws & People: The Dog Companion Simulator
Project Description

Paws & People is a simple Java simulation that models the relationship between dogs and their owners.
The program demonstrates the use of object-oriented programming (OOP) concepts such as classes, objects, constructors, encapsulation, and composition (where one class contains another).

Goal of the Simulation

The goal is to create and interact with digital dog companions, each with their own traits (like name, breed, age, and training status) and a dedicated owner. It’s a fun way to explore how real-world relationships between pets and people can be represented through code.

What Users Can Expect

When users run the program:

They can create new Dog and Owner objects.

Dogs can bark, fetch, eat, and perform tricks.

Owners can have names and addresses, which are linked to their dogs.

A tester class demonstrates these interactions with printed output that shows the dog’s behaviors and information.

What Makes This World Unique

Each dog is paired with an Owner object, making the relationship feel real.

The program uses method overloading and object composition to simulate lifelike interactions.

It’s simple, readable, and perfect for anyone learning how to model real-world relationships in Java.

+----------------------+
|        Owner         |
+----------------------+
| - name: String       |
| - address: String    |
+----------------------+
| + Owner()            |
| + Owner(name:String, |
|          address:String) |
| + getName(): String  |
| + setName(name:String): void |
| + getAddress(): String |
| + setAddress(address:String): void |
| + toString(): String |
+----------------------+

              ▲
              |
              | 1
              |
              | has
              | 
              ▼
+--------------------------------+
|             Dog                |
+--------------------------------+
| - name: String                 |
| - breed: String                |
| - age: int                     |
| - weight: double               |
| - isTrained: boolean           |
| - owner: Owner                 |
+--------------------------------+
| + Dog()                        |
| + Dog(name:String, breed:String,|
|       age:int, weight:double,   |
|       isTrained:boolean, owner:Owner) |
| + getName(): String            |
| + setName(name:String): void   |
| + getBreed(): String           |
| + setBreed(breed:String): void |
| + getAge(): int                |
| + setAge(age:int): void        |
| + getWeight(): double          |
| + setWeight(weight:double): void |
| + isTrained(): boolean         |
| + setTrained(isTrained:boolean): void |
| + getOwner(): Owner            |
| + setOwner(owner:Owner): void  |
| + bark(): void                 |
| + fetch(item:String): void     |
| + eat(): void                  |
| + performTrick(trick:String): void |
| + toString(): String           |
+--------------------------------+
