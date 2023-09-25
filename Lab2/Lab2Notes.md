# Week 2 Lab

CSSSKL 142 - 10/6/23

## 🔑 Key Points 🔑

    1. Scanner Class
    2. Methods Part 2

## 🏫 Scanner Class

* Remember that we use the `Scanner` class to take in user input, so that we can do something with that data.

> 📝 `import java.util.Scanner;` add this at the very top, above the class
>
> 📝 `Scanner theScannerName = new Scanner(System.in);` create a `Scanner` object
>
> 📝 `nextLine()` method to read in a `String` value
>
> 📝 `nextInt()` method to read in an `int` value
>
> 📝 `next()` method to read in a single chunk of input
>
> 📝 `close()` method to close the `Scanner`
>> This ensures that the program can properly clean-up memory and use it for other tasks. It's like returning a borrowed book to the library when you're done so the next person can check it out.

* ✅ Create a Pizza Preferences Survey
* ✅ Requirements: Use at least one instance of the `nextLine()` and `nextInt()` methods.
* ✅ You can do this in the `main()` method; doesn't need to be a separate method
* ✅ Don't forget to add a `close()` method!

### Input (Possible Solution)
```java
// Create a Scanner object
Scanner surveyScanner = new Scanner(System.in);

// Display a welcome message and ask for the participant's name
System.out.println("Welcome to the Pizza Preferences Survey!");
System.out.print("Please enter your name: ");
String name = surveyScanner.nextLine();

// Ask for the participant's favorite type of pizza
System.out.print("What is your favorite type of pizza? (e.g., Pepperoni, Margherita): ");
String favoritePizza = surveyScanner.nextLine();

// Ask for the participant's pizza rating
System.out.print("On a scale of 1 to 10, how would you rate pizza? ");
int rating = surveyScanner.nextInt();

// Display the survey summary
System.out.println("\nSurvey Summary:");
System.out.println("Participant: " + name);
System.out.println("Favorite Pizza: " + favoritePizza);
System.out.println("Rating: " + rating);

// Close the Scanner
scanner.close();
```

### Output (Possible Solution)

> Welcome to the Pizza Preferences Survey!<br>
> Please enter your name: <span style="color:#4994F8">Bobby</span><br>
> What is your favorite type of pizza? (e.g., Pepperoni, Margherita): <span style="color:#4994F8">Pineapple</span><br>
> On a scale of 1 to 10, how would you rate pizza? <span style="color:#4994F8">8</span><br>
>
> Survey Summary:<br>
> Participant: Bobby<br>
> Favorite Pizza: Pineapple<br>
> Rating: 8


⚠️ Be careful with `next()` vs `nextLine()`. `next()` only reads in a single chunk of text at a time (this is called *tokenization*). `nextLine()` will read in the entire line, including whitespace. I recommend using `nextLine()` instead of `next()` for the purposes of this class.


## 🧩Methods Part 2

* Last week, we worked with methods with print statements.
* They had a `void` return type, meaning that they returned nothing.
* They also had no *arguments*.

* ✅ Take your Pizza Preferences Survey code and place it inside it's own method.
* ✅ Requirements:
    * The method takes in at least one *argument*.
    * The method returns a `String` or `int` or `double`.
* ✅ Call your method in the `main()` method.

### Input (Possible Solution)

```java
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String restaurantName = "Papa John's";
        System.out.println(PizzaSurvey(restaurantName));
    }
    public static String PizzaSurvey(String restaurant) {
        // Create a Scanner object
        Scanner surveyScanner = new Scanner(System.in);
        
        // Display a welcome message and ask for the participant's name
        System.out.println("Welcome to " + restaurant + " Pizza Preferences Survey!");
        System.out.print("Please enter your name: ");
        String name = surveyScanner.next();
        
        // Ask for the participant's favorite type of pizza
        System.out.print("What is your favorite type of pizza? (e.g., Pepperoni, Margherita): ");
        String favoritePizza = surveyScannerr.nextLine();
        
        // Ask for the participant's pizza rating
        System.out.print("On a scale of 1 to 10, how would you rate pizza? ");
        int rating = surveyScanner.nextInt();
        
        // Close the Scanner
        surveyScanner.close();
        
        String summary = "\nSurvey Summary:" + "\nParticipant: " + name + "\nFavorite Pizza: " + favoritePizza + "\nRating: " + rating;
        
        return summary;
    }
}
```

### Output


> Welcome to Papa John's Pizza Preferences Survey!<br>
> Please enter your name: <span style="color:#4994F8">Bobby</span><br>
> What is your favorite type of pizza? (e.g., Pepperoni, Margherita): <span style="color:#4994F8">Pineapple</span><br>
>On a scale of 1 to 10, how would you rate pizza? <span style="color:#4994F8">8</span>
>
> Survey Summary:<br>
> Participant: Bobby<br>
> Favorite Pizza: Pineapple<br>
>Rating: 8
