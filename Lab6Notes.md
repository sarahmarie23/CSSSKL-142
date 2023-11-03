# Week 6 Lab

CSSSKL 142 - 11/03/23

## 🔑 Key Points 🔑

    1. File I/O
    2. Try/Catch
    3. Finding min and max (my way)

## 📄 File I/O : reading in a file

* We use `Scanner` to read in input from the user
> ```Scanner input = new Scanner(System.in);``` 
* But we can also use `Scanner` to read in input from a txt file
> ```Scanner input = null;``` 
>
> ```input = new Scanner(new FileInputStream("fileName.txt"))```
>
* ⚠️ Initialize Scanner outside your try/catch block (will explain in a bit). Initialize it to `null` as a placeholder.
* ⚠️ Then, set it to the name of your file. Make sure it is EXACTLY the correct name!
* ⚠️ Add `throws IOException` to main

```public static void main(String[] args) throws IOException```

* Remember to include these imports (they are included in the starter code)

📝 For reading in files
>```import java.util.Scanner;```
>
> ```import java.io.FileInputStream;```


📝 For writing out a file
> ```import java.io.File;```
>
> ```import java.io.PrintWriter;```
>
> ```import java.io.FileOutputStream;```

📝 For catching exceptions (errors)
> ```import java.io.IOException;```
>
> ```import java.io.FileNotFoundException;```





## 🕸️ Try/Catch

* The purpose of the try/catch block is to catch errors so that you can do something about it if an error happens. 
* You can prevent the program from crashing. 
* Think of `try/catch` like an `if/else`. If the condition in the `if` statement is met, we proceed with what's in the block.
If not, we move onto the `else`.
* In `try/catch`, we try to do what's in the `try`, and if an exception, or error occurs, you can print an error message or call some other code.
* Java has prebuilt exceptions. One you might come across is `InputMismatchException`. This is good if you have a `Scanner` and the user gives you the wrong type of input.

### Example of reading in an int: Before

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");

// Read in an int
int number = scanner.nextInt();
System.out.println("You entered: " + number);

```

* Now let's fix it with a `try/catch` block. Put your code in the `try`and an exception in the `catch`.
* Remember to import `import java.util.InputMismatchException;`

### Code improved with `try/catch` 

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");

try {
    // Attempt to read in an int
    int number = scanner.nextInt();
    System.out.println("You entered: " + number);
    
} catch (InputMismatchException e) {
    // Exception occurrs when the user does not enter an int
    System.out.println("Invalid input. Please enter a valid number.");
}
```

### Notes

> 📝 **try - this is where you read in OR write out**
>
> 📝 **catch - this is where you add an exception. Print an error message to the screen.**
