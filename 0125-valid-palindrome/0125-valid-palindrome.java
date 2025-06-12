class Solution {
    public boolean isPalindrome(String s) {

        String res = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
         int right = res.length() -1;

         int left = 0;

         while(left< res.length()){
            if(res.charAt(left) != res.charAt(right)){
                return false;
            }

            left++;
            right--;
         }

         return true;


        
        
    }
}