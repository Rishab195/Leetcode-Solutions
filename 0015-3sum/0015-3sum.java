class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int a=nums[i];
            for(int j=i+1;j<n;j++){
                int b=nums[j];
                int rem=-(a+b);
                if(map.containsKey(rem) && map.get(rem)>j){
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.addAll(Arrays.asList(a,b,rem));
                    Collections.sort(arr);
                    if(!set.contains(arr)){
                    set.add(new ArrayList<>(arr));
                    res.add(new ArrayList<>(arr));
                    }
                }
            }
        }
        return res;
    }
}