class Solution {
    public int rob(int[] nums) {
        
        int index= nums.length-1;
        int sum = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        return solve(nums,index,dp);

    }

    public int solve(int[] nums, int index, int[] dp){
        if((index) == 0) return nums[index];
        if(index < 0 ) return 0;
        int rob = 0;
        if(dp[index] != -1) return dp[index];
       
        rob = nums[index] + solve(nums,index-2,dp);
        int norob = 0 + solve(nums,index-1,dp);

        return dp[index] = Math.max(rob,norob);



    }
}