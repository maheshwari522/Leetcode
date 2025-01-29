class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        helper(1,k,n,current,ans);

        return ans;
        
    }

    public void helper(int start, int k, int n,List<Integer> current, List<List<Integer>> ans){

        if(current.size() == k){
            ans.add(new ArrayList<>(current));
            return;
        };
  for(int i=start;i<=n;i++){
        current.add(i);
       helper(i+1,k,n,current,ans);

       current.remove(current.size()-1);
  }

    }
}