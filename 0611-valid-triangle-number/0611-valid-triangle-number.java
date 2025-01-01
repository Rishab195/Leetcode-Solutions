class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0,n=nums.length;
        for(int i=n-1;i>1;i--){
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