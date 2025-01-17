class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int windowSum=0;
        int reqSum=k*threshold;
        
        // For first window
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
            if(windowSum>=reqSum){
                count++;
            }
        
        for(int i=k;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-k];
             if(windowSum>=reqSum){
                count++;
            }
        }
        return count;
    }
}