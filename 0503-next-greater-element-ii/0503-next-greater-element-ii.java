class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int[] arr = new int[nums.length];

        Arrays.fill(arr,-1);

        Stack<Integer> stac  = new Stack<>();

        int n = nums.length;

        for(int i = 2*n-1; i>=0;i--){
            while(!stac.isEmpty() && nums[i%n]>=stac.peek()){
                stac.pop();
            }

            if(!stac.isEmpty() && i<n){
                arr[i] = stac.peek();
            }
            stac.push(nums[i%n]);
        }

        return arr;
    }
}