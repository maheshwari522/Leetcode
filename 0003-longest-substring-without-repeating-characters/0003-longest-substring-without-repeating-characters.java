class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxSeq = 0;
       

        HashSet<Character> set = new HashSet<>();

        for(int right = 0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxSeq = Math.max(right-left+1, maxSeq);
        
            }else{
                while(s.charAt(left) != s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                    

                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
                

            }
        }

     return maxSeq;
        
    } 
    
}