class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }
        int countS1[]=new int[26];
        int countS2[]=new int[26];

        for(char ch: s1.toCharArray()){
            countS1[ch-'a']++;
        }

        int i=0 , j=0;
        while(j<s2.length()){
            countS2[s2.charAt(j)-'a']++;

            if((j-i+1)==s1.length()){
                if(isEqual(countS1,countS2))
                    return true;
            }
            if(j-i+1<s1.length())
                j++;
            else{
                countS2[s2.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
    return false;
    }
    public boolean isEqual(int[] countS1,int[] countS2){
        if(Arrays.equals(countS1,countS2)){
            return true;
        }
        return false;
    }
}