class Solution {
    public String reverseWords(String s) {

        String[] st = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for(int i = st.length-1;i>=0;i--){

            res.append(st[i]);
            if(i != 0){
                res.append(" ");
            }

        }

    return res.toString().trim();
        
    }
}