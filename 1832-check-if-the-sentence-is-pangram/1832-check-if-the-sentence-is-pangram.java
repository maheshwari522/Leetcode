class Solution {
    public boolean checkIfPangram(String sentence) {

        int[] freq = new int[26];

        for(char c:sentence.toCharArray()){
            freq[c-'a']++;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]==0){return false;}
        }

        return true;
        
    }
}