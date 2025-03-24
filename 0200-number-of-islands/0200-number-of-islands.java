class Solution {
    public int numIslands(char[][] grid) {

        //using dfs because one iland will be traveled to it's depth

        // checking all 4 directions

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0;i< rows;i++){
            for(int j = 0;j<cols ;j++){
                if(grid[i][j] == '1' && visited[i][j] != true){
                    
                    
                    startDFS(grid,visited,i,j,rows,cols);
                    count++;
                }
            }
        }

    return count;
        
        
    }

    public void startDFS(char[][] grid,boolean[][] visited,int i,int j,int rows, int cols){
            
            if(i<0 || i>= rows || j<0 || j>=cols ||  visited[i][j] == true) return;
           
            if(grid[i][j] == '1'){
            visited[i][j] = true;
            startDFS(grid,visited,i+1,j,rows,cols);
            startDFS(grid,visited,i-1,j,rows,cols);
            startDFS(grid,visited,i,j+1,rows,cols);
            startDFS(grid,visited,i,j-1,rows,cols);
            }

            
            
        }
}