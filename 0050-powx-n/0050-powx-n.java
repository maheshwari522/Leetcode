class Solution {
    public double myPow(double x, int n) {

        double result = 1;

        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }
}
