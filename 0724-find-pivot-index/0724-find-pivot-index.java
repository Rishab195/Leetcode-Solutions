class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length, sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int lsum=0,rsum=sum;
        for(int i=0;i<n;i++){
            rsum-=nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}

 