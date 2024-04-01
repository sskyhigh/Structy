package Binary_Tree;

import java.util.*;

public class LeafList {
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

        System.out.println(leafList(a));
    }

    public static <T> List<T> leafList(Node<T> root) {
        List<T> leaves = new ArrayList<>(); 
        fillLeaves(root, leaves);
        return leaves; 
    }
    public static <T> void fillLeaves(Node<T> root, List<T> leaves){
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            leaves.add(root.val);
        fillLeaves(root.left, leaves);
        fillLeaves(root.right, leaves);
    }
}
