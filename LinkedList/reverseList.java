// recursion variant 
package LinkedList;

import java.util.*;

public class reverseList {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node<String> List = reverseList(a);
        printList(List);
    }

    public static <T> Node<T> reverseList(Node<T> head) {
        return reverseList(head, null);
    }

    public static <T> Node<T> reverseList(Node<T> head, Node<T> prev) {
        if (head == null) {
            return prev;
        }
        Node<T> next = head.next;
        head.next = prev;
        return reverseList(next, head);
    }
    public static <T> void printList(Node<T> List){
        while(List!=null){
            // remember to create override method
            System.out.print(List + " ");
            List = List.next; 
        }
    }
}
