class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;

        // Start from the lowest possible value
        long curr = lower;

        // Track the max and min values of the array as we apply the differences
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        // Initially, max and min will include the first value (which is curr = lower)
        max = Math.max(curr, max);
        min = Math.min(curr, min);

        // Simulate building the array using the difference array
        for(int i = 1; i <= n; i++) {
            curr += differences[i - 1];  // Apply the difference step-by-step
            max = Math.max(max, curr);  // Keep track of max value reached
            min = Math.min(min, curr);  // Keep track of min value reached
        }

        // Calculate the range of values the first number can be
        // So that the entire array stays within bounds
        long res = (upper - lower + 1) - (max - min);

        // If no valid values are possible
        if(res < 0) {
            return 0;
        }

        return (int)res;
    }
}
