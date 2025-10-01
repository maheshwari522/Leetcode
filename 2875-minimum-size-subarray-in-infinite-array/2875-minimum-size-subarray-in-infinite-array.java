class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int n = nums.length;
        long totalSum = 0;
        for (int num : nums) totalSum += num;

        int result = Integer.MAX_VALUE;

        // Count full repetitions of nums
        int fullRepeats = (int)(target / totalSum);
        long remainingTarget = target % totalSum;

        // Create an array of 2 * nums for sliding window
        int[] doubleNums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            doubleNums[i] = nums[i % n];
        }

        // Sliding window to find smallest subarray sum == remainingTarget
        int left = 0;
        long windowSum = 0;
        for (int right = 0; right < 2 * n; right++) {
            windowSum += doubleNums[right];

            while (windowSum > remainingTarget && left <= right) {
                windowSum -= doubleNums[left++];
            }

            if (windowSum == remainingTarget) {
                int len = right - left + 1;
                result = Math.min(result, len);
            }
        }

        if (target == 0) return 0;
        if (remainingTarget == 0) return fullRepeats * n;
        return result == Integer.MAX_VALUE ? -1 : fullRepeats * n + result;
    }
}