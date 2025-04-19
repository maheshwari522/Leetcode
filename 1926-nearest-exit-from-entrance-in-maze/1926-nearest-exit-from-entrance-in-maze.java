class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        //bfs
        int n = maze.length;
        int m = maze[0].length;
        boolean visited[][] = new boolean[n][m];

        Queue <int[]> q = new LinkedList<>();
        q.offer(entrance);

        visited[entrance[0]][entrance[1]] = true;

        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        int steps = 0;
       
        while(!q.isEmpty()){
            steps++;

            int qs = q.size();

            for(int i = 0;i<qs;i++){
                int[] current = q.poll();

                for(int[] direction : directions){
                    int nextRow = current[0]+direction[0];
                    int nextCol = current[1]+direction[1];

                  if(nextRow >= 0 && nextCol>=0 && nextRow <n && nextCol < m && maze[nextRow][nextCol] == '.' && !visited[nextRow][nextCol]){
                    if(nextRow == 0 || nextCol == 0 |nextRow == n-1 || nextCol == m-1){
                        return steps;
                    }

                    visited[nextRow][nextCol] = true;
                    q.offer(new int[] {nextRow,nextCol});
                  }


                }
            }
        }



        return -1;

        
    }
}