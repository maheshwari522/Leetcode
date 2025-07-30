class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num:stones){
            heap.add(num);
        }

        while(heap.size() > 1){
            int a = heap.poll();
            int b = heap.poll();
            if(a-b > 0){
                heap.offer(a-b);
            }
        }

        if(heap.size() == 0) return 0;

        return heap.peek();
        
    }
}