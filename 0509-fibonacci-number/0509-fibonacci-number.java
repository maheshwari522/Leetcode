class Solution {
    public int fib(int n) {
        //declare dp array of size(n+1) which is  0 to n
        int[] dp = new int[n+1];
       
      

        //base condition

        if(n>=1){
        dp[0] = 0;
        dp[1] = 1;
        }
        //store resulyts incrementally
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
        
    }
}