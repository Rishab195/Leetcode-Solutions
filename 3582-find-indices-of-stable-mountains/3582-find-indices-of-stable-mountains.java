class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=height.length;
        for(int i=1;i<n;i++){
            if(height[i-1]>threshold){
                arr.add(i);
            }
        }
        return arr;
        
    }
}