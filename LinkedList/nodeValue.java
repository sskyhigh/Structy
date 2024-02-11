package LinkedList;

import java.util.*;

public class nodeValue {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(getNodeValue(a, 2));
    }

    public static <T> T getNodeValue(Node<T> head, int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.val;
        }
        return getNodeValue(head.next, index - 1);
    }
}
