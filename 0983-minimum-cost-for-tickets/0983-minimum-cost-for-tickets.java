class Solution {
    public int solve(int[] days, int[] costs, int n, int i){
        if(i>=n) return 0;
        //1 day
        int cost1 = costs[0]+solve(days,costs,n,i+1);
        //7 day

        int maxday7 = days[i]+7;
        int j = i;
        while(j<n&&days[j]<maxday7){
            j++;
        }
        int cost7 = costs[1]+solve(days,costs,n,j);

        //30 day
        j = i;
        int maxday30 = days[i]+30;
        
        while(j<n&&days[j]<maxday30){
            j++;
        }
        int cost30 = costs[2]+solve(days,costs,n,j);

        return Math.min(cost1,Math.min(cost7,cost30));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        return solve(days,costs,n,0);
    }
}