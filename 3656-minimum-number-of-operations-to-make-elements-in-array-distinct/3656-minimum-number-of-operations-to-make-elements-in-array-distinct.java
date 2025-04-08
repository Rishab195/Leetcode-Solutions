class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int index=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            if(map.getOrDefault(nums[i],0)>0){
                index=i;
                break;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return (index+3)/3;
    }
}