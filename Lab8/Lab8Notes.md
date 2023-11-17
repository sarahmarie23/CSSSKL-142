# Week 8 Lab

CSSSKL 142 - 11/17/23

## 🔑 Key Points 🔑

    1. 1D Arrays
    2. Array vs ArrayList
    3. 2D Arrays
    4. Fun facts

## 🏘️ 1D Arrays : Our first data structure

* We can store a piece of information in a String, int, char, etc. But what if we want to store a *group* of Strings, ints, or chars?
* This is where arrays and **data structures** come in.
* Data structures are a systematic way of storing, organizing and manipulating information.
* An array has the advantage of being able to quickly access an element, given its *index*.

### Properties of arrays

* Need to initialize with the data type and size (if you are not providing the elements initially), and the type and size cannot change.
* Must contain the same type of element (example: all Strings).
* Arrays use 0-indexing (like most things in Java).
* Can get the length using `.length`. This is a *property*, NOT a method like `.size()`
* Arrays, like Strings are **objects**. They have methdos we can use.
* We've learned about **primitives** like `int`, `char`, and `boolean`. They do not have methods.
* We will learn more about **object-oriented programming** in the final two weeks.

### How is an array stored in memory? An analogy

> Imagine you are going to your friend's house. You don't remember their exact address, but you know they live in the 3rd house down from the corner of H Street and 10th Street. You can put those cross streets into your phone, and just count 3 houses over to get to their house.
>
> You remembered the start of the street in order to get to your friend's house. An array is accessed in a similar fashion. By going to the address of the first element, the index tells you how many spaces away from the beginning you need to go to access the desired element.

### Initializing arrays

* **Method 1**: With elements declared

    ```int[] myArray = {1, 2, 3};```

* **Method 2**: Without elements

    ```int[] myArray2 = new int[5];```

📝 **By default, int elements are initialized to 0**  

## 📦 Array vs ArrayList?

✅ Arrays and ArrayLists are both data structures.

✅ ArrayLists are **dynamic**. They can grow and shrink.

✅ You don't need to declare the size when you initialize ArrayLists.

✅ ArrayLists have their own set of methods.

## 2D arrays

* An array holds a group of elements, ordered by index. But what if we wanted to hold a group of *arrays*? Now we would have a 2D array!
* Can you have an array of arrays of arrays? Yes! We could go on *array* 😂

### Initializing 2D arrays

* **Method 1**: With elements declared

    ```java
    String[][] playlists = {
        {"s1", "s2", "s3"},
        {"s4", "s5", "s6"},
    };
    ```

* **Method 2**: Without elements

    ```
    String[][] playlists = new String[2][3];
    ```
* The first value in `String[2][3]` refers to the number of **rows**, or number of arrays.
* The second value refers to the number of **columns**, or number of elements in each array.
* In this example, we have 2 sets of playlists with 3 songs in each.


### Connection to for loops

* When we studied double nested for loops, like for drawing ascii art, we talked about how the outside loop goes row-by-row and the inside loop goes char-by-char.
* When you are going through a 2D array, you also use a double nested for loop. The outer loop goes row-by-row, while the inner goes column by column.

    ```java
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(array[i][j]);
            }
        }
    ```
✅ How do you figure out what value to use for `rows` and `columns`?
* With a regular array, you use `arrayName.length`.
* To get the number of rows for the outer loop, think "How many arrays are in this array?" So you can just use `arrayName.length`  
* The inner loop is a little different. You need to know how many elements are in each array. So you need to get the length of a single array. You can do this by `arrayName[0].length`

## 🚀 Array fun facts
* Arrays in Java are passed ***by reference***. This means that you can pass an array into a method, change it, and you don't have to return it back for the changes to be saved!

```java
public class ArrayReferenceExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Before modification
        System.out.println("Before modification:");
        printArray(array);
        
        // Modifying the array inside a method
        modifyArray(array);
        
        // After modification
        System.out.println("\nAfter modification:");
        printArray(array);
    }
    
    // Method to modify the array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Doubling each element
        }
    }
    
    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```
📝 **By default, int elements are initialized to 0**

📝 **By default, String elements are initialized to `null`**

📝 **By default, boolean elements are initialized to `false`** 


* `String[] args` is a 1D array!

```java
public static void main(String[] args) {...}
```
* We use an IDE to run Java programs, but you can run a program from the command line and pass in *arguemnts* for args, and the main method can access those arguments like you would in an array anywhere else. `args[0]` for example would get you the first argument passed in.
