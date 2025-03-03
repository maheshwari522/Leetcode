class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;

        int maxWater = 0;
        while(left<right){
            if(height[left] < height[right]){

                int currentwater = height[left]*(right-left);
                maxWater = Math.max(currentwater,maxWater);

                left++;





            }else{

                int currentwater = height[right]*(right-left);
                maxWater = Math.max(currentwater,maxWater);

                right--;

            }
        }
    return maxWater;
    }

        
}