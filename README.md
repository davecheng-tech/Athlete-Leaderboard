# Athlete Name Formatter – Encapsulation Example

This project demonstrates the object-oriented programming (OOP) principle of **encapsulation** using a simple `Athlete` class in Java. It is intended as an introduction to understand how encapsulation helps protect data and structure code in a clean, organized, and maintainable way.


## What is encapsulation?

**Encapsulation** is one of the four fundamental principles of OOP (along with inheritance, polymorphism, and abstraction). It refers to the practice of:

- **Bundling related data and methods into a single class**, and  
- **Restricting direct access** to some of the class's internal data (usually by marking instance variables `private`).

Instead of allowing external code to manipulate fields directly, encapsulation encourages you to provide **controlled access** through `public` methods (getters/setters).

This protects the integrity of the object and makes it easier to reason about how the data is used and updated.


## Encapsulation in this project

### Class: `Athlete`

```java
public class Athlete {
    private final String lastName;
    private final String firstName;
    private final String countryCode;

    public Athlete(String lastName, String firstName, String countryCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return countryCode;
    }

    public String getName() {
        // Country-based name formatting logic here
    }
}
```

In this example:
- All instance variables (`firstName`, `lastName`, and `countryCode`) are `private`, so they **cannot be accessed directly** from outside the class.
- Furthermore, they are made `final` to prevent accidental reassignment inside the class and make the object provably immutable by the compiler.
- The class provides a **getter method** `getCountry()` to allow read-only access to the country code.
- `getName()` controls how the full name is formatted, depending on the IOC country code.

This is a simple example of encapsulation because:
- The object's internal state is protected from accidental changes.
- The name formatting logic is self-contained and reusable. - Code that uses the `Athlete` class (like in `Main.java`) doesn't need to know how the name is constructed—it just calls `getName()`.

## Output sample (from `Main.java`)

```
LeBron JAMES (USA)
Stephen CURRY (USA)
Luka DONCIC (SLO)
Giannis ANTETOKOUNMPO (GRE)
YAO Ming (CHN)
HACHIMURA Rui (JPN)
HA Seung-Jin (KOR)
NGUYEN Van Hung (VNM)
Pau GASOL (ESP)
Steve NASH (CAN)
```

Notice that for countries like **CHN**, **JPN**, and **VNM**, the last name is displayed first, reflecting cultural naming conventions. The `Athlete` class handles this logic, **encapsulating** the behavior and keeping it consistent.

## Learning goals

- Understand how to declare `private` instance variables.
- Use constructors to initialize objects.
- Write `public` methods to access object data safely.
- Recognize the value of keeping logic inside a class (data + behavior).
- See encapsulation as a tool for clean, maintainable code.

## Files in this repository

- [`Athlete.java`](src/Athlete.java) – The encapsulated model of an athlete.
- [`Main.java`](src/Main.java) – A demo of how to use the `Athlete` class with real data.

## Challenge

Can you extend the program to:
- Sort the athletes by country or name?
- Add validation to ensure valid IOC country codes?
- Create a subclass for a specific sport like `BasketballPlayer`?
