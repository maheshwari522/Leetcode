class Solution {
    public int coinChange(int[] coins, int amount) {
       if(coins.length == 0 || coins == null) return -1;
       int n = coins.length;
       int m = amount;
       int dp[][] = new int[n+1][m+1];
       for(int j = 1; j<=m;j++){
        dp[0][j] = amount+1;
       }

       for(int i = 1;i<=n;i++){
        for(int j = 1;j<=m;j++){
            if(coins[i-1]>j){
                dp[i][j] = dp[i-1][j];
            }else{
                dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
            }
        }
       }
       int res= dp[n][m];
       if(res>=amount+1){
        return -1;
       }
       return res;
    }

    // public int helper(int[] coins, int amount, int index, int coinsused){
    //     int dp[][] = new int[coins.length+1][amount+1];
    //     //base case
    //     if(coins.length == index || amount < 0){
    //         return -1;
    //     }
    //     //valid
    //     if(amount == 0){
    //         return coinsused;
    //     }
    //     //logic
    //    int case0 = helper(coins,amount,index+1,coinsused);
    //    int case1 = helper(coins,amount-coins[index],index,coinsused+1);
    //    if(case0 == -1) return case1;
    //    if(case1 == -1) return case0;

    //    return Math.min(case0,case1);
    // }
}