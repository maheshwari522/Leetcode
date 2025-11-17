class Solution {
    private boolean search(int arr[], int n, int target){
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            if(search(matrix[i], m, target)){
                return true;
            }
        }
        return false;
    }
}