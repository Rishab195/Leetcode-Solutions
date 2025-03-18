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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true; // if both are false
        }
        if(p==null|| q==null){
            return false; // if anyone is false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    //     List<Integer> list1=new ArrayList<>();
    //     List<Integer> list2=new ArrayList<>();
    //     inorder(p,list1);
    //     inorder(q,list2);
    //     return list1.equals(list2);
    // }
    // public void inorder(TreeNode p,List<Integer>list1){
    //     if(p==null){
    //         list1.add(null);
    //         return ;
    //     }
    //     inorder(p.left,list1);
    //     list1.add(p.val);
    //     inorder(p.right,list1);
        
    // }
    //  public void inorder1(TreeNode q,List<Integer>list2){
    //     if(q==null){
    //         list.
    //         return;
    //     }
    //     inorder1(q.left,list2);
    //     list2.add(q.val);
    //     inorder1(q.right,list2);
    // }
    }
}