class Solution {

    int rows =0;
    int cols = 0;

    public int islandPerimeter(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] == 1){
                    return  dfs(i,j,grid);
                }

            }
        }

        return 0;
        
    }

    public int dfs(int i,int j,int[][] grid){
        int peri = 0;

        if(i<0 || i>=rows ||j<0||j>=cols||grid[i][j] == 0){
            return 1;
        }

        if(grid[i][j] == -1){
            return 0;
        }
        grid[i][j] = -1;

        peri+=dfs(i+1,j,grid);
        peri+=dfs(i-1,j,grid);
        peri+=dfs(i,j+1,grid);
        peri+=dfs(i,j-1,grid);

        return peri;





    }
}