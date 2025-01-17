class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int minSum=Integer.MAX_VALUE;
        while(l<=r){
        int sum=0;
            for(int i=0;i<l;i++){
                sum+=nums.get(i);
            }
            if(sum>0){
                minSum=Math.min(minSum,sum);
            }
            for(int i=l;i<n;i++){
                sum=sum-nums.get(i-l);
                sum+=nums.get(i);
                if(sum>0){
                    minSum=Math.min(minSum,sum);
                }
            }
            l++;
        }
            if(minSum!=Integer.MAX_VALUE){
                return minSum;
            }
            return -1;

        
    }
}