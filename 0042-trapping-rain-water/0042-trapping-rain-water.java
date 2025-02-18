class Solution {
    public int trap(int[] height) {
        
//brute force prefixMax array and suffixMax array

        int total = 0;

       int leftMax = 0;
       int rightMax = 0;

       int left = 0;
       int right = height.length - 1;


       while(left<=right){

        if(height[left] <= height[right]){
        if(leftMax > height[left]){

            total += (leftMax - height[left]);

        }else{

            leftMax = height[left];

           

        }
         left++;
        }else{
            if(rightMax > height[right]){
                total+= (rightMax - height[right]);
            }else{
                rightMax = height[right];
              

            }
              right--;
        }
       }

       return total;



    }
}