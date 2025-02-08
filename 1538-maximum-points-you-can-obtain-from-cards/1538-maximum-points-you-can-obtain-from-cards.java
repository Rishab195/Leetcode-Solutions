class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i < k; i++){
            leftSum += cardPoints[i];
        }
        int sum = 0;
        int maxSum = 0;
        maxSum = leftSum;
        for(int i = 0 ; i < k; i++){
            leftSum = leftSum - cardPoints[k - i - 1];
            rightSum += cardPoints[cardPoints.length - i - 1];
            sum = rightSum + leftSum;
            maxSum = Math.max(sum, maxSum);   
        }

        return maxSum;
    }
}