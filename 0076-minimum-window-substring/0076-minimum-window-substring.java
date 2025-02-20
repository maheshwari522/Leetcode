class Solution {
    public String minWindow(String s, String t) {

        int start = 0;
        

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:t.toCharArray()){

         map.put(c,map.getOrDefault(c,0)+1);

        }

     
        int minLength = Integer.MAX_VALUE;

        int minStart = 0;

        int requiredchars = t.length();

        

        for(int end = 0;end< s.length();end++){

            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                
                if(map.get(ch)>0){

                   requiredchars--;
                    
                }
                map.put(ch,map.get(ch)-1);
                }

                while(requiredchars == 0){
                    if((end-start+1) < minLength){
                        minLength = end-start+1;
                        minStart = start;
                     }

                     char cstart = s.charAt(start);

                     if(map.containsKey(cstart)){
                        map.put(cstart,map.get(cstart)+1);
                        if(map.get(cstart)>0)requiredchars++;
                     }

                     start++;
                }
        }

       

       String res = minLength == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLength);

       return res;
    }
}