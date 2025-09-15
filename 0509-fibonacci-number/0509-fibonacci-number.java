class Solution {
    public int fib(int n) {
        //declare dp array of size(n+1) which is  0 to n
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        //base condition
        if(n<=1){
            return n;
        }
        //check if already solved and return
        if(dp[n] != -1){
            return dp[n];
        }
            //store and return
            return dp[n] = fib(n-1)+fib(n-2);
        
    }
}