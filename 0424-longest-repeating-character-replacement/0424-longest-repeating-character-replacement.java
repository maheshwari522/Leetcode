class Solution {
    public int characterReplacement(String s, int k) {

         int maxf=0;
        int left=0;
        HashMap<Character,Integer> freq= new HashMap<>();
        int res=0;

        for(int right=0;right<s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
            maxf = Math.max(maxf,freq.get(s.charAt(right)));

            if(right-left+1-maxf>k){
                freq.put(s.charAt(left),freq.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            res=Math.max(res,right-left+1);
            
        }

        return res;
    }
}