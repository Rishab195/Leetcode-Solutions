class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int count=0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            count+=1;
            i--;
        }
        return count;
    }
}