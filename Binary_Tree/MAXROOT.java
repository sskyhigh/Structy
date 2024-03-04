package Binary_Tree;
import java.util.*; 

public class MAXROOT {
    public static void main(String[] args) {
        
    }
    public static Double maxPathSum(Node<Double>root){
        if(root==null){
            return Double.NEGATIVE_INFINITY;
        }
        // leaf has no children. 
        if(root.left==null&&root.right==null) return root.val; 

    }
}
