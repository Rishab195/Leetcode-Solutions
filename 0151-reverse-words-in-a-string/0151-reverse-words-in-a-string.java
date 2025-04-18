class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;

            str.append(s.substring(i+1,j+1)).append(' ');
        }
        return str.toString().trim();
    }
}