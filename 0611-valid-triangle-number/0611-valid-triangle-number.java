class Solution {
    public int triangleNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=len-1;i>1;i--){
            int x=0, y=i-1;
            while(x<y){
                if(nums[x]+nums[y]>nums[i]){
                    ans+=(y-x);
                    y--;
                }
                else{
                    x++;
                }
            }
        }
        return ans;
    }
}