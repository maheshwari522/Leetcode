class Solution {
    public List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();


        helper(0,nums, nums.length, curr, ans);

        return ans;


        
    }


     public void helper(int startIndex,int[] nums,int n, List<Integer> curr, List<List<Integer>> ans){
        if(startIndex == n){
                ans.add(new ArrayList<>(curr));

            return;
        }

        curr.add(nums[startIndex]);
        helper(startIndex+1,nums, n, curr, ans);
        curr.remove(curr.size()-1);

        helper(startIndex+1,nums, n, curr, ans);
     }


}