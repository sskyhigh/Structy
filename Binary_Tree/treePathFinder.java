package Binary_Tree;
import java.util.*; 

public class treePathFinder {
    public static void main(String[] args) {
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

        System.out.println(pathFinder(a, "e"));
    }

    public static <T> List <T> pathFinder(Node<T> root, T target){
        List<T> path = pathFinderRecursive(root, target);
        if(path==null) return null;
        else Collections.reverse(path);
        return path; 
    }

    public static <T> List<T> pathFinderRecursive(Node<T> root, T target){
        if(root==null) return null; 
        if(root.val == target){
            List<T> list = new ArrayList<>(); 
            list.add(root.val); return list; 
        }
        List<T> leftSide = pathFinderRecursive(root.left, target);
        if(leftSide!=null){
            leftSide.add(root.val); return leftSide; 
        }
        List<T> rightSide = pathFinderRecursive(root.right, target);
        if(rightSide!=null){
            rightSide.add(root.val); return rightSide; 
        }
        return null;
    }
}
