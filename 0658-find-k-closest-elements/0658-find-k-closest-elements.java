class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
           int diffA = Math.abs(a - x);
           int diffB = Math.abs(b - x);
           if (diffA != diffB) {
               return diffB - diffA;
           }
           return b - a;
        });
        List<Integer> res = new ArrayList<>();
    
        for(int j = 0;j<arr.length;j++){
           
            
            maxHeap.add(arr[j]);
            
            if(maxHeap.size()>k){
                maxHeap.poll();
            }

        }
        while(!maxHeap.isEmpty()){
            res.add(maxHeap.poll());
        }

         Collections.sort(res);

         return res;
        
    }
}