class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> set= new HashSet<>();

        for(int day : days){
            set.add(day);
        }

        int n = days.length;
        int lastday = days[n-1];
        int[] dp = new int[lastday+1]; //days till last day
        dp[0] = 0;

        for(int i=1;i<lastday+1;i++){
            if(!set.contains(i)){
                dp[i] = dp[i-1];
                continue;
            }
            int day1 = costs[0]+dp[Math.max(i-1,0)];
            int day7 = costs[1]+dp[Math.max(i-7,0)];
            int day30 = costs[2]+dp[Math.max(i-30,0)];
            dp[i] = Math.min(day1,Math.min(day7,day30));

        }

        return dp[lastday];


        
    }
}