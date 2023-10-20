# Week 4 Lab

CSSSKL 142 - 10/20/23

## 🔑 Key Points 🔑

    1. For loops (1D)
    2. For loops (2D)

## 🔁 For Loops (1D)

* For loops are a tool you can use to perform action a repeated amount of times. 
* They are good when you know exactly how many times the task needs to be repeated.
* For loops have 3 parts (refer to ICA as example)

> 📝 ***initialization expression*** - Initializes a variable (only once). Choose an `int` like `int i = 0;` (Start)
>
> 📝 ***boolean expression*** - The loop will continue until this expression evaluates to `false` (Stop)
>
> 📝 ***update expression*** - Updates the initialization value (Step)



Now we'll try together (goal: problem solving using a for loop)
* ✅ Problem: Bottles of beer song from Lab 1
* ✅ Which parts are being repeated? These are perfect for a loop.
* ✅ Write a method that takes in the starting amount of bottles, but uses a for loop to reduce repetition.

Let's write the loop together
> * ✅ **Initialization expression**: However many bottles of beer we are starting with
> * ✅ **Boolean expression**: Stop when we get no more bottles
> * ✅ **Update expression**: Remove 1 bottle each round

### New method with a loop start
```java
public static void newSong(int numBottles) {
    for(int i = numBottles; i > 0; i--) {

    }
}
```

> * ✅ Now lets copy paste the methods inside this loop
> * ✅ Notice how we can call other methods from this method? It's just like calling other methods from the main method
> * ✅ Instead of `numBottles`, we are using `i`, the value we initialized in the for loop.

### Input

```java
public static void newSong(int numBottles) {
    for(int i = numBottles; i > 0; i--) {
        System.out.print(i);
        onWall();
        System.out.print(i);
        botBeer();
        takeOneDown();
        System.out.print(i-1);
        onWall();
        System.out.println(); 
    }
}
```
### Output
```
5 bottles of beer on the wall
5 bottles of beer
Take one down and pass it around
4 bottles of beer on the wall

4 bottles of beer on the wall
4 bottles of beer
Take one down and pass it around
3 bottles of beer on the wall

3 bottles of beer on the wall
3 bottles of beer
Take one down and pass it around
2 bottles of beer on the wall

2 bottles of beer on the wall
2 bottles of beer
Take one down and pass it around
1 bottles of beer on the wall

1 bottles of beer on the wall
1 bottles of beer
Take one down and pass it around
0 bottles of beer on the wall
```
### Analysis
> * ✅ Looks good until you get to "2 bottles of beer" because that's when the verse changes
> * ✅ Instead of `takeOneDown()`, a custom String is used.
> * ✅ This is the perfect place for an `if` statement
> * ✅ You'll also need an `if` statement for the `onWall()` vs `oneOnWall()` methods

```java
public static void newSong(int numBottles) {
    for(int i = numBottles; i > 0; i--) {
        System.out.print(i);
        onWall();
        System.out.print(i);
        botBeer();

        if(i == 2) {
            System.out.println("If one should happen to fall");
        } else {
            takeOneDown();
        }
        System.out.print(i-1);

        if(i == 2) {
            oneOnWall();
        } else {
            onWall();
        }
        
        System.out.println(); 
    }
}
```

```
5 bottles of beer on the wall
5 bottles of beer
Take one down and pass it around
4 bottles of beer on the wall

4 bottles of beer on the wall
4 bottles of beer
Take one down and pass it around
3 bottles of beer on the wall

3 bottles of beer on the wall
3 bottles of beer
Take one down and pass it around
2 bottles of beer on the wall

2 bottles of beer on the wall
2 bottles of beer
If one should happen to fall
1 bottle of beer on the wall

1 bottles of beer on the wall
1 bottles of beer
Take one down and pass it around
0 bottles of beer on the wall
```

### Now we just need to accomodate for the last verse

> * ✅ Let's make a separate method, and call it from our new method

```java
public static void lastVerse() {
    System.out.print("1 ");
    oneOnWall();
    System.out.print("1 ");
    System.out.println(" bottle of beer");
    System.out.println("Take it down and pass it around");
    System.out.println("no more bottles of beer on the wall");
}
```

```
...
3 bottles of beer on the wall
3 bottles of beer
Take one down and pass it around
2 bottles of beer on the wall

2 bottles of beer on the wall
2 bottles of beer
If one should happen to fall
1 bottle of beer on the wall
1  bottle of beer on the wall
1  bottle of beer
Take it down and pass it around
no more bottles of beer on the wall

1 bottles of beer on the wall
1 bottles of beer
Take one down and pass it around
0 bottles of beer on the wall
```

### Watch out for 'off-by-one' errors

*  This happens when your loop doesn't start or stop when you want it to
* You also might need to make other adjustments like adding in the extra space after the `oneOnWall()` method

```java
for(int i = numBottles; i > 1; i--) {
    System.out.print(i);
    onWall();
    System.out.print(i);
    botBeer();

    if(i == 2) {
        System.out.println("If one should happen to fall");
    } else {
        takeOneDown();
    }
    System.out.print(i-1);

    if(i == 2) {
        oneOnWall();
        System.out.println(); 
        lastVerse();
    } else {
        onWall();
    }
    
    System.out.println(); 
}
```
* You could clean up the `if statements` if you like

## ♾️ Killing an Infinite Loop
**ctrl + w** to close the output **then click the arrow** to end 

## 🔁📦For Loops (2D)

