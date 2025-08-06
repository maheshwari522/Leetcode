class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    
    List<List<Integer>> res = new ArrayList<>();

    List<Integer> current = new ArrayList<>();

    backtrack(nums, 0, current, res,nums.length);

        return res;
    }

    public void backtrack(int[] nums, int index,List<Integer> current, List<List<Integer>> res, int n){

        
        if(index == n){
            res.add(new ArrayList<>(current));
            return;
        }
        
        current.add(nums[index]);
       // System.out.println(current.get(index));
        backtrack(nums, index+1,current, res,n);
        current.remove(current.size()-1);
        backtrack(nums, index+1,current, res,n);

    }
}