class Solution {
    public int evalRPN(String[] tokens) {


        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(s.equals("-")){
                st.push(-st.pop()+st.pop());
            }else if( s.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(s.equals("/")){

                int a = st.pop();
                int b = st.pop();

                st.push(b/a);

            }else{
                st.push(Integer.parseInt(s));
            }

            }

             return st.pop();
        }
       
    }
