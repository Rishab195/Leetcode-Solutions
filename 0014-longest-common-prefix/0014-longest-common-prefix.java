class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        int minlen=Integer.MAX_VALUE;
        for(String s: strs){
            minlen=Math.min(minlen,s.length());
        }
        for(int i=0;i<minlen;i++){
            char ch=strs[0].charAt(i);
           for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return strs[j].substring(0,i);
                }
           }
        }
        return strs[0].substring(0,minlen) ;
    }
}