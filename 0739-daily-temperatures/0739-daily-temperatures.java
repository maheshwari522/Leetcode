class Solution {
    public int[] dailyTemperatures(int[] nums) {
        
        int[] result = new int[nums.length];
        
        Stack<Integer> st = new Stack<>();
        
        
        for(int i=0; i<nums.length;i++){
            
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int index = st.pop();
                
                result[index] = i-index;
                
            }
            
            st.push(i);
           
        }
        
        return result;



    }
}