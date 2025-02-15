class Solution {
    public int longestConsecutive(int[] nums) {


        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }


        int longestSeq = 0;


        for(int num : set){
            if(!set.contains(num-1)){
                int lengthm = 1;

                while(set.contains(num+lengthm)){
                    lengthm++;
                }

                 longestSeq = Math.max(lengthm,longestSeq); 
            }

           

        }


    return longestSeq;

        
        
    }
}