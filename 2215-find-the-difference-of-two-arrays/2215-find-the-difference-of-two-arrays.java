class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();

       List<List<Integer>> ans = new ArrayList<>();
       ans.add(new ArrayList<>());
       ans.add(new ArrayList<>());


       for( int num : nums1){
        map1.add(num);
       }

       for( int num : nums2){
        map2.add(num);
       }

       for(int i :map1 ){
        if(!map2.contains(i)){
            ans.get(0).add(i);
        }
       }

       for(int j :map2 ){
        if(!map1.contains(j)){
            ans.get(1).add(j);
        }
       }

       return ans;
        
    }
}