package LinkedList;

public class insUnivalue {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(7);
        
        a.next = b;
        b.next = c;
        System.out.println(isUnivalueList(a));
    }

    public static <T> boolean isUnivalueList(Node<T> head) {
        T value = head.val;
        while (head != null) {
            if (value != head.val) {
                return false;
            }
            head = head.next; 
        }
        return true;
    }
    public static <T> void printList(Node<T> head){
		Node<T> temp = head; 
		while(temp!=null){
			System.out.print(temp + " ");
			temp = temp.next; 
		}
	}
}
