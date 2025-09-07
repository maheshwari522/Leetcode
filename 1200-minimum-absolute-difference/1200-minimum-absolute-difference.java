class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int mind = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] < mind){
                mind = arr[i+1]-arr[i];
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if((arr[i+1]-arr[i]) == mind){
                 res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
        
    }
}