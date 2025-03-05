class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int i: nums){
        //     if(set.contains(i)){
        //         return i;
        //     }
        //     else{
        //         set.add(i);
        //     }
        // }
        // return 1;


        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }
}