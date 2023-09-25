import java.util.Scanner;

public class Lab3Filler {
    public static void main(String[] args) {
        // Logical AND (&&), OR (||), NOT (!)
        
        boolean isHalloween = false;
        boolean hasSpookyCostume = true;
        boolean isFridayThe13th = true;
        
        if ((isHalloween && hasSpookyCostume) || (isFridayThe13th)) {
            System.out.println("You're ready for Halloween!");
        } else {
            System.out.println("You might need to prepare a bit more for Halloween.");
        }
        
        // Control/Branching
        // if Statement
        if (isHalloween) {
            System.out.println("It's Halloween! Time to get spooky!");
        }
        
        // if/else statement
        if (isHalloween) {
            System.out.println("It's Halloween! Time to get spooky!");
        } else {
            System.out.println("It's not Halloween, but you can still have fun!");
        }
        
        // if/else if/else statement
        if (isFridayThe13th) {
            System.out.println("It's Friday the 13th! Spooky!");
        } else if (isHalloween) {
            System.out.println("It's Halloween! Time to get spooky!");
        } else {
            System.out.println("It's just another day.");
        }
        
        // GROUP ACTIVITY
        // What should I be for Halloween? Quiz
        // Ask at least 3 questions. 
        // Use boolean conditions to determine the costume based on the response.
        // Print the costume suggestion to the user. 
        // Test it out!
        
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
        
    }
}
