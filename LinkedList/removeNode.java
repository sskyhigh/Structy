package LinkedList;


public class removeNode {
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
        
        // a -> b -> c -> d -> e -> f
        // a -> b -> d -> e -> f
        printList(removeNode(a, "c"));
    }

    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        Node<T> prev = null, current = head;
        // if the target is at the start
        if (targetVal == head.val) {
            return head.next;
        }
        while (current != null) {
            if (current.val == targetVal) {
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }
    public static <T> void printList(Node<T> head){
		Node<T> temp = head; 
		while(temp!=null){
			System.out.print(temp + " ");
			temp = temp.next; 
		}
	}
}
