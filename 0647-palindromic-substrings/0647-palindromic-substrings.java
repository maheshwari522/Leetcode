class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        for(int i = 0;i<s.length();i++){
            res+= countSubS(s,i,i);
            res+= countSubS(s,i,i+1);
        }

      return res;
    }

    public int countSubS(String s,int l,int r){
        int res = 0;
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            res+=1;
            l = l -1;
            r= r+1;

        }
        return res;
    }
}