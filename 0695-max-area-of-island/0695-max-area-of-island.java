class Solution {
    int rows = 0;
    int cols = 0;
    public int maxAreaOfIsland(int[][] grid) {

        rows = grid.length;
        cols = grid[0].length;
        int area = 0;

        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(grid[i][j] == 1){
                    area = Math.max( startDFS(i,j,grid),area);
                }
            }
        }

        return area;
        
    }

    public int startDFS(int i ,int j,int[][] grid){
        if(i<0||i>=rows ||j<0||j>=cols || grid[i][j] == 0){
            return 0;
        }
        int count = 1;
        grid[i][j] = 0;

        count+=startDFS(i+1,j,grid);
        count+=startDFS(i-1,j,grid);
        count+=startDFS(i,j+1,grid);
        count+=startDFS(i,j-1,grid);

        return count;
        
    }
}