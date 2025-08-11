class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];

        helper(0,nums,current,res,visited);
        return res;
    }
    public void helper(int start,int[] nums,List<Integer> current,List<List<Integer>> res,boolean[] visited){
        if(start == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        for(int i =0;i<nums.length;i++){
            if(i>0 && nums[i] ==nums[i-1] && visited[i-1]) continue;
            if(!visited[i]){
                visited[i] =true;
                current.add(nums[i]);
                helper(start+1,nums,current,res,visited);
                current.remove(current.size()-1);
                visited[i] = false;
            }


        }
    }
}