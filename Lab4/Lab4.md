# Week 4 Lab

CSSSKL 142 - 10/20/23

## 🔑 Key Points 🔑

    1. For loops (1D)
    2. For loops (2D)

## 🔁 For Loops (1D)

* For loops are a tool you can use to perform action a repeated amount of times. 
* They are good when you know exactly how many times the task needs to be repeated.
* For loops have 3 parts

> 📝 ***initialization expression*** - Initializes a variable (only once). Choose an `int` like `int i = 0;` (Start)
>
> 📝 ***boolean expression*** - The loop will continue until this expression evaluates to `false` (Stop)
>
> 📝 ***update expression*** - Updates the initialization value (Update)

* Seeing it in action, simple example: Printing out all the regular iPad models (1-10).
* ✅ What will happen inside this loop?

### Input

```java
public static void iPadModels() {
    for(int start = 1; start <= 10; start++) {
        System.out.println("iPad " + start);
    }
}
```

### Output

> iPad 1<br>
> iPad 2<br>
> iPad 3<br>
> iPad 4<br>
> iPad 5<br>
> iPad 6<br>
> iPad 7<br>
> iPad 8<br>
> iPad 9<br>
> iPad 10<br>

Now we'll try together (goal: problem solving using a for loop)
* ✅ Problem: Buying an iPhone 15
* ✅ You want to start saving money for the new iPhone 15. You currently have $0 in the bank.
* ✅ You decide to save $27 a week. It costs $799.
* ✅ If you save up until the end of the year (about 11 weeks), will you have enough to buy it?
* ✅ Print to the screen this phrase for each week you save.
"On week `<weeknum>`, I have a total of $`<dollars>` saved.
* ✅ You can disregard taxes and fees.
-----
* ✅ What keywords stand out to you?
* ✅ Find the variables. What is changing?
* ✅ How do we know where to start, stop, and update?

### Input

```java
public static void iPhoneSaving() {
    int bankAccount = 0;
    int amountWeekly = 27;
    for(int week = 1; week <= 11; week++) {
        bankAccount = bankAccount + amountWeekly;
        System.out.println("On week " + week + " I have a total of $" + bankAccount + " saved");
        
    }
}
```
### Output

> On week 1 I have a total of $27 saved<br>
> On week 2 I have a total of $54 saved<br>
> On week 3 I have a total of $81 saved<br>
> On week 4 I have a total of $108 saved<br>
> On week 5 I have a total of $135 saved<br>
> On week 6 I have a total of $162 saved<br>
> On week 7 I have a total of $189 saved<br>
> On week 8 I have a total of $216 saved<br>
> On week 9 I have a total of $243 saved<br>
> On week 10 I have a total of $270 saved<br>
> On week 11 I have a total of $297 saved<br>
## 🔁📦For Loops (2D)
        
