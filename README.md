# DesignPatterns

In Software Design, there are problems that everyone faces and find solutions to it over time. But since these as said are common, we don't want to re-invent the wheel. Common language oriented design patterns are classified as Creational, Structural and Behavioural patterns.

**Creational Design Patterns:**

1. **Singleton Pattern**: Ensures a class has only one instance and provides a global point of access to it.
2. **Factory Method Pattern**: Defines an interface for creating objects but allows subclasses to alter the type of objects that will be created.
3. **Abstract Factory Pattern**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
4. **Builder Pattern**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
5. **Prototype Pattern**: Creates new objects by copying an existing object, known as the prototype.

**Structural Design Patterns:**

6. **Adapter Pattern**: Allows the interface of an existing class to be used as another interface.
7. **Decorator Pattern**: Adds new responsibilities to objects dynamically without altering their structure.
8. **Composite Pattern**: Composes objects into tree structures to represent part-whole hierarchies.
9. **Proxy Pattern**: Provides a surrogate or placeholder for another object to control access to it.
10. **Bridge Pattern**: Separates an object's abstraction from its implementation, allowing both to vary independently.

**Behavioral Design Patterns:**

11. **Observer Pattern**: Defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.
12. **Strategy Pattern**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
13. **Command Pattern**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
14. **State Pattern**: Allows an object to alter its behavior when its internal state changes.
15. **Chain of Responsibility Pattern**: Passes a request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

**Architectural Design Patterns:**

16. **Model-View-Controller (MVC)**: Separates an application into three interconnected components: Model (data), View (presentation), and Controller (user interface logic).
17. **Dependency Injection**: Inversion of Control (IoC) pattern that deals with how components get hold of their dependencies.
18. **Service Locator**: Centralizes the construction and sharing of services in an application.
19. **Repository Pattern**: Separates the logic that retrieves data from a data store (e.g., a database) from the business logic.

**Concurrency Design Patterns:**

20. **Thread Pool**: Manages a pool of worker threads to execute tasks asynchronously.
21. **Producer-Consumer**: Coordinates the actions of multiple threads to process data in a producer-consumer scenario.
22. **Readers-Writers**: Manages multiple readers and writers accessing a shared resource, ensuring data integrity.
23. **Semaphore**: Controls access to a resource by limiting the number of threads that can access it simultaneously.

# Dive Into Design Patterns

## Basics of OOP

### Pillars of OOP

- Abstraction (Hiding implementation details)
- Polymorphism (Same method multiple behaviour - base class and sub-class overriding)
- Encapsulation (Binds data and methods together, access control via access specifier)
- Inheritance (inherit parent attributes)

### Relations Between Objects

1. **Association** - When one class uses another. Indicated by arrow. Bi-directional association - arrow at both the ends
    Arrow -> or <->
    Link always there
2. **Dependency** - Weaker association. No permanent link. 
    Typically, an object accepts another as method parameter, instantiates, or uses another object
    If changes in one class leads to modifications in another class
    Dotted arrow ( ----> )
3. **Composition** - a "whole-part" relationship between 2 objects, one of which is composed of one or more instances of the other
    Distinction between this and the others - component can only exist as a part of the container.
    Filled Diamond at one end(container), arrow at the other end(component) **D**->
    UML notation can represent quantities on both sides of relationships, but its okay to omit if quantities aren't clear
4. **Aggregation** - a less strict variation of composition, where one object merely contains a reference to another. 
    The container doesn't control the life cycle of the component. The component can exist without the container and can be linked to several containers at the same time.
    Drawn similar to composition, but with empty diamond on the arrow's base 

D/B Composition and Association - 


Association - parent simply uses child. Permanent link (Teacher-student - strong)
Dependency - No permanent link but uses (Car - engine -weak)
Composition - child cannot exist w/o parent. (whole-part/container-component)
Aggregation - child can exist w/o parent (whole-part/container-component)



