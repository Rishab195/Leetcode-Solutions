class Solution {
public int lengthOfLongestSubstring(String s) {
    Set<Character> a=new HashSet<>();
    int left=0;
    int right=0;
    int maxSubLength=0;
    while(right<s.length())
    {
        if(a.contains(s.charAt(right)))
        {
            a.remove(s.charAt(left));
            left++;
        }
        else{
            a.add(s.charAt(right));
            maxSubLength=Math.max(maxSubLength,right-left+1);
            right++;
        }
    }
    return maxSubLength;
    }
};





