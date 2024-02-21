package LinkedList;

import javax.xml.transform.Source;

public class addLists {
    public static void main(String[] args) {
        Node<Integer> a1 = new Node<>(1);
        Node<Integer> a2 = new Node<>(2);
        Node<Integer> a3 = new Node<>(6);
        a1.next = a2;
        a2.next = a3;
        // 1 -> 2 -> 6

        Node<Integer> b1 = new Node<>(4);
        Node<Integer> b2 = new Node<>(5);
        Node<Integer> b3 = new Node<>(3);
        b1.next = b2;
        b2.next = b3;
        // 4 -> 5 -> 3 

        addLists(a1, b1);
        // 5 -> 7 -> 9
    }

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2) {

        return null;
    }
}
