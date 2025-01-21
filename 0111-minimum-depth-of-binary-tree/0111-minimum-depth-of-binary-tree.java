class Solution {
    public int depth(TreeNode root) {
        if (root == null) {
            return 0; 
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return depth(root.right) + 1;
        }
        if (root.right == null) {
            return depth(root.left) + 1;
        }
        return Math.min(depth(root.left), depth(root.right)) + 1;
    }

    public int minDepth(TreeNode root) {
        return depth(root);
    }
}
