package LinkedList;

import javax.xml.transform.Source;

public class addLists {
    // solving recursively
    public static void main(String[] args) {
        Node<Integer> a1 = new Node<>(9);
        Node<Integer> a2 = new Node<>(8);
        a1.next = a2;  
        // 9 -> 8

        Node<Integer> b1 = new Node<>(7);
        Node<Integer> b2 = new Node<>(4);
        b1.next = b2;
        // 7 -> 4
        printList(addLists(a1, b1));
    }

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2) {
        return addLists(head1, head2, 0);
    }

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2, int carry) {
        if (head1 == null && head2 == null && carry == 0) {
            return null;
        }
        int value1 = head1 == null ? 0 : head1.val;
        int value2 = head1 == null ? 0 : head2.val;
        int sum = value1 + value2 + carry;
        int nextCarry = sum >= 10 ? 1 : 0;
        int digit = sum % 10;
        Node<Integer> newNode = new Node<>(digit);
        Node<Integer> next1 = head1 == null ? null : head1.next;
        Node<Integer> next2 = head2 == null ? null : head2.next;
        newNode.next = addLists(next1, next2, nextCarry);
        return newNode;
    }
    public static <T> void printList(Node<T> head){
		Node<T> temp = head; 
		while(temp!=null){
			System.out.print(temp + " ");
			temp = temp.next; 
		}
	}
}
