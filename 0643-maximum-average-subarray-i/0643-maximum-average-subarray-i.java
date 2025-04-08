class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Slide the window from index k to the end
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Remove the leftmost and add the rightmost element
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
