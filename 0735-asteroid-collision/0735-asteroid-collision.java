class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        List<Integer> res = new ArrayList<>();


        for(int a:asteroids){

             while (!st.isEmpty() && st.peek() > 0 && a < 0) {
                int top = st.pop();
                if (Math.abs(a) == top) {
                    a = 0;
                    break;
                } else if (Math.abs(a) < top) {
                    a = top; 
                }
            }

            if (a != 0) {
                st.push(a);
            }
        }

         int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}