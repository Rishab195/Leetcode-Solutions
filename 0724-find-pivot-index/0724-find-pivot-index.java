class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int lsum=0;
        int rsum=sum;
        for(int j=0;j<nums.length;j++){
            rsum-=nums[j];
            if(lsum==rsum){
                return j;
            }
            lsum+=nums[j];
        }
        return -1;
    }
}