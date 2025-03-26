class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        helper(nums, ans, current, 0,nums.length);

        return ans;
        
    }

    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> current, int start, int end){

            if(current.size() == nums.length){
            ans.add(new ArrayList<>(current));
            return;
            }else{

        

        for(int i=0;i<nums.length;i++){

            if(current.contains(nums[i])) continue;

            current.add(nums[i]);


            helper(nums, ans, current, i+1,nums.length);

            current.remove(current.size()-1);

        }
            }
    }

    
}