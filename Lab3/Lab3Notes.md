# Week 3 Lab

CSSSLK 142 - 10/13/23

## 🔑 Key Points 🔑

    1. Boolean Expressions
    2. Control/Branching

## 👩‍💻 Boolean Expressions

* Boolean expressions are conditions or statements that can be either **`true`** or **`false`**.
* In programming, we often use boolean expressions to make decisions and control the flow of our code.

### Comparison Operators
Used to compare values and create boolean expressions

    == (equals)
    != (not equals)
    < (less than)
    > (greater than)
    <= (less than or equal to)
    >= (greater than or equal to)

### Logical AND (`&&`), OR (`||`), NOT (`!`)

```java
boolean isHalloween = true;
boolean hasSpookyCostume = true;
boolean isFridayThe13th = false;

if ((isHalloween && hasSpookyCostume) || (!isFridayThe13th)) {
    System.out.println("You're ready for Halloween!");
} else {
    System.out.println("You might need to prepare a bit more for Halloween.");
}
```

## 🌲 Control/Branching

### `if` Statement

```java
if (isHalloween) {
    System.out.println("It's Halloween! Time to get spooky!");
}
```

### `if/else` statement

```java
if (isHalloween) {
    System.out.println("It's Halloween! Time to get spooky!");
} else {
    System.out.println("It's not Halloween, but you can still have fun!");
}
```

### `if/else if/else` statement

```java
if (isFridayThe13th) {
    System.out.println("It's Friday the 13th! Spooky!");
} else if (isHalloween) {
    System.out.println("It's Halloween! Time to get spooky!");
} else {
    System.out.println("It's just another day.");
}
```


✅ As a table, Create a "What should I be for Halloween?" quiz.
✅ Ask at least 3 questions.
✅ Use boolean conditions to determine the costume based on the response.
✅ Print the costume suggestion to the user.
✅ Test it out!

* You could ask questions with 4 choices (A, B, C, D), and each letter could correlate to the suggested costume.
* Alternatively, you could use a scoring system, with each choice being worth a different value. Add them up and the costume suggestion would be based on the score. Example: if they score 1-5 points for costume1, 6-10 points for costume2, etc.

### Input (Possible Solution)

```java
Scanner scanner = new Scanner(System.in);

System.out.println("What should you be for Halloween?");
System.out.println("Answer the following questions to find your perfect costume.\n");

int score = 0; // Initialize the score

// Question 1
System.out.println("Question 1: What is your favorite Halloween color?");
System.out.println("A. Black");
System.out.println("B. Orange");
System.out.println("C. Red");
System.out.print("Your choice (A/B/C): ");
String choice1 = scanner.nextLine();

// Check the answer and update the score
if (choice1 == "A") {
    score += 2;
} else if (choice1 == "B") {
    score += 1;
} else if (choice1 == "C") {
    score += 0;
}

// Add more questions here following the same structure...

// Determine the costume suggestion based on the score
String costumeSuggestion;
if (score >= 6) {
    costumeSuggestion = "Vampire";
} else if (score >= 4) {
    costumeSuggestion = "Witch";
} else if (score >= 2) {
    costumeSuggestion = "Ghost";
} else {
    costumeSuggestion = "Zombie";
}

// Display the costume suggestion
System.out.println("\nBased on your answers, you should be a " + costumeSuggestion + " for Halloween!");

scanner.close();
```
### Output
>   What should you be for Halloween?
> Answer the following questions to find your perfect costume.
>
> Question 1: What is your favorite Halloween color?
> A. Black
> B. Orange
> C. Red
> Your choice (A/B/C): <span style="color:#4994F8">A</span>
>
> Based on your answers, you should be a Zombie for Halloween!

