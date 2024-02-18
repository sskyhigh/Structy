package LinkedList;

public class insertNode {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d
        printList(insertNode(a, "x", 2));
    }

    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
        return insertNode(head, null, value, index);
    }

    public static <T> Node<T> insertNode(Node<T> head, Node<T> prev, T value, int index) {
        if (index == 0) {
            Node<T> newNode = new Node(value);
            newNode.next = head;
            prev.next = newNode;
            if (prev != null) {
                prev.next = newNode;
            }
            return newNode;
        }
        head.next = insertNode(head.next, head, value, index-1);
        return head;
    }

    public static <T> void printList(Node<T> head) {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }
    }
}
