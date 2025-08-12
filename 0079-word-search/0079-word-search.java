class Solution {
    int rows;
    int cols;
    public boolean exist(char[][] board, String word) {

        rows = board.length;
        cols = board[0].length;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }

        return false;
        
    }

    public boolean dfs(char[][] board, String word, int i,int j, int wordIndex){

        if(wordIndex == word.length()) return true;

        if(i>=rows|| i<0 || j>=cols||j<0|| board[i][j]!=word.charAt(wordIndex) || board[i][j] == '#'){
            return false;
        }
        char saved = board[i][j];

        board[i][j] = '#';
        boolean res = dfs(board,word,i+1,j,wordIndex+1)|| 
        dfs(board,word,i-1,j,wordIndex+1)||
        dfs(board,word,i,j+1,wordIndex+1)||
        dfs(board,word,i,j-1,wordIndex+1);

        board[i][j] = saved;

        return res;


    }
}