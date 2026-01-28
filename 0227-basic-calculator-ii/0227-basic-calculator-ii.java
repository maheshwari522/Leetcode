class Solution {

    int idx = 0; 

    public int calculate(String s) {
        
        int n = s.length();

        int calc = 0;
        int tail = 0;
        char lastSign = '+';
        int currNum = 0;

        while (idx < n) {
            char c = s.charAt(idx++);
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + c - '0';
            }
            else if (c == '(') {
                currNum = calculate(s);
            }  

            if ((!Character.isDigit(c) && c != ' ')
                || idx == n || c == ')') 
            {
                if (lastSign == '+') {
                    calc = calc + currNum;
                    tail = currNum;
                } else if (lastSign == '-') {
                    calc = calc - currNum;
                    tail = -currNum;
                } else if (lastSign == '*') {
                    calc = (calc - tail) + (tail * currNum);
                    tail = tail * currNum;
                } else if (lastSign == '/') {
                    calc = (calc - tail) + (tail / currNum);
                    tail = tail / currNum;
                }

                currNum = 0;
                lastSign = c;

                if (c == ')') {
                    return calc;
                }
            }
        }
        return calc;
    }
}
