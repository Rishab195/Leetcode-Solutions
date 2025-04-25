class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Long> map=new HashMap<>();
        map.put(0,1L);
            int sum=0;
            int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            int r1=((sum%k)+k)%k;
            res+=map.getOrDefault(r1,0L);
            map.put(r1,map.getOrDefault(r1,0L)+1);
        }
        return res;
    }
}