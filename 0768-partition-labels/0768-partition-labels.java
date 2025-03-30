class Solution {
    public List<Integer> partitionLabels(String s) {
        s.toCharArray();
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        int maxIndex=-1;
        while(maxIndex<n-1){
            int window = map.get(s.charAt(maxIndex+1));
            for(int i=maxIndex+1;i<window;i++){
                window=Math.max(window,map.get(s.charAt(i)));
            }
            res.add(window-maxIndex);
            maxIndex = window;
        }
        return res;
    }
}