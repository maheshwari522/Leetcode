class Solution {
    public int longestMountain(int[] nums) {

        if(nums.length<3) return 0;

        int longestm = 0;

        
         for(int i = 1;i<nums.length-1;i++){
            if( nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                int left = i-1;
                int right = i+1 ;

                while(left>0 && nums[left-1]<nums[left]){
                   left--;
                }
                while(right<nums.length-1 && nums[right+1]< nums[right]){
                    right++;
                }
                
                longestm = Math.max(longestm,right-left+1);
               

            }

            }

    
          return longestm;

     
        
    }
}