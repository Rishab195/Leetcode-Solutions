class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // HashMap<Integer> map1=new HashMap<>();
        // HashMp<Integer> map2=new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     map1.put(nums[i]);
        // }
        // for(int j=0;j<nums2.length;i++){
        //     map2.put(nums2[i]);
        // }
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        int result[]=new int[2];
        int count1=0, count2=0;
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        for(int i:nums1){
            if(set2.contains(i)) count1++;
        }
        for(int i:nums2){
            if(set1.contains(i))count2++;
        }
        result[0]=count1;
        result[1]=count2;
        return result;
    }
}