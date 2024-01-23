package Dynamic_Programming;

import java.util.*;

public class maxPathSum {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        List<List<Integer>> grid = List.of(
                List.of(1, 3, 12),
                List.of(5, 1, 1),
                List.of(3, 6, 1));
        System.out.println(mathSum(grid));
    }

    public static int mathSum(List<List<Integer>> grid) {
        return mathSum(0, 0, grid, new HashMap<>());
    }

    public static int mathSum(int row, int col, List<List<Integer>> grid, HashMap<List<Integer>, Integer> memo) {
        int sum = 0;

        // checking out of bounds
        if (row == grid.size() || col == grid.get(0).size()) {
            return 0;
        }
        // if reach to the last, return its values
        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return grid.get(row).get(col);
        }
        
        List<Integer> pos = List.of(row, col);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }
        
        int down = mathSum(row+1, col, grid, memo);
        int right = mathSum(row, col+1, grid, memo);

        sum = grid.get(row).get(col) + Math.max(down, right);

        memo.put(pos, sum);
        // go down
        
        return sum;
    }
}