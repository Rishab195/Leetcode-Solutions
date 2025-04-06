class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
       int n=pairs.length;
       int[] arr=new int[n];
       Arrays.fill(arr,1);
       for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(pairs[j][1]<pairs[i][0]){
                arr[i]=Math.max(arr[i],arr[j]+1);
            }
        }
       }
       int maxEle=arr[0];
       for(int i=1;i<n;i++){
        if(arr[i]>maxEle){
            maxEle=arr[i];
        }
       } 
       return maxEle;
    }
}