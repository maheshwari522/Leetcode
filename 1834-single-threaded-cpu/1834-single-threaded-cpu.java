class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;
        int[] res= new int[n];

        for(int i = 0;i<n;i++){
            tasks[i] = new int[]{tasks[i][0],tasks[i][1],i};

        }        Arrays.sort(tasks,Comparator.comparingInt(t->t[0]));

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b)-> a[1]==b[1] ? Integer.compare(a[2],b[2]):Integer.compare(a[1],b[1]));

        int i = 0;
        long time = 0;
        int idx = 0;
        while(!minheap.isEmpty() || i < n){
            while(i<n && time>= tasks[i][0] ){
                minheap.offer(tasks[i]);
                i++;
            }

            if(minheap.isEmpty()){
                time = tasks[i][0];

            }else{
                int[] task = minheap.poll();
                time += task[1];
                res[idx++] = task[2];

            }

            

        }

        return res;
    }
}