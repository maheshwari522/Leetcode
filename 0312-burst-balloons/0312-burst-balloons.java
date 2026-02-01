class Solution {
    public int maxCoins(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][n];



        for(int l=1;l<=n;l++){
            //start = i 
            //end = n-l
            //this is array of bursting baloons
            for(int i=0;i<=n-l;i++){
                //we are iterating on that array to find max
                //end
                int j = i + l - 1; 
                        int max = 0;

                    for(int k = i;k<=j;k++){
                    int before = 0;
                    if(k!=i){
                        before=dp[i][k-1];
                    }
                    int after =0;

                    if(k!=j){
                        after = dp[k+1][j];

                    }

                    int left =1;
                    if(i>0) left = nums[i-1];
                    int right =1;
                    if(j<n-1) right = nums[j+1];

                    max = Math.max(max,before+(left*nums[k]*right)+after);

                    dp[i][j] = max;
                 
                    }   
            }
        }

        return dp[0][n-1];
    }
}