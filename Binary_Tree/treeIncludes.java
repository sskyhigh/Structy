package Binary_Tree;

import java.util.*;

public class treeIncludes {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        Node<String> g = new Node<>("g");
        Node<String> h = new Node<>("h");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;

        System.out.println(treeIncludes(a, "p"));
    }
    public static boolean treeIncludes(Node<String> root, String target){
        if(root==null) return false; 
        if(root.val==target) return true; 
        return treeIncludes(root.left, target) || treeIncludes(root.right, target); 
    }
}
