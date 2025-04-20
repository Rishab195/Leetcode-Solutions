class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder sb=new StringBuilder();
        if(strs==null){
            return "";
        }
        String pref=strs[0];
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
           int len=strs[i].length();
             if (len < minlen) {
                minlen = len;
                pref = strs[i];
            }
        }
        for(int i=0;i<strs.length;i++){
            String newS="";
            for(int j=0;j<minlen;j++){
                if(strs[i].charAt(j)!=pref.charAt(j)){
                    break;
                }
                newS += strs[i].charAt(j);
            }
            pref = newS;
            if(pref.length()<minlen){
                minlen = pref.length();
            }
        }
        return pref;
    }
}