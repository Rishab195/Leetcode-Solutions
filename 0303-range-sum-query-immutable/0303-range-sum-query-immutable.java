class NumArray {
    int[] prefArr;
    public NumArray(int[] nums) {
        //Build prefix array
        prefArr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefArr[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        // sum left to right
        if(left==0){
            return prefArr[right];
        }else{
            return prefArr[right]-prefArr[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */