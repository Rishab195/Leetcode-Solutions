class Solution {
    public int findCenter(int[][] edges) {
        // int n=edges.length;
        // int count=0;
        // int [] arr=new int[n+2];
        // for(int i=0;i<n;i++){
        //     int a=edges[i][0];
        //     int b=edges[i][1];
        //     arr[a]+=1;
        //     arr[b]+=1;
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==n){
        //         return arr[i];
        //     }
        // }
        // return -1;

        int a=edges[0][0];
        int b=edges[0][1];

        if(edges[1][0]==a || edges[1][1]==a){
            return a;
        }
        else{
            return b;
        }
    }
}