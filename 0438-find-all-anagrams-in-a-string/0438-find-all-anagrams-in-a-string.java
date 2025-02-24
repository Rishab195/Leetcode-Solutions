class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int[]countS=new int [26];
        int[]countP=new int[26];
        
        for(int i=0;i<p.length();i++){
            countP[p.charAt(i)-'a']++;
        }
        for(int j=0;j<p.length();j++){
            countS[s.charAt(j)-'a']++;
        }
        if(isMatch(countS,countP)){
            result.add(0);
        }
        
        for(int k=p.length();k<s.length();k++){
            countS[s.charAt(k)-'a']++;
            countS[s.charAt(k-p.length())-'a']--;

            if(isMatch(countS,countP)){
                result.add(k-p.length()+1);
            }
        }
        return result;

    }
    public boolean isMatch(int[]countS,int[]countP){
        return Arrays.equals(countS,countP);
    }
}