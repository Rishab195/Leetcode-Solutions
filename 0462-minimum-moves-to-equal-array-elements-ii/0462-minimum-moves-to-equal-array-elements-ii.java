class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        int mid=nums[n/2];
        for(int i=0;i<n;i++){
            count+=Math.abs(nums[i]-mid);
        }
        return count;
    }
}