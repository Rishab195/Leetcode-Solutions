class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: gifts){
            pq.offer(num);
        }
        for(int i=0;i<k;i++){
            int removeNo=pq.poll();
            int reducedNo=(int)Math.sqrt(removeNo);
            pq.offer(reducedNo);
        }
        
        long result=0;
        while(!pq.isEmpty()){
            result+=pq.poll();
        }
        return result;
    }
}