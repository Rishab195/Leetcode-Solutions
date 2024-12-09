class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
    public String compare(String str){
        StringBuilder sb=new StringBuilder();
        char[] ca=str.toCharArray();

        for(int i=0;i<ca.length;i++){
            if(ca[i]=='#' && sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            if(ca[i]!='#')sb.append(ca[i]);
        }
        return sb.toString();
    }
}