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
        int index = 0;

        while(k>0){
            int [] closest = minHeap.poll();
            int[] point = new int[]{closest[1],closest[2]};
            res[index++] = point;
            k--; 
        }

        return res;
        
    }
}