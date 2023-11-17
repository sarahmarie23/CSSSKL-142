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