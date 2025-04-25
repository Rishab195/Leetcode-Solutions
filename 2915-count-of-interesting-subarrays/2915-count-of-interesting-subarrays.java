class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int m, int k) {
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(nums.get(i)%m==k){
                nums.set(i,1);
            }else{
                nums.set(i,0);
            }
        }
        HashMap<Integer,Long> map=new HashMap<>();
        long res=0;
        long sum=0;

        map.put(0,1L);
        for(int i=0;i<n;i++){
            sum+=nums.get(i);

            int r1=(int)sum%m;
            int r2=(r1-k+m)%m;

            res += map.getOrDefault(r2, 0L);
            map.put(r1, map.getOrDefault(r1, 0L) + 1);
        }
        return res;
    }
}