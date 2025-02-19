class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int result=0;
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=0;i<n-2;i++){
           if(nums[i+1]-nums[i]==nums[i+2]-nums[i+1]){
            count+=1;
            result+=count;
           }
            else{
                count=0;
            }
        }

    return result;
        
    }

}