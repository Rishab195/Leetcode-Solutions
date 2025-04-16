class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, int[]> map = new HashMap<>(); // key -> [freq, pairs]
        int l = 0;
        long count = 0;
        long totalPairs = 0;

        for (int r = 0; r < n; r++) {
            int num = nums[r];
            map.putIfAbsent(num, new int[]{0, 0});
            int[] entry = map.get(num);
            entry[0]++; // frequency

            if (entry[0] == 2) {
                entry[1] = 1; // one pair
            } else if (entry[0] > 2) {
                entry[1] = entry[0] * (entry[0] - 1) / 2;
            }

            totalPairs += entry[0] - 1;

            // Shrink window while totalPairs >= k
            while (totalPairs >= k) {
                count += n - r;

                int leftNum = nums[l];
                int[] leftEntry = map.get(leftNum);
                totalPairs -= leftEntry[0] - 1;
                leftEntry[0]--;

                if (leftEntry[0] < 2) {
                    leftEntry[1] = 0;
                } else {
                    leftEntry[1] = leftEntry[0] * (leftEntry[0] - 1) / 2;
                }

                l++;
            }
        }

        return count;
    }
}