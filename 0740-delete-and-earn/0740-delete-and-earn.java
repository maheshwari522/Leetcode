class Solution {
    public int deleteAndEarn(int[] nums) {

        int max= Integer.MIN_VALUE;
        for(int k : nums){
            max = Math.max(max,k);
        }

        int[] arr = new int[max+1];
        for(int i : nums){
            arr[i] += i;
        }
        int prev = arr[0];
        int current = arr[1];

        for(int i = 2;i<arr.length;i++){
            int temp = current;
            current = Math.max(current,arr[i] + prev);
            prev = temp;
        }

        return current;

        
    }

    // public int helper(int[] arr, int index){
    //     if(index>=arr.length){
    //         return 0;
    //     }
    //     int choose = arr[index] + helper(arr,index+2);
    //     int notchoose = helper(arr,index+1);
    //     return Math.max(choose,notchoose);

    // }
}