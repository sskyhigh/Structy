package Dynamic_Programming;
import java.util.HashMap;

// O(n) time and space complexity
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {
        return fib(n, new HashMap<>());
    }

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        // return stored value
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;  
    }
}
