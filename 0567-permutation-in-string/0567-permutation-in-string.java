class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        if(s1.length()>s2.length()) return false;

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;


        }

        if(matches(s1Count,s2Count)) return true;

        int left = 0;
        

        for(int right = s1.length();right<s2.length();right++){
            s2Count[s2.charAt(right)-'a']++;
            s2Count[s2.charAt(left)-'a']--;
            left++;
            if(matches(s1Count,s2Count)) return true;
        }

        return false;
        
    }

    public boolean matches(int[] s1Count, int[] s2Count){
        for(int i=0;i<26;i++){
            if(s1Count[i]!=s2Count[i]){
                return false;
            }
        }
        return true;
    }
}