package LinkedList;

import java.util.*;

public class mergeList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(12);
        Node<Integer> e = new Node<>(20);
        Node<Integer> f = new Node<>(28);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 -> 7 -> 10 -> 12 -> 20 -> 28

        Node<Integer> q = new Node<>(6);
        Node<Integer> r = new Node<>(8);
        Node<Integer> s = new Node<>(9);
        Node<Integer> t = new Node<>(25);
        q.next = r;
        r.next = s;
        s.next = t;

        Node<Integer> node = mergeLists(a, q);
        sort(node);
        printList(node);
    }

    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {

        Node<Integer> head = head1;
        Node<Integer> tail = head;
        Node<Integer> current1 = head1.next;
        Node<Integer> current2 = head2;
        int count = 0;
        while (current1 != null && current2 != null) {
            if (count % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            ++count;
        }
        if (current1 != null) {
            tail.next = current1;
        }
        if (current2 != null) {
            tail.next = current2;
        }
        return head;
    }

    public static void printList(Node<Integer> head) {
        while(head!=null){
            System.out.print(head + " ");
            head = head.next; 
        }
    }
    public static void sort(Node<Integer> head){
        Node<Integer> current = head; 
        int temp; 
        if(head==null){
            return; 
        }
        while(current!=null){
            Node<Integer> index = current.next; 
            while(index!=null){
                if(current.val > index.val){
                    temp = current.val;
                    current.val = index.val; 
                    index.val = temp; 
                }
                index = index.next; 
            }
            current = current.next; 
        }
    }
}
