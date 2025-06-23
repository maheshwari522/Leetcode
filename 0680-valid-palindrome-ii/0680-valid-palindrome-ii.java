class Solution {
    public boolean validPalindrome(String s) {
        String res = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int l = 0;
        int r = res.length()-1;

        while(l<=r){
            if(res.charAt(l) != res.charAt(r)){
              return isPalindrome(res,l+1,r) || isPalindrome(res,l,r-1);
            }
            l++;
            r--;
        }

        return true;

    }

    public boolean isPalindrome(String s, int left,int right){
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}