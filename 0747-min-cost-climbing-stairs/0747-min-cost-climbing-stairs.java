class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] arr=new int[cost.length+1];
        int n=arr.length;
        for(int i=0;i<cost.length;i++){
            arr[i]=cost[i];
        }
        arr[n-1]=0;

        for(int i=n-3;i>=0;i--){
            arr[i]=Math.min(arr[i]+arr[i+2], arr[i]+arr[i+1]);
        }
        return Math.min(arr[0],arr[1]);
    }
}