
class Solution {
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        
        for(int i =0;i<score.length;i++){
            
            pq.add(new Pair<>(i, score[i]));
        }
        int rank = 1;

        String[] res = new String[score.length];

        while(!pq.isEmpty()){
            Pair<Integer,Integer> current = pq.poll();

            int currrentIndex = current.getKey();
            if(rank == 1){
                res[currrentIndex] = "Gold Medal";
            } else if(rank == 2){
                res[currrentIndex] = "Silver Medal";
            } else if(rank == 3){
                res[currrentIndex] = "Bronze Medal";
            }else{
                res[currrentIndex] = String.valueOf(rank);
            }
            rank++;
         }
         return res;
    }
}