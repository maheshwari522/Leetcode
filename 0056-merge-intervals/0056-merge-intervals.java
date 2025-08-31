class Solution {
    public int[][] merge(int[][] intervals) {

       List<int[]> res = new ArrayList<>();


       Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

       int[] current = intervals[0];


       for(int i = 0;i<intervals.length;i++ ){
        if(intervals[i][0]<=current[1]){
            current[1] = Math.max(intervals[i][1],current[1]);

        }else{
            res.add(current);
            current = intervals[i];

        }
       }

       res.add(current);

       return res.toArray(new int[res.size()][]);


        
    }
}