package Binary_Tree;

import java.util.*;

public class treeMinValue {
    public static void main(String[] args) {
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(-2.);
        Node<Double> f = new Node<>(1.);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(treeMinValue(a));
    }

    public static Double treeMinValue(Node<Double> root) {
        if (root == null)
            return 0.0;
        double min = Math.min(treeMinValue(root.left), treeMinValue(root.right));
        return Math.min(root.val, min);
    }
}
