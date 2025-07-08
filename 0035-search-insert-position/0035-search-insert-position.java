class Solution {
    public int searchInsert(int[] nums, int target) {

       // List<Integer> ls = Arrays.asList(nums);
        List<Integer> list = new ArrayList<>();
       for(int num:nums){
        list.add(num);
       }
       int rindex = list.indexOf(target);
       if(rindex != -1){
         return rindex;

       }
       else{
       for(int i = 0;i<list.size();i++){
        if(target < list.get(i)){
            return i;
        }
       }
          
  return list.size();
       }

       
        
    }
}