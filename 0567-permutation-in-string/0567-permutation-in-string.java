class Solution {
    public boolean checkInclusion(String s1, String s2) {


        if(s1.length()>s2.length()) return false;

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        if(matches(s1count,s2count)) return true;

        for(int i =s1.length();i<s2.length();i++){

            System.out.println(s2.charAt(i));
            s2count[s2.charAt(i) - 'a']++;
             System.out.println(s2.charAt(i - s1.length()));

            s2count[s2.charAt(i-s1.length()) - 'a' ]--;
            if(matches(s1count,s2count)) return true;
        }

        return false;

        
        
    }


    public boolean matches(int[] s1count,int[] s2count){

        for(int i = 0;i<26;i++){
            if(s1count[i] != s2count[i]){
                return false;
            }
        }

            return true;
        
    }
    
}