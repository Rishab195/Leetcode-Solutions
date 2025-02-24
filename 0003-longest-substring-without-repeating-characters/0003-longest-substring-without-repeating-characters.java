class Solution {
public int lengthOfLongestSubstring(String s) {
    int ans=0;
    for(int i=0;i<s.length();i++){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int j=i;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                break;
            }
            else{
                map.put(s.charAt(j),1);
                ans=Math.max(ans,j-i+1);
            }
        }
    }
    return ans;
    }
};
