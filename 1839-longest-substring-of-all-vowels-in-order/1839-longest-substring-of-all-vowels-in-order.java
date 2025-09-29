class Solution {
    public int longestBeautifulSubstring(String word) {
        String s = word;
       
        int left = 0;
        int uniqueVowels = 1;
        int maxLength = 0;
        for(int right = 1;right<word.length();right++){
            if(s.charAt(right) < s.charAt(right-1)){
                left = right;
                uniqueVowels = 1;
                
            }else if(s.charAt(right) > s.charAt(right-1)){
                
                uniqueVowels++;

            }

            if(uniqueVowels==5){
                maxLength = Math.max(maxLength,right-left+1);

            }
            
               
        }

        return maxLength;
    }
}