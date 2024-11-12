import java.util.ArrayList;

public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.



        int sum =0;

        for(int i=1; i<=n;i++){

            int currSum = 0;

            for(int j=1;j<=i;j++){

                if(i%j==0){

                    currSum +=j;
                    
                }
            }
            sum = sum+currSum;

        }

        return sum;
    }
}
