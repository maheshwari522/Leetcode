class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        boolean flag = true; //up
        int r = 0;
        int c = 0;
        for(int i = 0;i<m*n;i++){
        res[i] = mat[r][c];

        if(flag){
         if(c == n-1){
            flag = false;
            r++;

         }else if(r == 0){
            flag = false;
            c++;

         }else{
         r--;
         c++;;
         }

        }else{
            if(r==m-1){
                flag = true;
                c++;
            }else if( c==0){
                flag = true;
                r++;

            }else{
            r++;
            c--;
            }

        }
        }
        return res;
        
    }
}