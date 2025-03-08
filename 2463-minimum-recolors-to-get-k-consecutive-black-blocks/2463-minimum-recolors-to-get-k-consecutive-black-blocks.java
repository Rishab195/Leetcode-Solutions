class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=Integer.MAX_VALUE;
        int n=blocks.length();
        int count=0;
        char[] arr=blocks.toCharArray();
        for(int i=0;i<k;i++){
            if(arr[i]=='W'){
                count++;
            }
        }
        res=count;
        for(int i=k;i<n;i++){
            if(arr[i-k]=='W'){
                count--;
            }
            if(arr[i]=='W'){
                count++;
            }
        res=Math.min(res,count);
        }
        return res;
    }
}