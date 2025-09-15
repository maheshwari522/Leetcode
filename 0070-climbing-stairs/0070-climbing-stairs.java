class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return climbStairs(n,dp);
    }

    public int climbStairs(int n, int[] dp) { 

        if(n == 0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        
        
        int l = 0;
        int r = 0;

        if(dp[n-1] == -1){
        l = climbStairs(n-1, dp);
        }else{
            l = dp[n-1];
        }

        if(dp[n-2] == -1){
        r = climbStairs(n-2, dp);
        }else{
            r = dp[n-2]; 
        }
        dp[n] = l+r;

        return  dp[n];



        
    }
}