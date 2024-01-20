package Dynamic_Programming;

import java.util.HashMap;
import java.util.List;

public class countPaths {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static int paths(List<List<String>> grid) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        int count = 1;
        for (int row = 0; row < grid.size(); ++row) {
            for (int col = 0; col < grid.get(0).size(); ++col) {
                if (check(row, col, grid, memo)) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static boolean check(int row, int col, List<List<String>> grid, HashMap<Integer, Integer> memo) {
        return false;
    }
}
