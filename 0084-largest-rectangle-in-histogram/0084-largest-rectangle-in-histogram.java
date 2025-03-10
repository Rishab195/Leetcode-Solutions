class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        ArrayList<Integer> ns=new ArrayList<>();
        ArrayList<Integer> ps=new ArrayList<>();

        for(int i=0;i<heights.length;i++){
            ns.add(heights.length);
            ps.add(-1);
        }
        for(int i=0;i<heights.length;i++){
            while(!s1.isEmpty() && heights[s1.peek()]>heights[i]){
                ns.set(s1.pop(),i);
            }
            s1.push(i);
        }

        for(int i=heights.length-1;i>=0;i--){
            while(!s2.isEmpty() && heights[s2.peek()]>heights[i]){
                ps.set(s2.pop(),i);
            }
            s2.push(i);
        }

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=ns.get(i)-ps.get(i)-1;
            int area=height*width;
            maxi=Math.max(maxi,area);
        }
        return maxi;
    }
}