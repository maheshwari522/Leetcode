class Solution {
    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;
        int count = 0;

        
        int[] vowels = new int[128];

        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        for(int i = 0; i<k;i++){
            count+=vowels[s.charAt(i)];
        }

        maxVowelCount = count;

        for(int i =k;i<s.length();i++){
            count+=vowels[s.charAt(i)]-vowels[s.charAt(i-k)];
            maxVowelCount=Math.max(maxVowelCount,count);

            if(maxVowelCount==k){
                return maxVowelCount;
            }
        }

        return maxVowelCount;
        
    
        
    }
}