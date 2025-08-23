class Solution {
    public void nextPermutation(int[] nums) {

       int index = -1;

       for(int i = nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            index = i;
            break;
        }
       }

       if(index == -1){
        Arrays.sort(nums);
        return;
       }

       for(int j = nums.length-1;j>index;j--){
        if(nums[j] > nums[index] ){
            int temp = nums[j];
            nums[j] = nums[index];
            nums[index] = temp;
            break;
        }
       }

       reverse(index+1,nums.length-1,nums);
     
    }

    public void reverse(int l,int r,int[] nums){
        while(l<r){
        int temp = nums[l];
        nums[l++] = nums[r];
        nums[r--] = temp;
        }

    }
   
}