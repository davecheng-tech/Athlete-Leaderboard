# Athlete Team Roster: Encapsulation, Aggregation, and Inheritance

This Java project expands on foundational object-oriented programming (OOP) principles to include:

1. **Encapsulation** – Protecting object state through `private` variables and controlled access.
2. **Aggregation (HAS-A)** – Representing teams as collections of athletes.
3. **Inheritance (IS-A)** – Specializing athlete types like basketball players and swimmers using subclasses.

This example builds on clean, maintainable OOP design and is ideal for exploring class hierarchies and real-world modeling in Java.


## Encapsulation

Encapsulation groups data and behavior into a single class and restricts direct access to internal state. This is demonstrated in all athlete types.

### The `Athlete` Class

- Holds `firstName`, `lastName`, and `countryCode` as `private final` fields.
- Provides public `getName()` and `getCountry()` methods.
- Formats names based on cultural norms. For example, Chinese, Japanese, Korean names are displayed in `LAST First` format with the last name in uppercase.

#### Example

```java
Athlete yao = new Athlete("Yao", "Ming", "CHN");
System.out.println(yao.getName()); // Output: YAO Ming
```


## Aggregation (HAS-A Relationship)

Aggregation is modeled in the `Team` class, which holds a list of `Athlete` objects. A team "has" many athletes, but athletes can exist independently.

### The `Team` Class

- Stores athletes from the same country.
- Prevents adding athletes whose `countryCode` doesn't match the team.
- Returns a list of formatted names using each athlete’s `getName()` method.

#### Example

```java
Team usaTeam = new Team("USA");
usaTeam.addAthlete(new Athlete("James", "LeBron", "USA"));
```


## Inheritance (IS-A Relationship)

Inheritance allows for specialized subclasses that extend `Athlete`, such as `BasketballPlayer` and `Swimmer`.

### The `BasketballPlayer` Class

- Adds `jerseyNumber` and `position` (e.g. "Guard", "Center").
- Overrides `getName()` to include jersey and position.

```java
BasketballPlayer lebron = new BasketballPlayer("James", "LeBron", "USA", 6, "Forward");
System.out.println(lebron.getName()); // Output: #6 LeBron JAMES (Forward)
```

### The `Swimmer` Class

- Adds `stroke` (e.g. "Freestyle") and `bestTime` (stored as a string, for simplicity in this demonstration).
- Overrides `getName()` to include stroke and performance time.

```java
Swimmer ledecky = new Swimmer("Ledecky", "Katie", "USA", "Freestyle", "3:56.46");
System.out.println(ledecky.getName()); // Output: Katie LEDECKY (Freestyle - 3:56.46)
```

## Sample Output

```
=== USA Team Roster ===
Team USA Roster:
 - #6 LeBron JAMES (Forward)
 - #30 Stephen CURRY (Guard)
 - #7 Kevin DURANT (Forward)
 - Katie LEDECKY (Freestyle - 3:56.46)
 - Caeleb DRESSEL (Butterfly - 49.45)

=== CHN Team Roster ===
Team CHN Roster:
 - #11 YAO Ming (Center)
 - #15 ZHOU Qi (Center)
 - #31 WANG Zhelin (Center)
 - SUN Yang (Freestyle - 3:40.14)
 - YE Shiwen (Medley - 4:28.43)
```


## Files in This Project

- `Athlete.java` – Base class for all athletes, includes name formatting logic.
- `BasketballPlayer.java` – Extends `Athlete`, adds jersey number and position.
- `Swimmer.java` – Extends `Athlete`, adds stroke type and best time.
- `Team.java` – Represents a group of athletes from the same country.
- `Main.java` – Creates sample athletes, teams, and prints rosters.
