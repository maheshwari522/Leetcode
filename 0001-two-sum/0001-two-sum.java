class Solution {
    public int[] twoSum(int[] nums, int target) {
        

       HashMap<Integer,Integer> mp = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int other = target - nums[i];
        if(mp.containsKey(other)){
            return new int[]{mp.get(other),i};
        }
        mp.put(nums[i],i);
       }

       return new int[]{};
    }
}