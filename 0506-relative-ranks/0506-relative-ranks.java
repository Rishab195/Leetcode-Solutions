class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: score){
            pq.offer(num);
        }
        int n=score.length;
        String[] arr=new String[n];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        int rank=1;
        while(!pq.isEmpty()){
            int curscore=pq.poll();
            int index=map.get(curscore);
            if(rank==1){
                arr[index]="Gold Medal";
            }
            else if(rank==2){
                arr[index]="Silver Medal";
            }
            else if(rank==3){
                arr[index]="Bronze Medal";
            }
            else{
                arr[index]=String.valueOf(rank);
            }
            rank++;
        }  
        return arr;
    }
}