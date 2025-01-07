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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftheight=0,rightheight=0;
        if(root.left!=null){
           leftheight=maxDepth(root.left); 
        }
        if(root.right!=null){
            rightheight=maxDepth(root.right);
        }
        return Math.max(leftheight,rightheight)+1;
    }
}