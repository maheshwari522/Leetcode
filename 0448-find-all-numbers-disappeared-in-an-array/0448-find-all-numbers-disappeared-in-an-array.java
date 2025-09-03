class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int i = 1;i<=nums.length;i++){
            map.put(i,0);

        }

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 0){
                res.add(entry.getKey());
            }
        }

        return res;



        
    }
}