class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                if(!s.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            char ch=stack.pop();
            str.append(ch);
        }
        return str.reverse().toString();
    }
}