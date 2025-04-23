class Pair{
    char ch;
    int freq;
    public Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder str=new StringBuilder();
        while(!pq.isEmpty()){
            Pair it=pq.poll();
            char ch1=it.ch;
            int freq1=it.freq;
            while(freq1>0){
                str.append(ch1);
                freq1--;
            }

        }
        return str.toString();
        
    }
}