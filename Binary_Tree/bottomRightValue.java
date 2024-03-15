package Binary_Tree;

import java.util.*;

public class bottomRightValue {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(bottomRightValoue(a));
    }

    public static <T> T bottomRightValoue(Node<T> root) {
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        Node<T> node = null;
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return node.val;
    }
}
