class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int length=Math.min(height[i],height[j]);
            int width=j-i;
            int area=length*width;
            ans=Math.max(ans,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
        // int res=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int length=Math.min(height[i],height[j]);
        //         int width=j-i;
        //         int ans=length*width;
        //         res=Math.max(res,ans);
        //     }
        // }
        // return res;
    }
}