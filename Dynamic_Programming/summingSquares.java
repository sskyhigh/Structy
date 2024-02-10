package Dynamic_Programming;
import java.util.*; 

public class summingSquares {
    public static void main(String[] args) {
        System.out.println(squares(12));
    }
    public static int squares(int n){
        return squares(n, new HashMap<>()); 
    }
    public static int squares(int n, HashMap<Integer, Integer> memo){
        int min = Integer.MIN_VALUE;  
        //int second = Integer.MIN_VALUE; 
        if(n < 0){
            return Integer.MIN_VALUE; 
        }
        if(n==0){
            return 0; 
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        for(int i = 0; i<Math.sqrt(i); ++i){
            int square = i*i;
            int second = squares(n-square, memo);
            if(second < min){
                min = second; 
            }
        }
        memo.put(n, min);
        return min; 
    }
}
