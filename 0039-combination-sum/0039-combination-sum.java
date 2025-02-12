class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> comb = new ArrayList<>();

        makecomb(0,ans,comb,0,target,candidates);


        return ans;



        
    }

    public void makecomb(int index,List<List<Integer>> ans,List<Integer> comb, int total,int target,int[] candidates){

        if(index == candidates.length && total == target){
            ans.add(new ArrayList<>(comb));
            return;
        }

        if(total>target ||index >= candidates.length){
            return;
        }

       

        comb.add(candidates[index]);
         makecomb(index,ans,comb,total+candidates[index],target,candidates);
         comb.remove(comb.size()-1);
         makecomb(index+1,ans,comb,total,target,candidates);


    }
}