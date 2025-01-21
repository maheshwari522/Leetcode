class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        for(int right=0;right<nums.length;right++){
            currentSum += nums[right];
            while(currentSum>=target){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                }

                currentSum-=nums[left];
                left++;



            }
        }
        

    return minLength== Integer.MAX_VALUE?0:minLength;


       
    }
}