package Binary_Tree;
import java.io.*; 
import java.util.*; 

public class breadthFirstValues {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Node<String> a = new Node<>("a");
		Node<String> b = new Node<>("b");
		Node<String> c = new Node<>("c");
		Node<String> d = new Node<>("d");
		Node<String> e = new Node<>("e");
		Node<String> f = new Node<>("f");

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		
		//System.out.println(depthFirstValues(a));
		System.out.println(breadthFirstValues(a));
    }
    public static List<String> breadthFirstValues(Node<String> root){
        if(root==null) return List.of(); 
        List<String> results = new ArrayList<>(); 
        Queue<Node<String>> queue = new ArrayDeque<>(); 
        queue.add(root);
        while(!queue.isEmpty()){
            Node<String> current = queue.remove(); 
            results.add(current.val);
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
        return results; 
    }
}
