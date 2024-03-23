package Binary_Tree;

import java.util.*;

public class levelAverages {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);
        
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(levelAverages(a));
    }

    public static List<Double> levelAverages(Node<Integer> root) {
        List<List<Double>> levels = new ArrayList<>();
        fillLevels(root, 0, levels);
        List<Double> averages = new ArrayList<>();
        for (List<Double> level : levels) {
            System.out.println(level);
            Double sum = 0.0;
            for (Double val : level) {
                sum += val;
            }
            averages.add(sum / level.size());
        }
        return averages; 
    }

    public static void fillLevels(Node<Integer> root, int index, List<List<Double>> levels) {
        if (root == null)
            return;
        if (index == levels.size()) {
            List<Double> newLevel = new ArrayList<>();
            newLevel.add(Double.valueOf(root.val));
            levels.add(newLevel);
        } else {
            levels.get(index).add(Double.valueOf(root.val));
        }
        fillLevels(root.left, index + 1, levels);
        fillLevels(root.right, index + 1, levels);
    }
}
