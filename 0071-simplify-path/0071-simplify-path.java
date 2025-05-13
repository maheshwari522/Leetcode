class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();

        String[] str = path.split("/");


        for( String s :str ){

                if(s.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }


                }else if(!s.equals("") && !s.equals(".")){
                    stack.push(s);

                }





        }

        StringBuilder  output = new StringBuilder();

       
  for (String string :stack) {
     
      output.append("/").append(string);
          
  }
   

   return output.toString().length() > 0 ?output.toString():"/" ;

            
        



    }
}