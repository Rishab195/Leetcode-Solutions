class Solution {
    public int minCapability(int[] nums, int k) {
        int[] arr = nums.clone(); 
        Arrays.sort(arr);

        int low = arr[0], high = arr[arr.length - 1], ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (canAssign(mid, nums, k)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }

    public boolean canAssign(int max_val, int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= max_val) {
                count++;
                i++; 
            }
        }
        return count >= k;
    }
}