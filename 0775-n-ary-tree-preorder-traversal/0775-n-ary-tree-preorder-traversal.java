/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        Stack<Node> s=new Stack();
        if(root==null){
            return list;
        }
        s.push(root);
        while(!s.isEmpty()){
            Node curr=s.pop();
            list.add(curr.val);
            for(int i=curr.children.size()-1;i>=0;i--){
                s.push(curr.children.get(i));
            }
        }
        return list;
    }

    }