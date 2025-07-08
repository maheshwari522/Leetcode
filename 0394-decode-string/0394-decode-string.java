class Solution {
    public String decodeString(String s) {

        Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray()){
            if(c != (']')){
                st.push(c);
            
            }else{
                StringBuilder sb = new StringBuilder();
                while(st.peek() != '['){
                    sb.insert(0,st.pop());
                }
                String sub = sb.toString();
                st.pop();

                sb = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    sb.insert(0,st.pop());
                }

                int count = Integer.valueOf(sb.toString());

                while(count > 0){
                    for(char ch:sub.toCharArray()){
                        st.push(ch);
                    }

                    count--;

                }


            }
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.insert(0,st.pop());

        }

        return res.toString();
        
    }
}