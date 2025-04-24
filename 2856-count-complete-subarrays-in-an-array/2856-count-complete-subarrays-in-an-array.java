class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        int total=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int uniqEle=set.size();
        for(int i=0;i<n;i++){
            HashSet<Integer> countSet=new HashSet<>();
            for(int j=i;j<n;j++){
                countSet.add(nums[j]);
                if(set.size()==countSet.size()){
                    total++;
                }
            }
        }
        return total;
    }
}