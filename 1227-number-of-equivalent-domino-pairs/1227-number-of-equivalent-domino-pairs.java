class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int[] d : dominoes) {
            // Normalize: convert [a, b] or [b, a] to a unique key
            int a = d[0], b = d[1];
            int key = a < b ? a * 10 + b : b * 10 + a;

            // Count pairs
            res += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return res;
    }
}