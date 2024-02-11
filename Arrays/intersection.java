package Arrays;

import java.util.*;

public class intersection {
    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        System.out.println(intersection(a, b));
    }

    public static List<Integer> intersection(List<Integer> ListA, List<Integer> ListB) {
        Map<Integer, Integer> seen = new HashMap<>();
        List<Integer> intersect = new ArrayList<>();
        for (Integer num : ListA) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        for (Integer num : ListB) {
            if (seen.containsKey(num) && seen.get(num) > 0) {
                intersect.add(num);
                seen.put(num, seen.getOrDefault(num, seen.get(num) - 1));
            }
        }
        return intersect;
    }
}
