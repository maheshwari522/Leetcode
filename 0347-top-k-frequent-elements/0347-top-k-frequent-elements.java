class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minheap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());


        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            minheap.add(entry);
            if(minheap.size() > k){
                minheap.poll();
            }
        }

        int[] res = new int[k];

        for(int i =0;i<k;i++){

          res[i] = minheap.poll().getKey();



        }

        return res;

        
        
    }
}