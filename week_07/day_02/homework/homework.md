# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?

Many Forms.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

It allows us to group things together effectively, as well as makes code DRY, via inheritance.
A tv can inherit from the super class, screen. A monitor class can also inherit from the same super class. Whilst the screen superclass could be abstract or not depending on preference or build.

3. What can we use to implement polymorphism in Java?

A Super Class, Abstract class or an interface.

4. How many 'forms' can an object take when using polymorphism?

It can inherit from one super class above it, it can pass its methods downwards in an inheritance tree and it can have as many interfaces as necessary.

5. Give an example of when you could use polymorphism.

Having a vehicle class, with several subclasses such as car, motorbike, sharing some characteristics like wheels but in different quantities.

# Composition

6. What do we mean by 'composition' in reference to object-oriented programming?

It allows us to group objects by what they do rather than what they inherit from.

7. When would you use composition? Provide a simple example in Java.

To collect several objects which are unrelated in form, but are grouped together in some aspect of functionality. Eg. a tv screen and computer monitor again would be a good example. where an interface class such as IController, would allow the tv to change channel, whilst a monitor wouldnt have this feature or methods associated to it. Any other object that can be remotely controller could be added to this interface, eg. a HiFI system, or smart lights.

8. What is/are the advantage(s) of using composition?

Allows objects with similar functionality to be grouped even if they have some differences inherent in their design.


9. What happens to the behaviours when the object composed of them is destroyed?

They would continue to have the same shared methods that were dictated in the interface "contract", but would no longer be able to be grouped together into ArrayLists for instance.
