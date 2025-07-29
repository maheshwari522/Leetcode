class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>(k);

        for(int i = 0;i<k;i++){

            minheap.add(nums[i]);

        }

        for(int j = k;j<nums.length;j++){
            if(minheap.peek()<nums[j]){
                minheap.poll();
                minheap.add(nums[j]);
            }
        }

        return minheap.peek();

          
    }
}