class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // for(int i=m+n;i>=0;i--){

        //     int j=n-1;
        //     if(nums1[i-n]>nums2[n]){
        //         nums1[i]=nums1[i-n];
        //     }
        //     else{
        //         nums
        //     }  
        // }

        int k=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        while(i>=0){
            nums1[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }

    }

}