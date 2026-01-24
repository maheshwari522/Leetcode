class Solution {
    public int lengthOfLongestSubstring(String s) {
        //storing indexes of char
        HashMap<Character,Integer> map = new HashMap<>();
        int max= 0;
        int left = 0;
        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=left){
               
                left =map.get(ch)+1;
                map.put(ch,i);
                
            }
            map.put(ch,i);
             max = Math.max(max,i-left+1);
        }  
        return max;      
    }
}