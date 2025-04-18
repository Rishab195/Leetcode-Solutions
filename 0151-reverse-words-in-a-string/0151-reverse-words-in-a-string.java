class Solution {
    public String reverseWords(String s) {
        String str="";
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;

            str+=s.substring(i+1,j+1) + " ";
        }
        return str.trim();
    }
}