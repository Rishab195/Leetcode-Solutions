class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        int maxFreq = 0;
        int mostFrequentElement = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        int left = 0;
        int right = maxFreq;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums.get(i)==mostFrequentElement){
                left++;
                right--;
                if(left*2 > i+1 && right*2>n-i-1){
                    return i;
                }
            }
        }
        return -1;

    }
}