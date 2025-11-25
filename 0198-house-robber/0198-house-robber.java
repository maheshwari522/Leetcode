class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1 ) return nums[0];

        // return helper(nums,0);

        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] =Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }

        return dp[nums.length-1];


        
    }
}

//     public int helper(int[] nums, int index){
//         if(index >= nums.length){
//             return 0;
//         }
//         int choose = nums[index]+helper(nums,index+2);
//         int notchoose = helper(nums,index+1);

//         return Math.max(choose,notchoose);
//     }
// }