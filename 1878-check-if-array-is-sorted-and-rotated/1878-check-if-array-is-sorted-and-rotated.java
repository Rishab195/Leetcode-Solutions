class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { // Circular check
                count++;
            }
            if (count > 1) { // More than one drop means it's not a rotated sorted array
                return false;
            }
        }
        
        return true;
    }
}