import java.util.*;

public class Rebuild {
    public static void main(String args[]) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        TreeNode hashtree = reConstructBinaryTree(pre, in);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre(0));

        
        
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        boolean flag = false;

        TreeNode.left = reConstructBinaryTree(pre, in)
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}