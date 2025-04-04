/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return null;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(leftheight<rightheight){
            return lcaDeepestLeaves(root.right);
        }
        if(leftheight>rightheight){
            return lcaDeepestLeaves(root.left);
        }
        return root;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myHeight=1+ Math.max(leftHeight,rightHeight);
        return myHeight;
    }
}