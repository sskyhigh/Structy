package Binary_Tree;

import java.util.*;

// recursive method. 
class Node<T> {
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class depthFirstValues {
    public static void main(String[] args) {
        System.out.println("Hello World");
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

        // a
        // / \
        // b c
        // / \ \
        // d e f

        // [a,b,d,e,c,f]
        System.out.println(depthFirstValues(b));
    }

    public static List<String> depthFirstValues(Node<String> root) {
        // base case
        if (root == null) {
            return List.of();
        }
        List<String> leftVals = depthFirstValues(root.left); // [b,d,e]
        List<String> rightVals = depthFirstValues(root.right); // [c,f]
        List<String> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(leftVals);
        result.addAll(rightVals);
        return result;
    }
}
