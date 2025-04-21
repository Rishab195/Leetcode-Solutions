class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        long []hid=new long[n+1];
        hid[0]=lower;
        for(int i=1;i<=n;i++){
            hid[i]=hid[i-1]+differences[i-1];
        }
        Arrays.sort(hid);
        long maximum=hid[n];
        long minimum=hid[0];
        int res=((upper-lower+1)-(int)(maximum-minimum));
        if(res<0){
            return 0;
        }
        return res;
    }
}