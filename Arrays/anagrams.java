package Arrays;

import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(anagrams("clock", "kcolc"));
    }

    private static HashMap<Character, Integer> charCount(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            // if key does not exist
            if (count.get(c) == null) {
                // initialize the value to 0
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        return count;
    }

    public static boolean anagrams(String s1, String s2) {
        HashMap<Character, Integer> count1 = charCount(s1);
        HashMap<Character, Integer> count2 = charCount(s2);
        return count1.equals(count2);
    }
}
