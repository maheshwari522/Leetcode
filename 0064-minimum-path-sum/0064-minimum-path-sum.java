class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return solve(grid,dp,m-1,n-1);
    }

    public int solve(int[][] grid,int[][] dp,int i,int j){

        if(i == 0 && j == 0){
            return grid[0][0];
        }

        if(dp[i][j]!= -1) return dp[i][j];
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if(i > 0)
        up = grid[i][j]+solve(grid,dp,i-1,j);
        if(j>0)
        left = grid[i][j]+solve(grid,dp,i,j-1);

        return dp[i][j] = Math.min(up,left);

    }
}