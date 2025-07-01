class Solution {
    public String simplifyPath(String path) {

        String[] strs = path.split("/");
        Stack<String> st = new Stack<>();


        for(String s: strs){

            if(s.equals("..") ){

                if(!st.isEmpty())

                st.pop();

            }else if(!s.equals("") && !s.equals(".")){

                st.push(s);

            }       
            
             }

        StringBuilder sb = new StringBuilder();

        for(String ss:st){
            sb.append("/").append(ss);
        }

        return sb.length() == 0 ? "/" : sb.toString();




        
        
    }
}