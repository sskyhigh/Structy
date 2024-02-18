package LinkedList;

public class longestStreak {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
		Node<Integer> b = new Node<>(3);
		Node<Integer> c = new Node<>(3);
		Node<Integer> d = new Node<>(3);
		Node<Integer> e = new Node<>(9);
		Node<Integer> f = new Node<>(9);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		// 3 -> 3 -> 3 -> 3 -> 9 -> 9

        int list =  longestStreak(a);
        System.out.println(list);
    }
    public static <T> int longestStreak(Node<T> head){
        int count = 0, max = 0; 
        T previous = null; 
        while(head!=null){
            if(previous == head.val){
                ++count; 
            }
            else{
                // breaking the streak;
                count = 1; 
            }
            if(count > max){
                max = count; 
            }
            previous = head.val; 
            head = head.next; 
        }
        return max; 
    }
}
