class Solution {
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> output=new ArrayList<>();
        int index=0;
        SolveRec(index,s,output,ans);
        return ans;
    }

    public void SolveRec(int i,String s,List<String> output,List<List<String>> ans){
        if(i>=s.length()){
            ans.add(new ArrayList<>(output));
            return;
        }

        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                output.add(s.substring(i,j+1));
                SolveRec(j+1,s,output,ans);
                output.remove(output.size()-1);
            }
        }

    }

}