class Solution {
    public boolean isIsomorphic(String s, String t) {
        

        HashMap<Character,Character> scount = new HashMap<>();
        HashMap<Character,Character> tcount = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);


            if(scount.containsKey(schar) && scount.get(schar) != tchar){
                return false;
            }
            if(tcount.containsKey(tchar) && tcount.get(tchar) != schar){
                return false;
            }

            scount.put(schar, tchar);
            tcount.put(tchar, schar);
        }

        return true;

    }
}