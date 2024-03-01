package Binary_Tree;

import java.util.*;

public class treeSum {
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

        System.out.println(treeSum(a));
    }

    public static int treeSum(Node<Integer> root) {
        if (root == null)
            return 0;
        return (root.val) + treeSum(root.left) + treeSum(root.right);
    }
}
