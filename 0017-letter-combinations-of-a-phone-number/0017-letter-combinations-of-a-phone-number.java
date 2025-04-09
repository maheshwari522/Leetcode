class Solution {
    public List<String> letterCombinations(String digits) {

String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits == null || digits == "") return new ArrayList<>();

        List<String> ans = new ArrayList();
       
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        

          backtrack(0,letters,ans,"",digits);


        

        return ans;
        
    }
public void backtrack(int start,String[] letters,List<String> ans, String result,String digits){


    if(start == digits.length()){
    ans.add(result);
    return;
    }
    String currentLetter = letters[digits.charAt(start)-'0'];
    
     for(int i=0;i<currentLetter.length();i++){

        String newresult = result+ currentLetter.charAt(i);
        backtrack(start+1,letters,ans,newresult,digits);
        


     }

    }
}