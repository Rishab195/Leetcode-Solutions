class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
        }
        int maxEle=arr[0];
        for(int i=1;i<n;i++){
            if(maxEle<arr[i]){
                maxEle=arr[i];
            }
        }
        return maxEle;
    }
}