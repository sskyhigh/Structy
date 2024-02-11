package LinkedList;

import java.util.*;

public class sumList {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(8);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(-1);
        Node<Integer> e = new Node<>(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(sumList(a));
    }
    public static int sumList(Node<Integer> head){
        if(head==null){
            return 0; 
        }
        return head.val + sumList(head.next);
    }
}
