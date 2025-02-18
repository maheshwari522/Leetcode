class Solution {
    public int findCircleNum(int[][] isConnected) {

        int rowLength = isConnected.length;
       

        int[] visited = new int[rowLength];


        int count = 0;

        for(int i = 0; i< rowLength ; i++){
           
                if( visited[i] != 1){
                    count++;
                    dfs(isConnected,i,visited);
                }
            }

                 return count;
    }

   
    

    public void dfs(int[][] isConnected, int curr,  int[]visited){

        visited[curr] = 1;

        for(int j = 0; j < isConnected[curr].length; j++){
            if(isConnected[curr][j] == 1 && visited[j] !=1){
                dfs(isConnected,j,visited);
            }
        }


    }
}