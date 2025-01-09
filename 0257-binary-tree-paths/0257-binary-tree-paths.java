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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        if(root.left==null && root.right==null){
            list.add(Integer.toString(root.val));
            return list;
        }
        for(String s: binaryTreePaths(root.left)){
            list.add(Integer.toString(root.val)+"->"+s);
        }
        for(String s: binaryTreePaths(root.right)){
            list.add(Integer.toString(root.val)+"->"+s);
        }
        return list;
    }
}