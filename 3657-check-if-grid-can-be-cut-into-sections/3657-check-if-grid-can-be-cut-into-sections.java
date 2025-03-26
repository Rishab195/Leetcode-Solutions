class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int m=rectangles.length;
        int [][]xCord=new int[m][2];
        int [][]yCord=new int[m][2];

        for(int i=0;i<m;i++){
            xCord[i][0]=rectangles[i][0];
            xCord[i][1]=rectangles[i][2];
            yCord[i][0]=rectangles[i][1];
            yCord[i][1]=rectangles[i][3];
        }
        return merge(xCord) || merge(yCord);
    }
        public boolean merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();

        int [] firstInt=intervals[0];
        res.add(firstInt);
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0], end=intervals[i][1];
            if(start<firstInt[1]){
                firstInt[1]=Math.max(end,firstInt[1]);
            }else{
                 firstInt = new int[]{start, end};
                res.add(firstInt);
            }
        }
        return res.size()>=3;
    }
}