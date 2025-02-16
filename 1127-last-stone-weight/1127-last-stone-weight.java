class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num: stones){
            pq.offer(num);
        }
        while(pq.size()!=1){
            if(pq.size()==2){
                int w3=pq.poll();
                return w3-pq.peek();
            }
            int w1=pq.poll();
            int w2=pq.poll();
            if(w1!=w2){
                int reducedWeight=w1-w2;
                pq.offer(reducedWeight);
            }
        }
        return pq.peek();
    }
}