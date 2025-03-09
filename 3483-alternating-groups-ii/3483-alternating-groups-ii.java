class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count=0;
        int Invalid=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<colors.length;i++){
            arr.add(colors[i]);
        }
        for(int i=0;i<k-1;i++){
            arr.add(colors[i]);
        }
        for(int i=0;i<k-1;i++){
            if(arr.get(i)==arr.get(i+1)){
                Invalid++;
            }
        }
        int n=arr.size();
        if(Invalid==0) count++;
       
       for(int i=1;i<=n-k;i++){
            if(arr.get(i-1)==arr.get(i)){
                Invalid--;
            }
            if(arr.get(i+k-2)==arr.get(i+k-1)){
                Invalid++;
            }
            if(Invalid==0){
                count++;
            }

       }
       return count;
    }
}