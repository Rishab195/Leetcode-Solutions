class Solution {
    public boolean checkPalindrome(String s,int i,int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return checkPalindrome(s,i+1,j-1);
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        boolean res=checkPalindrome(sb.toString(),0,sb.length()-1);
        if(res){
            return true;
        }
        return false;
    }
}