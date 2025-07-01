class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for( int a: asteroids){
            while(!st.isEmpty() && a < 0 && st.peek()>0){
                if(a+st.peek() < 0){
                    st.pop();
                }else if(a+st.peek() > 0){
                    a = 0;
                }else{
                    a = 0;
                    st.pop();
                }
            }

            if(a != 0){
              st.push(a);
            }
        }

        int[] res = new int[st.size()];
        int index = 0;
        for(int i : st){
            res[index++] = i;
        }

        return res;
        
    }
}