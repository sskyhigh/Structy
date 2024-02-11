package Arrays;

import java.util.*;

public class mostFrequentChar {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            // checking if doesn't exist
            if (count.get(c) == null) {
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        return 'c';
    }
}
