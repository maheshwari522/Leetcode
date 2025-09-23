class Solution {
    public int maxArea(int[] height) {

        int left = 0;

        int right = height.length -1;

        int maxArea = 0;

        while(left<=right){

           

            int minHeight  = Math.min(height[left],height[right]);

            int area =  minHeight * (right-left);

            maxArea = Math.max(maxArea,area);
             if(height[left] >= height[right]){
            right--;
            }else{
            left++;
            }
            
        }

        return maxArea;
        
    }
}