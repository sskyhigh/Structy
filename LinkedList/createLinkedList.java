package LinkedList;
import java.util.*; 

public class createLinkedList {
    public static void main(String[] args) {
        //System.out.println("hello world");
        printList(createLinkedList(List.of("h","e","y")));
    }
    public static <T> Node<T> createLinkedList(List<T> values){
        return createLinkedList(values, 0);
    }

    public static <T> Node<T> createLinkedList(List<T> values, int index){
        if(index >= values.size()){
            return null; 
        }
        Node<T> newNode = new Node<>(values.get(index));
        newNode.next = createLinkedList(values, index+1);
        return newNode; 
    }
    // for debugging
    public static <T> void printList(Node<T> head){
		Node<T> temp = head; 
		while(temp!=null){
			System.out.print(temp + " ");
			temp = temp.next; 
		}
	}
}
