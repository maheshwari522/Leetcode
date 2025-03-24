class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        List<Integer> current = new ArrayList<>();

        helper(0,current,ans,nums);

        return ans;
        
    }

    public void helper(int startIndex, List<Integer> current,List<List<Integer>> ans ,int[] nums ){
            if(startIndex == nums.length){
                if(!ans.contains(current)){
                ans.add(new ArrayList<>(current));
                }
                return;
            }

        
        current.add(nums[startIndex]);
        helper(startIndex+1,current, ans,nums);
        current.remove(current.size()-1);
        helper(startIndex+1,current,ans,nums);
        

    }
}