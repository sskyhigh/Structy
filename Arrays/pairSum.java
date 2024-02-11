package Arrays;

import java.util.*;

public class pairSum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(twiceSum(List.of(3, 2, 5, 4, 1), 8));
    }

    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); ++i) {
            for (int j = i + 1; j < numbers.size(); ++j) {
                if (numbers.get(i) + numbers.get(j) == target) {
                    nums.add(i);
                    nums.add(j);
                    return nums;
                }
            }
        }
        return null;
    }

    public static List<Integer> twiceSum(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> previousNumbers = new HashMap<>();
        for (int i = 0; i < numbers.size(); ++i) {
            int num = numbers.get(i);
            int complement = target - num;
            if(previousNumbers.containsKey(complement)){
                return List.of(i, previousNumbers.get(complement));
            }
            previousNumbers.put(num, i);
        }
        return null;
    }
}
