package LinkedList;

public class zipperLists {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
        return zipperLists(head1, head2, 0);
    }

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2, int count) {
        // if they run out of nodes, return the remaining values
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (count % 2 == 0) {
            head1.next = zipperLists(head1.next, head2, count++);
            return head1;
        } else {
            head2.next = zipperLists(head2.next, head1, count++);
            return head2;
        }
    }
}
