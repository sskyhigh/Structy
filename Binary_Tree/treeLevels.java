package Binary_Tree;
import java.util.*; 

public class treeLevels {
    public static void main(String[] args) {
        
    }
    public static <T> List<List<T>> treeLevels(Node<T> root){
        List<List<T>> levels = new ArrayList<>(); 
        treeLevels(root, 0, levels);
        return levels; 
    }
    public static <T> void treeLevels(Node<T> root, int levelIndex, List<List<T>> levels){
        if(root==null) return; 
        treeLevels(root.left, levelIndex+1, levels);
        treeLevels(root.right, levelIndex+1, levels);
    }
}
