package Leetcode75.BinaryTreeDFS;

public class MaxDepth {
    public static void main(String[] args) {
        MaxDepth new1 = new MaxDepth();
        TreeNode root = new TreeNode(-3, new TreeNode(1), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new1.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        else {
            return Math.max(1 + maxDepth(root.right), 1 + maxDepth(root.left));
        }
    }
}
