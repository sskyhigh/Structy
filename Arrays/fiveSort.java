package Arrays;

import java.util.*;

public class fiveSort {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> fives = new ArrayList<>(Collections.nCopies(20000, 5));
        List<Integer> fours = new ArrayList<>(Collections.nCopies(20000, 4));
        List<Integer> array = new ArrayList<>();
        array.addAll(fives);
        array.addAll(fours);
        System.out.println(optimized(array));
    }

    public static List<Integer> fiveSort(List<Integer> array) {
        for (int i = 0; i < array.size(); ++i) {
            for (int j = i + 1; j < array.size(); ++j) {
                if (array.get(i) == 5) {
                    Collections.swap(array, i, j);
                }
            }
        }
        return array;
    }

    // optimized version
    public static List<Integer> optimized(List<Integer> array) {
        int i = 0;
        int j = array.size()-1;
        while (i < j) {
            if (array.get(j) == 5) {
                j -= 1;
            } else if (array.get(i) != 5) {
                i += 1;
            } else {
                Collections.swap(array, i, j);
            }
        }
        return array;
    }
}
