class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums,upper)-countPairs(nums,lower-1);
    }
    public long countPairs(int[]nums,int bound){
        int n=nums.length;
        long count=0;
        int j=n-1;

        for(int i=0;i<n;i++){
            while(j>i && (nums[i]+nums[j])>bound){
                j--;
            }
            if(j>i){
                count+=(j-i);
            }
        }
        return count;
    }
}