class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList();

        List<Integer> sequence = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(0,ans,sequence,candidates,target);

        return ans;
        
    }


    public void backtrack(int startIndex, List<List<Integer>> ans, List<Integer> sequence, int[] candidates, int target){
        //base case
       
            if(target == 0){
                ans.add(new ArrayList<>(sequence));
                 return;
            }
           
        

            //start from current index and go ick non pick till the end of an array again increase the index and go from that index to end of an array and so on

            for(int i = startIndex;i<candidates.length;i++){

                if(candidates[i]>target) break;
                if(i>startIndex && candidates[i]==candidates[i-1])continue;
                //for the current index add arr[i] that is pick [i]
                sequence.add(candidates[i]);

                //recusion call for next index
                backtrack(i+1,ans,sequence,candidates,target-candidates[i]);

                //backtracking for current pick of next i with current index
                sequence.remove(sequence.size()-1);

            }



    }



}