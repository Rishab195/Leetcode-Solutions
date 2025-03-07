class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] res=new int[2];
        int mini=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        if(arr.size()<2){
            return new int []{-1,-1};
        }
        for(int i=0;i<arr.size()-1;i++){
            int diff=arr.get(i+1)-arr.get(i);
            if(diff<mini){
            mini=Math.min(diff,mini);
            res[0]=arr.get(i);
            res[1]=arr.get(i+1);
            }
        }
        return res;
    }
        public boolean isPrime(int n){
            if(n<2){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}