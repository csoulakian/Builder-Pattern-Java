# Builder-Pattern-Java

**Loyola University Chicago**

**COMP 373/473 - Objects/Frameworks/Patterns**

**Spring 2016 - Project 4 Builder Pattern**

The purpose of the builder pattern is to separate the construction and representation 
of a complex object. With this separation, the same construction can create multiple
representations of the complex object. In this example, the complex product is pizza 
and it is comprised of a particular type of crust, sauce, and toppings. The abstract 
PizzaBuilder has the ability to create a new pizza, build each of the 3 components,
and get the constructed pizza. There are multiple concrete builders, including MeatLovers,
HotPepperoni, ChrissysFavorite, and FarhadsFavorite, which construct and assemble each 
type of pizza with a particular crust, sauce, and toppings. Then the waiter, or director, 
can construct and get the cooked pizza to give it to the customer. The builder pattern
is useful in this example because without the builder, the waiter would have to specify the
crust, sauce, and toppings for each and every pizza that is ordered. By using the builder,
the waiter can set the builder to whichever type of pizza is ordered and get that pizza
without having to know what components make up the pizza. The construction of the pizza is
the same for all pizzas, but they are represented differently depending on the type of pizza.

Run main method in

    src/main/java/BuilderPattern

Run tests in

    src/test/java/BuilderPatternTest

Resources:

- Design Patterns by Gamma, Helm, Johnson, and Vlissides (GoF)
- https://sourcemaking.com/design_patterns/builder/java/2
