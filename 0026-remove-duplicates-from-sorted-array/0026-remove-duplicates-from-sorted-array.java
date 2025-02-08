class Solution {
    public int removeDuplicates(int[] nums) {

        int i=0;
        int len = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1] = nums[j];
                i++;
            }

            len= i +1;
        }

        return len;
        
    }
}