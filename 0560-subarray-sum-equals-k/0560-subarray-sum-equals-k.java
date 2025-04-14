class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        int[]prefSum=new int[n];
        prefSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefSum[i]=prefSum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(prefSum[i]==k) count++;
            int value=prefSum[i]-k;
            if(map.containsKey(value)){
                count+=map.get(value);
            }
            map.put(prefSum[i],map.getOrDefault(prefSum[i],0)+1);
        }
    return count;
    }
}