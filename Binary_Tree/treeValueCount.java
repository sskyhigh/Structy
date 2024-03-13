package Binary_Tree;

import java.util.*;

public class treeValueCount {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(5);
        Node<Integer> c = new Node<>(1);
        Node<Integer> d = new Node<>(1);
        Node<Integer> e = new Node<>(8);
        Node<Integer> f = new Node<>(7);
        Node<Integer> g = new Node<>(1);
        Node<Integer> h = new Node<>(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;

        System.out.println(treeValueCount(a, 9));
    }

    public static <T> int treeValueCount(Node<T> root, T target) {
        if (root == null)
            return 0;
        int count = (root.val == target) ? 1 : 0;
        return count + treeValueCount(root.left, target) + treeValueCount(root.right, target);
    }
}
