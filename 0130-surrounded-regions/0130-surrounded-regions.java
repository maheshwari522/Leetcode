class Solution {
    public void solve(char[][] board) {

        int rowlength = board.length;
        int collength = board[0].length;

        int[][] visited = new int[rowlength][collength];

       // int[] dx = {-1,0,1,0};
       /// int[] dy = {0,1,0,-1};

    
        //first row
        for(int i = 0; i < rowlength; i++){
           dfs(i,0,board,visited);
           dfs(i,collength-1,board,visited);
        }

        for(int j = 0; j < collength; j++){
           dfs(0,j,board,visited);
           dfs(rowlength-1,j,board,visited);
        }

        for(int k=0;k<visited.length;k++){
            for(int r = 0; r< visited[0].length;r++){

                System.out.println(visited[k][r]);
                if(visited[k][r] !=1 ){
                    board[k][r] = 'X';
                }
            }
        }
    }


        


        public void dfs(int i,int j,char[][] board, int[][] visited){
            if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!='O' ||visited[i][j] == 1){
                return;
            }

            visited[i][j] = 1;

            dfs(i+1,j,board,visited);
            dfs(i-1,j,board,visited);
            dfs(i,j+1,board,visited);
            dfs(i,j-1,board,visited);

        }
        
    
}