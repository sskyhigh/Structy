package LinkedList;

import java.util.*;

class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

public class listValues {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(linkedListValues(a));
    }

    public static List<String> linkedListValues(Node<String> head) {
        List<String> result = new ArrayList<>();
        Node<String> current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }
}
