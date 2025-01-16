class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int prefMax=Integer.MIN_VALUE;
        int suffMax=Integer.MIN_VALUE;
        int prefarr[]=new int[n];
        int suffarr[]=new int[n];
        for(int i=0;i<n;i++){
            prefMax=Math.max(prefMax,height[i]);
            prefarr[i]=prefMax;
            suffMax=Math.max(suffMax,height[n-1-i]);
            suffarr[n-1-i]=suffMax;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            prefarr[i]=Math.min(prefarr[i],suffarr[i])-height[i];
            sum+=prefarr[i];
        }

        return sum;
    }
}