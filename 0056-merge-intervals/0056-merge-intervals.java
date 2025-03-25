class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> res = new ArrayList<>();
        
        // Add the first interval
        int[] lastInterval = intervals[0];
        res.add(lastInterval);

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0], end = intervals[i][1];

            if (start <= lastInterval[1]) { 
                // Merge intervals by updating the last interval's end time
                lastInterval[1] = Math.max(lastInterval[1], end);
            } else {
                // Add a new interval and update lastInterval reference
                lastInterval = intervals[i];
                res.add(lastInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}