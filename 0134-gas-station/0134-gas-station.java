class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = Arrays.stream(gas).sum();
        int totalcost = Arrays.stream(cost).sum();
        
        if(totalcost>totalgas) return -1;

        
     
        totalgas = 0;
        int res = 0;

        for(int i = 0;i<gas.length;i++){
            totalgas += gas[i]-cost[i];
            if(totalgas < 0) 
            {
                totalgas = 0;
                res = i+1;    
            }   
        }
        
        return res;
        
    }
}