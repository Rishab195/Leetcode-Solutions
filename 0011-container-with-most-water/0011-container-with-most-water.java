class Solution {
    public int maxArea(int[] height) {
        int j=height.length-1;
        int i=0;
        int maxArea=0;
        while(i<=j){
            int length=Math.min(height[i],height[j]);
            int width=j-i;
            int area=length*width;
            // if(height[i]>=height[j]){
            //     j--;
            // }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            maxArea=Math.max(maxArea,area);
        }
    return maxArea;
    }
}