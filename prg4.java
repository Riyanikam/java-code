Q4:Write a Java Program to find the duplicate characters in a string.
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello world! This is a sample string. Count the number of words in this string.";

       HashMap<String, Integer> wordCountMap = new HashMap<>();

       
        String[] words = inputString.split("\\s+");

       
        for (String word : words) {
            
            word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

           
            if (!word.isEmpty()) {
                word = word.toLowerCase(); // Convert word to lowercase for case insensitivity
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

         System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
