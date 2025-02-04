class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result=new ArrayList<>();
        if (s.length() < p.length()) return result;
        int countS[]=new int[26];
        int countP[]= new int[26];

        for(char k: p.toCharArray()) countP[k-'a']++;

        for (int i = 0; i < p.length(); i++) countS[s.charAt(i) - 'a']++;
        if(isMatch(countS,countP)) result.add(0);

        for(int j=p.length();j<s.length();j++){
            countS[s.charAt(j)-'a']++;
            countS[s.charAt(j-p.length())-'a']--;

            if(isMatch(countS,countP))result.add(j-p.length()+1);
        }
        return result;

    }
    private boolean isMatch(int[] countS, int []countP) {
    
    return Arrays.equals(countS,countP);
}
}