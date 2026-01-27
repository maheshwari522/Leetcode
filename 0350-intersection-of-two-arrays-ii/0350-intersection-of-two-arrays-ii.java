import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(m>n) return intersect(nums2,nums1);
        int low = 0;
        int high = n-1;

        for(int i = 0;i<m;i++){
            int target = nums1[i];
            int bsIdx = binarySearch(target,nums2,low,high);
            if(bsIdx !=-1){
                res.add(target);
                low = bsIdx+1;
            }
        }

        int[] result = new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }

        return result;
        
    }

    public int binarySearch(int target, int[] nums, int low,int high){
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid] == target){
              if(mid == low || nums[mid]!=nums[mid-1]){
                return mid;
              }else{
                high = mid-1;
              }

            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return -1;
    }
}