class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
         k=k%length;
        if(k==0){
            return;
        }
        // for(int i=0;i<k;i++){
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,length-1);
        // }
    }
    public void reverse(int[]nums,int start,int end)
    {
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        
    }
}