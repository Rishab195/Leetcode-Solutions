class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=1;i<=n;i++){
            int num=digitSum(i);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        int count=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int freq=entry.getValue();
            if(freq>maxFreq){
                maxFreq=freq;
                count=1;
            }
            else if(freq==maxFreq){
                count++;
            }
        }
        return count;
             
    }
    public int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}