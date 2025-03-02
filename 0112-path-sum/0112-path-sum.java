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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.offer(new Pair<>(root,targetSum-root.val));

        while(!q.isEmpty()){
            Pair<TreeNode,Integer> curr=q.poll();
            TreeNode node=curr.getKey();
            int remSum=curr.getValue();
            if(node.left==null && node.right==null && remSum==0){
                return true;
            }
            if(node.left!=null){
                q.offer(new Pair<>(node.left,remSum-node.left.val));
            }
            if(node.right!=null){
                q.offer(new Pair<>(node.right,remSum-node.right.val));
            }
        }
        return false;
    }
}