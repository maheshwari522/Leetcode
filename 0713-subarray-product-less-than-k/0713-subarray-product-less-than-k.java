class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int product = 1;

        int count = 0;

        int left = 0;

        int right = 0;

      while(right<nums.length){

          product*=nums[right++];

          
            while(product>=k && left<right){
                product=product/nums[left++];
              

            }
            if(product<k){
            count +=  right - left;
            }
          }
          

        
        return count;
    }
}