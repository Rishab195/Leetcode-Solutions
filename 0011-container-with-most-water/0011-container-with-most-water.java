class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int i=0;
        int n=height.length;
        int j=n-1;
            // int j=n-1-i;
        while(i<j){
            int length=Math.min(height[i],height[j]);
            int width=j-i;
            int area=length*width;
            ans=Math.max(ans,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}