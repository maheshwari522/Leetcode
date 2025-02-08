class Solution {
    public int missingNumber(int[] nums) {
        
int arrsum  = 0;
int totalsum=0;
        for(int i = 0;i<nums.length; i++){
            arrsum+=nums[i];
            totalsum += i+1;

        }

        return totalsum-arrsum;
    }
}