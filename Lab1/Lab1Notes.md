# Week 1 Lab

CSSSKL 142 - 9/29/23

    1. BlueJ Installation/Tutorial
    2. Print Statements
    3. Fixing Syntax Errors
    4. Simple Methods

## ☕ BlueJ Installation

* Download link can be found [here](https://www.bluej.org/) bluej.org
* Create a new Project to store all your files for this course
* Click the 'New Class' button to start a new file
* Give it a name
* Make sure 'Class Language' is Java and 'Class Type' is Class

### Suggestions and Options

* Clear the prefilled text and start from a blank page
    > ✨ This will help you learn the basic setup, which looks like this:

```java
public class YourClassName {
    public static void main(String[] args) {
        // code goes here

    }
}
```

* Under preferences > Editor, you can turn on or off Scope Highlighting
    > ✨ This might be helpful for keeping track of your code's structure
* Check 'Display line numbers'
* In the terminal window, check 'Clear screen at method call' in the Options tab, so the output erases each time you run your code

## 🖨️ Print Statements

* ✅ Create a "Hello World!" print statement on your laptop.

> 📝 `println` will move to a new line after the String is printed.
>
> 📝 `print` will print the next String right next to it.

### Input
```java
System.out.println("Hello World!");
System.out.print("One Pumpkin Spice Latte, please ");
System.out.print("with whipped cream");
```

### Output
```
Hello World!
One Pumpkin Spice Latte, please with whipped cream
```

## 🛠️ Fixing Syntax Errors ##

### My tips and strategies

1. **Start from the bottom** and comment out piece by piece until you get no syntax errors.

    > 📝 `//` to comment out a single line.
    >
    > 📝 `/*` *[code goes here]* `*/` to comment out multiple lines.
    >
    > 🔷 In BlueJ, hightlight lines of code and click F8 to comment it out and F7 to uncomment. If you don't like those buttons, you can change them under Options > Key Bindings...

2. **Fix errors at the top first**; sometimes, this will fix errors later in the code.

3. **Read the error messages**. Sometimes it tells you exactly what you need to do.

4. **Read your code line by line** and simulate what's happening on paper or a whiteboard.

### Common Syntax Errors

    ⚠️ Missing semicolon
    ⚠️ Mismatched quotes " ", brackets { }, parentheses ( ); missing a single quote or bracket
    ⚠️ Using ' ' instead of " "
    ⚠️ Spelling mistakes
    ⚠️ Variable was not declared
    ⚠️ You commented something out and forgot to uncomment it

* ✅ Let's debug it together. Anything obvious stand out to you?

```java
// Welcome message
System.out.println("Welcome to the Coffee Shop");

// Coffee order details
String coffeeType = "Espresso";
int sugarSpoons = 2;
int creamSpoons = 1;
int cupsOrdered = 3;

// Display coffee recipe
System.out.println("Your " + coffeeType + " is ready!');
System.out.println("Sugar: " + sugarSpoons + " spoons");
System.out.println("Cream: " + creamSpoons + " spoons");

// Calculate the total price of the coffee
double pricePerCup = 2.5;
double totalPrice = cups * pricePerCup;  

// Display the total price
System.out.println("Total Price: $" + (totlPrice);

## Closing message
System.out.println("Enjoy your coffee!")
```

## 🧩 Simple Methods

> 📝 A Method is a block of code that performs a specific task or function.

* ✅ Work in pairs on whiteboards or on a piece of paper.
* ✅ Design a method that prints to the screen a message saying a customer's name and their coffee order, so they can come pick it up. Declare variables for the customer's name and their order.
* ✅ Test it out on your laptop.

### Possible solution

```java
public static void orderMessage() {
    String customerName = "Sarah";
    String coffeeType = "caramel macchiatto";
    System.out.println(customerName + ", your " + coffeeType + " is ready! " + customerName + "!!");
}
```
