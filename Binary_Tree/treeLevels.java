package Binary_Tree;

import java.util.*;

public class treeLevels {
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

        System.out.println(treeLevels(a));
    }

    public static <T> List<List<T>> treeLevels(Node<T> root) {
        List<List<T>> levels = new ArrayList<>();
        treeLevels(root, 0, levels);
        return levels;
    }

    public static <T> void treeLevels(Node<T> root, int index, List<List<T>> levels) {
        if (root == null)
            return;
        if (index == levels.size()) {
            List<T> list = new ArrayList<>();
            list.add(root.val);
            levels.add(list);
        } else {
            levels.get(index).add(root.val);
        }
        treeLevels(root.left, index + 1, levels);
        treeLevels(root.right, index + 1, levels);
    }

}
