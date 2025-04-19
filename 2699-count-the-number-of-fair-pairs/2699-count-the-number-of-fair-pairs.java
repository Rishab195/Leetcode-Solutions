import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    private long countPairs(int[] nums, int bound) {
        long count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            int valid = i;

            // Binary search to find the rightmost index j such that nums[i] + nums[j] <= bound
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long)nums[i] + nums[mid] <= bound) {
                    valid = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            count += (valid - i);
        }

        return count;
    }
}
