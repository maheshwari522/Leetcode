class Solution {
    public String minWindow(String s, String t) {
    int left = 0;
    HashMap<Character,Integer> tmap = new HashMap<>();
    for(char c:t.toCharArray()){
        tmap.put(c, tmap.getOrDefault(c,0)+1);
    }
    int requiredChars = t.length();
    int minstart = 0;

    int minLength=Integer.MAX_VALUE;

    for(int right = 0; right<s.length();right++){
        char cright = s.charAt(right);
        if(tmap.containsKey(cright)){
            if(tmap.get(cright)>0)
            requiredChars--;
            tmap.put(cright, tmap.get(cright)-1);
        }
        while(requiredChars == 0){
            if(right-left+1 < minLength){
                minLength = right-left+1;
                minstart = left;
            }

            char cleft = s.charAt(left);

            if(tmap.containsKey(cleft)){
               tmap.put(cleft,tmap.get(cleft)+1); 
               if(tmap.get(cleft)>0)
               requiredChars++;
            }

            left++;


        }
    }

    return minLength == Integer.MAX_VALUE? "" : s.substring(minstart,minstart+minLength);
    }
}