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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Stack<List<Integer>> s=new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> currLevel=new ArrayList<>();
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode curr=q.poll();
                currLevel.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            s.add(currLevel);
        }
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }
}