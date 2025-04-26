class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums1.length;
        int[]res=new int[n];
        Arrays.fill(res,-1);

        for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && nums2[i]>=stk.peek()){
                stk.pop();
            }
            if(!stk.isEmpty()){
                map.put(nums2[i],stk.peek());
            }else{
                map.put(nums2[i],-1);
            }
            stk.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}