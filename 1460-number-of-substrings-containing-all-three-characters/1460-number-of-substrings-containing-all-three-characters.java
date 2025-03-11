class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int left=0;
        
        for(int right=0;right<n;right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()==3){
                count+=n-right;
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);

                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
            left++;
            }
        }
        return count;
    }
}