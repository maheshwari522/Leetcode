class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        

        int rowlength = image.length;
        int collength = image[0].length;
        int[][] ans = new int[rowlength][collength];



        int inicolor = image[sr][sc];
        dfs(ans, image, rowlength, collength, sr,sc,inicolor, color);
    return image;

        
    }


    public void dfs(int[][] ans,int[][] image,int rowlength,int collength, int sr, int sc, int initialcolor, int color ){
        
       
        image[sr][sc] =color;
        

        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};

        for(int i = 0; i< 4;i++ ){

            int newr = sr+delrow[i];
            int newc = sc+delcol[i];
             if(newr < rowlength && newc <collength && newr>=0 &&  newc>=0 && image[newr][newc] == initialcolor && image[newr][newc] != color){
            dfs(ans, image, rowlength, collength, newr,newc,initialcolor, color);
        }
    }
    }
}