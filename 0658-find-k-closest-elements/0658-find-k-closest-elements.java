class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left = 0;
        int right = arr.length-1;

        while(left<right && right-left >= k){
            int j = Math.abs(arr[left] - x);
            int l = Math.abs(arr[right]-x);
            if((j<l || (j == l && arr[left]<arr[right]))){
                right--;
            }else{
                left++;

            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i = left;i<=right;i++){
            res.add(arr[i]);
        }
        return res;
        
    }
}