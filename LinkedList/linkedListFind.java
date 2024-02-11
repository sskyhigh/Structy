package LinkedList;

import java.util.*;
// recursion
public class linkedListFind {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(linkedListFind(a, "c"));
    }
    public static <T> boolean linkedListFind(Node<T> head, T target){
        if(head==null){
            return false;
        }
        if(head.val == target){
            return true;
        }
        return linkedListFind(head.next, target);
    }
}
