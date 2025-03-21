class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            if(isDistinct(s.substring(i,i+3))){
                count++;
            }
        }
        return count;
    }
    public boolean isDistinct(String s){
        if(s.charAt(0)==s.charAt(1) || s.charAt(1)==s.charAt(2) || s.charAt(0)==s.charAt(2)){
            return false;
        }
        return true;
    }
}