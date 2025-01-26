class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Create a list of pairs to store numbers and their original indices
        List<int[]> indexedNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            indexedNums.add(new int[]{nums[i], i});
        }

        // Step 2: Sort the list based on the number values
        indexedNums.sort((a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Iterate through the sorted list
        for (int i = 0; i < indexedNums.size(); i++) {
            int firstNum = indexedNums.get(i)[0];
            int secondNum = target - firstNum;

            // Step 4: Perform binary search for the second number
            int left = i + 1, right = indexedNums.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (indexedNums.get(mid)[0] == secondNum) {
                    // Step 5: Return the original indices of the two numbers
                    return new int[]{indexedNums.get(i)[1], indexedNums.get(mid)[1]};
                } else if (indexedNums.get(mid)[0] < secondNum) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        throw new IllegalArgumentException("No solution exists");
    }
}
