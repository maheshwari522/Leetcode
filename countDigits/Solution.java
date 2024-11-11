
public class Solution {
    public static int countDigits(int n){
        // Write your code here.

        int count =0;
        int evenNum = n;

        while(n > 0){
            
            int num= n%10;
            n=n/10;
            if(num != 0 && evenNum%num ==0){
                count++;
            }

            
        }
        return count;
    }
}
