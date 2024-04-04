Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello world!";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        
        String[] words = inputString.split("\\s+");

        
        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

       
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
