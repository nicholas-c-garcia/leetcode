package Leetcode75.BinaryTreeDFS;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
    public static void main(String[] args) {
        LeafSimilar new1 = new LeafSimilar();
        TreeNode root1 = new TreeNode(3, 
                         new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(14))), 
                         new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode root2 = new TreeNode(3, 
                         new TreeNode(5, new TreeNode(6), new TreeNode(71)), 
                         new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        System.out.println(new1.leafSimilar(root1, root2));
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> rootOneList = new ArrayList<>();
        List<Integer> rootTwoList = new ArrayList<>();

        check(root1, rootOneList);
        check(root2, rootTwoList);

        return rootTwoList.equals(rootOneList);

    }

    private void check(TreeNode root, List<Integer> rootOneList) {
         if (root == null){
             return;
         }

         if (root.right == null && root.left == null){
             rootOneList.add(root.val);
         }
         
         check(root.left, rootOneList);
         check(root.right, rootOneList);
         
    }
}
