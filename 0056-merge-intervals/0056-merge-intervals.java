class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals ,(a,b)-> Integer.compare(a[0],b[0]));
        int n=intervals.length;
      List<List<Integer>> res=new ArrayList<>();
      List<Integer> list=new ArrayList<>();
      list.add(intervals[0][0]);
      list.add(intervals[0][1]);
      res.add(list);
      int first=intervals[0][0];
      int last=intervals[0][1];
        int size=0;
      for(int i=1;i<n;i++){
        int start=intervals[i][0];
        int end=intervals[i][1];
        if(start<=last){
            res.get(size).set(1,Math.max(last,end));
            first=res.get(size).get(0);
            last=res.get(size).get(1);
        }
        else{
            size++;
            res.add(new ArrayList<>());
            res.get(size).add(start);
            res.get(size).add(end);
            last=end;
        }
      }
    int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }

        return result;
    }
}