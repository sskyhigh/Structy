package Arrays;

import java.util.*;

public class mostFrequentChar {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(mostFrequentChar("mississippi"));
    }

    public static HashMap<Character, Integer> charCount(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            // if key does not exist
            // add a key
            if (!count.containsKey(c)) {
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        return count;
    }

    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> count = charCount(s);
        // this is null character
        char mostFrequent = '\0';
        for(char ch: s.toCharArray()){
            if(mostFrequent == '\0' || count.get(ch) > count.get(mostFrequent)){
                mostFrequent = ch; 
            }
        }
        return mostFrequent; 
    }
}
