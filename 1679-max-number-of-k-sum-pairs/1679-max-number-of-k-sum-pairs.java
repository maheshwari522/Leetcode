class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
    int right = nums.length-1;

    int count = 0;

  
      while(left<right){
            int temp = nums[right] + nums[left];
            if(k == temp){
            count++;
            left++;
            right--;
            }else if(temp>k){
                right--;
            }else{
                left++;
            }
        
      }
          
        
        
        



    
    return count;
        
    }
}