class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int []ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
           int j=0;
           while(nums2[j]!=nums1[i]){
            j++;
           }
           for(int k=j;k<nums2.length;k++){
            if(nums2[k]>nums1[i]){
                ans[i]=nums2[k];
                break;
            }
           }
        }
        return ans;
    }
}