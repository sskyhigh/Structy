package Dynamic_Programming;
import java.util.List; 
import java.util.HashMap; 

public class sumPossible {
    public static void main(String[] args) {
        System.out.println("Hello world"); 
        boolean print = possible(15, List.of(6, 2, 10, 19));
        System.out.println(print);
    }
    public static boolean possible(int amount, List<Integer> numbers){
        return possible(amount, numbers, new HashMap<>());
    }
    public static boolean possible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo){
        if(amount==0){
            return true; 
        }
        if(amount<0){
            return false; 
        }
        if(memo.containsKey(amount)){
            return false;
        }
        for(int number: numbers){
            int result = amount - number; 
            if(possible(result, numbers, memo)){
                memo.put(result, true);
                return true; 
            }
            memo.put(result, false);
        }
        return false; 
    }
}
