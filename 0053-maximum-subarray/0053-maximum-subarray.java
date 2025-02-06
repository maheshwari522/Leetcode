class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

       
        int sum = 0;
        int left=0;
        for(int right =0;right<nums.length;right++){
            sum+=nums[right];

            if(sum>maxSum){
                maxSum = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return maxSum;
        
    }
}