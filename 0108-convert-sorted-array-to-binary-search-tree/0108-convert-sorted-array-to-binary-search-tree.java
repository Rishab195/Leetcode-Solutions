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
    public TreeNode insertFunc(int []nums,int l,int r){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode root=new TreeNode();
        root.val=nums[mid];
        root.left=insertFunc(nums,l,mid-1);
        root.right=insertFunc(nums,mid+1,r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return insertFunc(nums,0,nums.length-1);
    }
}