class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int result=0;
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++){
           if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
            count+=1;
           }
            else{
                result+=(count*(count+1))/2;
                count=0;
            }
        }
    result+=(count*(count+1))/2;
    return result;
        
    }

}