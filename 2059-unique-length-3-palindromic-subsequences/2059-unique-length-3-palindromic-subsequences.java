class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        Map<Character,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,new int[]{i,i});
            }
            else{
                map.get(c)[1]=i;
            }
        }
        int count=0;
        for(Map.Entry<Character,int[]>entry:map.entrySet()){
            int[]range=entry.getValue();
            if(range[0]==range[1])
            continue;
            Set<Character> uniqueChars=new HashSet<>();
            for(int i=range[0]+1;i<range[1];i++){
                uniqueChars.add(s.charAt(i));
            }
            count+=uniqueChars.size();
        }
        return count;
    }
}