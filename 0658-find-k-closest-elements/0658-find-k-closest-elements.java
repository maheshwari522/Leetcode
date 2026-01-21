class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
           int diffA = Math.abs(a - x);
           int diffB = Math.abs(b - x);
           if (diffA != diffB) {
               return diffB - diffA;
           }
           return a - b;
        });
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            int diff = arr[i]-x;
            
            maxHeap.add(arr[i]);
    
        }
        for(int j = k;j<arr.length;j++){
            int diff = arr[j]-x;
            if(Math.abs(maxHeap.peek()-x)>diff){
            maxHeap.add(arr[j]);
            }
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