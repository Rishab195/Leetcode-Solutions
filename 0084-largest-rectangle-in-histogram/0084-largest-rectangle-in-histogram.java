class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int[]ns=new int[n+1];
        int[]ps=new int[n+1];
        for(int i=0;i<n;i++){
            ns[i]=n;
            ps[i]=-1;
        }
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && heights[s1.peek()]>heights[i]){
                ns[s1.pop()]=i;
            }
            s1.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty() && heights[s2.peek()]>heights[i]){
                ps[s2.pop()]=i;
            }
            s2.push(i);
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int height=heights[i];
            int width=ns[i]-ps[i]-1;
            int area=height*width;
            maxi=Math.max(maxi,area);
        }
        return maxi;
    }
}