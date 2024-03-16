package Binary_Tree;

import java.util.*;

public class allTreePaths {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        List<List<String>> paths = allTreePaths(a);
        for (List<String> path : paths) {
            System.out.println(path);
        }
    }

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        if (root.left == null && root.right == null) {
            return List.of(List.of(root.val));
        }

        List<List<T>> paths = new ArrayList<>();
        List<List<T>> leftPaths = allTreePaths(root.left);
        for (List<T> path : leftPaths) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(path);
            paths.add(newPath);
        }
        List<List<T>> rightPaths = allTreePaths(root.right);
        for (List<T> path : rightPaths) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(path);
            paths.add(newPath);
        }
        return paths;
    }
}
