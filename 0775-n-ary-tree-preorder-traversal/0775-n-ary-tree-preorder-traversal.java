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

        if(root==null){
            return list;
        }
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            list.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                Node child=node.children.get(i);
                st.push(child);
            }
        }
        return list;
    }
}