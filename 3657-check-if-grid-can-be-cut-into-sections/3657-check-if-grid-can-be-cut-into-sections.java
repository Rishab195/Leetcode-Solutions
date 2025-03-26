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
        return check(xCord) || check(yCord);
    }
    public boolean check(int[][]Cord){
        Arrays.sort(Cord,(a,b)-> Integer.compare(a[0],b[0]));
        int sections=0;
        int end=Cord[0][1];

        for(int [] i : Cord){
            if(end<=i[0]){
                sections++;
            }
            end=Math.max(end,i[1]);
        }
        return sections>=2;
    }
}