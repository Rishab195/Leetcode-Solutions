class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        SolveRec(nums,new ArrayList<>(),result);
        return result;
    }
    public void SolveRec(int[]nums,List<Integer> current,List<List<Integer>> result){
        if(nums.length==current.size()){
            result.add(new ArrayList<>(current));
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            SolveRec(nums,current,result);
            current.remove(current.size()-1);
        }
    }

    }