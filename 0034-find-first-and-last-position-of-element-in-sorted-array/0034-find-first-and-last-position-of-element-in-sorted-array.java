class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] res = new int[] {-1,-1};
        if(nums.length == 0 ) return res;
        int n = nums.length;
        int left = 0;
        int right = n-1;
        
        int first = binarySearchfirst(nums,target,left,right);
        if( first != -1){
            int second = binarySearchLast(nums,target,first,right);
            res[0] = first;
            res[1] = second;
        }
        
        return res;
        
    }

    public int binarySearchfirst(int[] nums,int target, int l, int r){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                if(mid==0 || nums[mid] > nums[mid-1] ){
                    return mid;
                }else{
                    r = mid - 1;
                }
                
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l =mid+1;
            }
        }
        
        return -1;
    }

    public int binarySearchLast(int[] nums,int target, int l, int r){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                if(mid==(nums.length-1) || nums[mid] < nums[mid+1] ){
                    return mid;
                }else{
                    l= mid + 1;
                }

            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l =mid+1;
            }
        }

        return -1;
    }
    
        
    
}