class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> lenArray=new ArrayList<>(n);
        ArrayList<Integer> prevEle=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            lenArray.add(1);
            prevEle.add(-1);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(lenArray.get(i)<lenArray.get(j)+1){
                    lenArray.set(i,lenArray.get(i)+1);
                    prevEle.set(i,j);
                    }
                }
            }
        }
        int maxEle=lenArray.get(0);
        int index=0;
        for(int i=1;i<n;i++){
            if(lenArray.get(i)>maxEle){
                maxEle=lenArray.get(i);
                index=i;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int k=index;
        while(k!=-1){
            res.add(nums[k]);
            int prevValue=prevEle.get(k);
            k=prevValue;
        }
        return res;
    }
}