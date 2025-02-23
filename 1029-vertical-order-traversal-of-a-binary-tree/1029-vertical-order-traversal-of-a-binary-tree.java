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

 class Pair{
    TreeNode node;
    int row;
    int col;
    Pair(TreeNode node,int row,int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,TreeMap<Integer,List<Integer>>> map=new TreeMap<>();

        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair it=q.poll();
            TreeNode node=it.node;
            int x=it.row;
            int y=it.col;
           
            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new ArrayList<>());
            map.get(x).get(y).add(node.val);

            if(node.left!=null){
                q.add(new Pair(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,x+1,y+1));
            }
        }
        for(TreeMap<Integer,List<Integer>> ys: map.values()){
            list.add(new ArrayList<>());
            for(List<Integer>nodes:ys.values()){
                Collections.sort(nodes);
                list.get(list.size()-1).addAll(nodes);
            }
        }
        return list;
    }
}