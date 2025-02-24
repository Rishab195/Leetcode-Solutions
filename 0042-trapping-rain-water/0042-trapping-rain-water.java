class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0){
            return 0;
        }
        int totalWater=0;
        int LeftHeight[]=new int[n];
        int rightHeight[]=new int[n];
           
            LeftHeight[0]=height[0];
            for(int j=1;j<n;j++){
                LeftHeight[j]=Math.max(LeftHeight[j-1],height[j]);
            }
            rightHeight[n-1]=height[n-1];
            for(int j=n-2;j>=0;j--){
                rightHeight[j]=Math.max(rightHeight[j+1],height[j]);
            }
            for(int k=0;k<n;k++){

            totalWater+=Math.min(LeftHeight[k],rightHeight[k])-height[k];
            
        }
        return totalWater;
    }
}