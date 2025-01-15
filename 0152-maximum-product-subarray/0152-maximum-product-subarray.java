class Solution {
    public int maxProduct(int[] nums) {
        // int product=1;
        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int curr=nums[i];
        //     product=Math.max(curr,curr*product);
        //     ans=Math.max(product,ans);

        // }
        // return ans;
        int ans=Integer.MIN_VALUE;
        int maxProduct=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                maxProduct*=nums[j];
                ans=Math.max(ans,maxProduct);
            }
            maxProduct=1;
        }
        return ans;
    }
}