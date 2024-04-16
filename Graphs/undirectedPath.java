package Graphs;

import java.util.*;
import java.util.HashSet;

public class undirectedPath {
    public static void main(String[] args) {
        List<List<String>> edges = List.of(
            List.of("i", "j"),
            List.of("k", "i"),
            List.of("m", "k"),
            List.of("k", "l"),
            List.of("o", "n")
          );
          System.out.println(undirectedPath(edges, "j", "m"));
    }

    public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
        Map<String, List<String>> graph = buildGraph(edges);
        HashSet<String> visited = new HashSet<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add(nodeA);
        while (!queue.isEmpty()) {
            String node = queue.remove();
            if (node == nodeB)
                return true;
            for (String neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }

    public static Map<String, List<String>> buildGraph(List<List<String>> edges) {
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> pair : edges) {
            String a = pair.get(0);
            String b = pair.get(1);
            if (!graph.containsKey(a))
                graph.put(a, new ArrayList<>());
            if (!graph.containsKey(b))
                graph.put(b, new ArrayList<>());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }
}
