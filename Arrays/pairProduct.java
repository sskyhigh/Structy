package Arrays;
import java.util.*;

public class pairProduct {
    public static void main(String[] args) {
        System.out.println(pairProduct(List.of(3,2,5,4,1), 8));
    }

    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> previous = new HashMap<>(); 
        for(int i = 0; i<numbers.size(); ++i){
            int num = numbers.get(i);
            int complement = target / num; 
            if(previous.containsKey(complement)){
                return List.of(i, previous.get(complement));
            }
            // map each number to its index
            previous.put(num, i);
        }
        return null; 
    }
}
