class Solution {
    public void recursion(int n, int k,int index,List<List<Integer>> list,List<Integer> subList){
        if(subList.size()==k ){
            list.add(new ArrayList<>(subList));
            return;
        }
        for(int i=index;i<=n;i++){
            subList.add(i);
            recursion(n,k,i+1,list,subList);
            subList.remove(subList.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        recursion(n,k,1,list,subList);
        return list;
    }
}