package leetcode.easy.binarytree;

public class E104 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) {this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root){
        return findMaxDepth(root, 1);
    }

    public static int findMaxDepth(TreeNode root, int depth){
        if (root == null) return depth - 1;
        return Math.max(findMaxDepth(root.left, depth + 1), findMaxDepth(root.right, depth + 1));
    }

    public static void main(String[] args) {
    }
}
