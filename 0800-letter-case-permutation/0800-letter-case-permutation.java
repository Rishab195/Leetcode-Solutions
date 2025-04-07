class Solution {
    public List<String> letterCasePermutation(String s) {
        int n=s.length();
        List<String> ans=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        SolveRec(0,s,ans,str);
        return ans;
    }
    public void SolveRec(int index,String s,List<String> ans,StringBuilder str){
        if(index>=s.length()){
            ans.add(str.toString());
            return;
        }
        char ch=s.charAt(index);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            str.append(Character.toLowerCase(ch));
            SolveRec(index + 1, s, ans, str);
            str.deleteCharAt(str.length() - 1);

            str.append(Character.toUpperCase(ch));
            SolveRec(index + 1, s, ans, str);
            str.deleteCharAt(str.length() - 1);
        }else{
        str.append(ch);
            SolveRec(index + 1, s, ans, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}