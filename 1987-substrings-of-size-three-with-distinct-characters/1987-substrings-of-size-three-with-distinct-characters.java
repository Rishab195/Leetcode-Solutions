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
    public boolean isDistinct(String str){
        return str.charAt(1)!=str.charAt(0) && str.charAt(0)!=str.charAt(2) && str.charAt(1)!=str.charAt(2);
    }
}