class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int curr=0;
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            curr+=differences[i];
            max=Math.max(max,curr);
            min=Math.min(min,curr);

            if(max-min > upper-lower){
                return 0;
            }
        }
        return ((upper-lower+1)-(max-min));
    }
}