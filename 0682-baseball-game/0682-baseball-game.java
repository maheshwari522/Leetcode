class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for(String s : operations){
            if(s.equals("+")){
                int temp =st.pop();
                int total = st.peek()+temp;
                st.push(temp);
                st.push(total);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int d = st.peek()*2;
                st.push(d);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int total = 0;
        while(!st.isEmpty()){
            total+=st.pop();

        }

        return total;
        
    }
}