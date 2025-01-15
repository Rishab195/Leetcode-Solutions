class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int leftprod=1;
        int rightprod=1;
        for(int i=0;i<nums.length;i++){

            if(leftprod==0){
                leftprod=1;
            }
            if(rightprod==0){
                rightprod=1;
            }

            leftprod*=nums[i];
            rightprod*=nums[nums.length-1-i];

            ans=Math.max(ans,Math.max(leftprod,rightprod));
        }
        return ans;
    }
}