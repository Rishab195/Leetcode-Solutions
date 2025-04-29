class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()) return false;
                 if((s.charAt(i)==')' && stk.peek()=='(' ) || (s.charAt(i)==']' && stk.peek()=='[') || (s.charAt(i)=='}' && stk.peek()=='{')){
                stk.pop();
            }else{
                return false;
            }
        }
    }
        return stk.isEmpty();
}
}