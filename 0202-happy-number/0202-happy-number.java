class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            fast = getDigitSquare(getDigitSquare(fast));
            slow = getDigitSquare(slow);
        }while(fast != 1 && fast != slow);

        return fast == 1;
        
    }
    public int getDigitSquare(int n){
        if(n == 0) return 0;
        int total = 0;
        while(n>0){
            int digit = n%10;
            total+=digit*digit;
            n/=10;

        }

        return total;
    }
}