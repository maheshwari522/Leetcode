class Solution {
    public List<String> letterCombinations(String digits) {
if(digits == "" || digits == null || digits.length() ==0){
    return new ArrayList<>();
}

    List<String> ans = new ArrayList<>();

    String[] letters = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

   
 String sb = "";
    backtrack(0,digits,letters,sb,ans);

    return ans;
        
    }

    public void backtrack(int start, String digits,String[] letters,String sb,List<String> ans){
        if(sb.length() == digits.length()){
            ans.add(sb);
            return;
        }


        String currentLetters = letters[digits.charAt(start)-'0'];

        for(int i = 0;i<currentLetters.length();i++){
            String newres = sb+currentLetters.charAt(i);
            backtrack(start+1,digits,letters,newres,ans);
        }

        
    }
}