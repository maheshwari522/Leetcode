class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] nums1 = nums.clone();
        Arrays.sort(nums1);

        int[] res = new int[nums.length];

        Map<Integer,Integer> map =new HashMap<>();

        for(int i = 0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],i);
            }
        }
        int index = 0;
        for(int num:nums){
            res[index++] = map.get(num);
        }

        return res;
        
    }
}