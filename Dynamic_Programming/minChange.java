package Dynamic_Programming;
import java.util.List; 
import java.util.HashMap; 
public class minChange {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(change(8, List.of(1,5,4,12)));
        System.out.println(change(13, List.of(1, 9, 5, 14, 30)));
    }
    public static int change(int n, List<Integer> coins){
        return change(n, coins, new HashMap<>());
    }
    public static int change(int n, List<Integer> coins, HashMap<Integer, Integer> data){
        if(n==0){
            return 0; 
        }
        if(n<0){
            return -1; 
        }
        // this means that data has been solved prior
        if(data.containsKey(n)){
            return data.get(n);
        }
        int minCoins = -1; 
        for(int coin: coins){
            int subAmount = n - coin ; 
            int subCoin = change(subAmount, coins, data);
            if(subCoin!=-1 || minCoins==-1){
                int second = subCoin + 1; 
                if(second < minCoins || minCoins==-1){
                    minCoins = second; 
                }
            }
        }
        data.put(n, minCoins);
        return minCoins;
    }
}
