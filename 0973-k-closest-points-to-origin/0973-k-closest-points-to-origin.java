class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a->a[0]));

        for(int[] curr:points){
            int x1 = curr[0];
            int y1 = curr[1];
            int dist = (x1 * x1)+(y1*y1);
            minHeap.offer(new int[]{dist,x1,y1});
        }

        int[][] res = new int[k][2];
       

       for(int i = 0;i<k;i++){
        int[] point = minHeap.poll();
        res[i] = new int[]{point[1],point[2]};
       }

        return res;
        
    }
}