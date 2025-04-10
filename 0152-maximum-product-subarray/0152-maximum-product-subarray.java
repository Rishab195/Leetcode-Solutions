class Solution {
    public int maxProduct(int[] nums) {
         int ans=Integer.MIN_VALUE;
        int leftP=1;
        int rightP=1;
        for(int i=0;i<nums.length;i++){
        if(leftP==0){
            leftP=1;
        }
        if(rightP==0){
            rightP=1;
        }
        leftP*=nums[i];
        rightP*=nums[nums.length-1-i];
        ans=Math.max(ans,Math.max(leftP,rightP));
        }
        return ans;
        

    }
}