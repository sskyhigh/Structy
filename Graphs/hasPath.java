package Graphs;

import java.util.List;
import java.util.Stack;
import java.util.*;
import java.util.Map; 

public class hasPath {
    public static void main(String[] args) {
		Map<String, List<String>> graph = Map.of(
            "f", List.of("g", "i"),
            "g", List.of("h"),
            "h", List.of(),
            "i", List.of("g", "k"),
            "j", List.of("i"),
            "k", List.of()
          );
          System.out.println(hasPath(graph, "f", "k"));
    }

    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
        if (src == dst)
            return true;

        for (String neighbor : graph.get(src)) {
            if (hasPath(graph, neighbor, dst))
                return true;
        }
        return false;
    }
}
