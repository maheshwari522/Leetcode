class Solution {
    public int findDuplicate(int[] nums) {

       int slow = nums[0];
       int fast = nums[0];


       do{

        slow = nums[slow];
        fast = nums[nums[fast]];

       }while(nums[slow] != nums[fast]);

       int slow2 = nums[0];

       while(slow2 != slow){
        slow2 =nums[slow2];
        slow=nums[slow];
       }

       return slow;
        
    }
}