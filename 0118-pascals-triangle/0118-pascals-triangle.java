class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer=new ArrayList<>();
        
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);

        int middleElements=0;

        for(int i=1;i<numRows;i++){
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);

            for(int j=1;j<=middleElements;j++){
                int element=answer.get(i-1).get(j)+answer.get(i-1).get(j-1);
                currRow.add(element);
            }
            middleElements++;
            currRow.add(1);

            answer.add(currRow);
        }
        return answer;
    }
}