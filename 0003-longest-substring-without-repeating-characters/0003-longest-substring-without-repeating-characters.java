class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int left = 0;
        HashSet<Character> hashset = new HashSet<>();

      

        int count =0;

        for(int right=0;right<s.length();right++){

            if(!hashset.contains(s.charAt(right))){
                hashset.add(s.charAt(right));
              count = Math.max(count,right-left+1);
            
            }else{
                
                    while(s.charAt(left)!=s.charAt(right)){
                    hashset.remove(s.charAt(left));
                    left++;}
                
                hashset.remove(s.charAt(left));left++;
                hashset.add(s.charAt(right));
            }
            
            


           
        }

        return count;
    }
}