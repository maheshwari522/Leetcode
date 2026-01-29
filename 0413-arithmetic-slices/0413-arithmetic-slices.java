class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int n = nums.length;
        int ans = 0;

        for(int i=n-3;i>=0;i--){
            if((nums[i+1] - nums[i]) == (nums[i+2] - nums[i+1])){
                dp[i] = dp[i+1]+1;
                ans+=dp[i];
            }


        }

        return ans;
        
    }
}