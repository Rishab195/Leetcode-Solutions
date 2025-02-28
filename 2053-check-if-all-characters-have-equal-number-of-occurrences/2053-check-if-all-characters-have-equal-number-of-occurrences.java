class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq=map.get(s.charAt(0));

        for(int val:map.values())
        {
            if(val!=freq){
                return false;
            }
        }
        return true;

    }
}