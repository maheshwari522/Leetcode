class Solution {
    public int orangesRotting(int[][] grid) {

//for bfs declare a queue to add every orange that is rotten
        Queue<int[]> q =new LinkedList<>();

       

        int rowlength = grid.length;
        int collength = grid[0].length;


        int fresh = 0;
    
//check for 2 and add to the q and incease the fresh count if orange == 1;
        for(int i = 0;i<rowlength;i++){
            for(int j = 0 ; j<collength ; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                   
                    q.add(new int[]{i,j,0});
                }
            }
        }

      //direction for traversing

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int maxTime = 0;

        while(!q.isEmpty()){

           
                int[] current = q.poll();

                int row = current[0];
                int col = current[1];
                int time = current[2];

                //check the time

                maxTime = Math.max(time, maxTime);

                for(int i = 0; i< 4;i++){
                    int nextrow = row+dx[i];
                    int nextcol = col+dy[i];

                    if(nextrow>=0 && nextrow < rowlength && nextcol >=0 && nextcol < collength && grid[nextrow][nextcol]== 1){
                        grid[nextrow][nextcol] = 2;

                        fresh--;

                        q.add(new int[]{nextrow,nextcol,time+1});
                    }
                }




            




        }



        return fresh == 0? maxTime : -1;


        
    }

}