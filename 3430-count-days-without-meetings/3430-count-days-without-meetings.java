class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int last=0;
        int count=0;
        for(int [] i : meetings){
            int sDay=i[0];
            int eDay=i[1];
            if(sDay>last){
                 if((sDay-last)>1){
                    count+=(sDay-last)-1;
                }
            }
            last=Math.max(last,eDay);
        }
        int rem=days-last;
        if(rem>0){
            count+=rem;
        }
        return count;
    }
}