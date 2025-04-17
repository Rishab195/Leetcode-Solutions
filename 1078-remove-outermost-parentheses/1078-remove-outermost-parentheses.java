class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String res="";
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                if(!stk.isEmpty()){
                    res+=s.charAt(i);
                }
                stk.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(stk.size()>1){
                res+=s.charAt(i);
                }
                stk.pop();
            }
           
        }
        return res;
    }
}