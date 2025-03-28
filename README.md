# Athlete Name Leaderboard: Encapsulation and Aggregation

This Java project demonstrates two key object-oriented programming (OOP) principles:

1. **Encapsulation** – illustrated through the `Athlete` class, which protects and formats its internal data.
2. **HAS-A Relationship (Aggregation)** – illustrated through the `Team` class, which contains multiple `Athlete` objects from the same country.

This project is intended as an introduction to clean, maintainable OOP design in Java.

## Encapsulation

Encapsulation is the practice of:

- Grouping related data and behavior into a single class, and  
- Restricting direct access to the internal state of the object by declaring variables as `private`.

Instead of allowing direct manipulation of fields, encapsulation promotes controlled access through public methods (such as getters and setters). This helps maintain data integrity and ensures consistent behavior across a codebase.

### The `Athlete` Class

The `Athlete` class demonstrates encapsulation in the following ways:

- All instance variables (`firstName`, `lastName`, and `countryCode`) are marked `private`, so they cannot be accessed directly from outside the class.
- These variables are also declared `final`, making the object immutable once constructed.
- The class provides public methods to retrieve the athlete's country and a formatted full name.
- The `getName()` method applies cultural formatting rules: for specific countries (e.g., CHN, JPN, VNM), the last name appears first.

#### Example

```java
Athlete yao = new Athlete("Yao", "Ming", "CHN");
System.out.println(yao.getName()); // Output: YAO Ming
```

## HAS-A Relationship

A **HAS-A relationship** describes how one object can contain or manage instances of another. This project includes a `Team` class to illustrate this concept through **aggregation**: a `Team` object *has* a list of `Athlete` objects.

### The `Team` Class

- A `Team` object represents a collection of athletes from the same country.
- It maintains a list of `Athlete` objects and ensures that all members share the same `countryCode`.
- This structure models a typical aggregation relationship, where one class (Team) is composed of other objects (Athletes), but those objects can also exist independently.

#### Example

```java
Team usaTeam = new Team("USA");
usaTeam.addAthlete(new Athlete("James", "LeBron", "USA"));
usaTeam.addAthlete(new Athlete("Curry", "Stephen", "USA"));
```

## Sample Output

```
Team USA Roster:
 - LeBron JAMES
 - Stephen CURRY

Team CHN Roster:
 - YAO Ming
 - LIN Jeremy

Team JPN Roster:
 - HACHIMURA Rui
 - WATANABE Yuta
```

## Learning Objectives

- Understand how to declare `private` instance variables and control access using public methods.
- Use constructors to initialize immutable objects.
- Recognize encapsulation as a tool for robust, maintainable code.
- Understand how HAS-A relationships model real-world associations between objects.
- Distinguish between encapsulation and aggregation in OOP.

## Files in This Project

- `Athlete.java` – Defines the `Athlete` class and encapsulates cultural name formatting logic.
- `Team.java` – Defines the `Team` class and demonstrates a HAS-A relationship with `Athlete`.
- `Main.java` – Demonstrates how to use the classes together to build and display teams.
