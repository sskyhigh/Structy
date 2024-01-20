package Dynamic_Programming;

import java.util.HashMap;
import java.util.List;

public class countPaths {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(paths(List.of(
                List.of("O", "O"),
                List.of("O", "O"))));
    }

    public static int paths(List<List<String>> grid) {
        return paths(0, 0, grid, new HashMap<>());
    }

    public static int paths(int row, int col, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        // check if out of bounds
        if (row == grid.size() || col == grid.get(0).size()) {
            return 0;
        }
        // if hit X: wall
        if (grid.get(row).get(col) == "X") {
            return 0;
        }
        // bottom right
        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return 1;
        }
        List<Integer> pos = List.of(row, col);
        if(memo.containsKey(pos)){
            return memo.get(pos);
        }

        // row+1 = down, col+1 = right.
        int result = paths(row + 1, col, grid, memo) + paths(row, col + 1, grid, memo);
        memo.put(pos, result);
        return result; 
    }
}
