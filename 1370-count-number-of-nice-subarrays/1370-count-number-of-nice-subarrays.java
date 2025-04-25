class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMostk(nums,k)-countAtMostk(nums,k-1);
    }
    public int countAtMostk(int[]nums,int k){
       int left=0;
       int count=0;
       int res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                count++;
            }
            while(count>k){
                if(nums[left]%2==1){
                    count--;
                }
                left++;
            }
            res+=right-left+1;
        }
    return res;
    }
}