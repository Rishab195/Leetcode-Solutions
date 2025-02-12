
class Solution {
    public int maximumSum(int[] nums) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sum = digitSum(num);

            // If key is not present, create new list
            map.putIfAbsent(sum, new ArrayList<>());

            List<Integer> list = map.get(sum);
            list.add(num);
            Collections.sort(list, Collections.reverseOrder()); // Keep highest numbers first

            // Keep only top 2 numbers
            if (list.size() > 2) {
                list.remove(2);
            }
        }

        // Compute max sum from stored pairs
        for (List<Integer> list : map.values()) {
            if (list.size() == 2) {
                maxSum = Math.max(maxSum, list.get(0) + list.get(1));
            }
        }

        return maxSum;
    }

    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {51, 71, 17, 42};  // Example test case
        System.out.println(sol.maximumSum(nums));  // Output: 93 (51 + 42)
    }
}
