class Solution {
    public int numRabbits(int[] answers) {
        int n=answers.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int count=0;
        
        for(Map.Entry<Integer,Integer> itr: map.entrySet()){
            int number=itr.getKey();
            int freq=itr.getValue();
             while (freq > 0) {
                count += number+1;
                freq -= number+1;
            }
        }
        return count;
    }
}