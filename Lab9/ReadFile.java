import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) {
    
        String filePath = "metamorphosis.txt";

        ArrayList<String> words = new ArrayList(); 

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }
        
        // Display the words
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println(words.size());
    }
}