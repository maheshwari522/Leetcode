class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        StringBuilder s = new StringBuilder();

        helper(0,0,n,s, ans);

        return ans;
        
    }

    public void helper(int openn, int closen, int n,StringBuilder s,List<String> ans){
        if(openn == closen && openn == n){
            ans.add(s.toString());
            return;
        }

        if(openn<n){
            s.append("(");
            helper(openn+1,closen,n,s,ans);
            s.deleteCharAt(s.length() -1);
        }

        if(closen<openn){
            s.append(")");
            helper(openn,closen+1,n,s,ans);
            s.deleteCharAt(s.length() -1);


        }

        
    }
}