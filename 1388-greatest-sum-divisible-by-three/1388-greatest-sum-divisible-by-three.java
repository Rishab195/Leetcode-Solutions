class Solution {
    public int maxSumDivThree(int[] nums) {
      int totalSum=0;
      List<Integer> rem1=new ArrayList<>();
      List<Integer> rem2=new ArrayList<>();

      for(int num:nums){
        totalSum+=num;
        if(num%3==1){
            rem1.add(num);
        }
        else if(num%3==2){
            rem2.add(num);
        }
      }
      if(totalSum%3==0){
        return totalSum;
      }
        Collections.sort(rem1);
        Collections.sort(rem2);
        
      if(totalSum%3==1){
        int option1=Integer.MAX_VALUE;
        int option2=Integer.MAX_VALUE;
        if(!rem1.isEmpty()){
            option1=rem1.get(0);
        }
        if(rem2.size()>=2){
            option2=rem2.get(0)+rem2.get(1);
        }
        return totalSum-Math.min(option1,option2);
      }
      else{
        int option1=Integer.MAX_VALUE;
        int option2=Integer.MAX_VALUE;

        if(!rem2.isEmpty()){
            option1=rem2.get(0);
        } 
        if(rem1.size()>=2){
            option2=rem1.get(0)+rem1.get(1);
        }
        return totalSum-Math.min(option1,option2);
      }
    }
}