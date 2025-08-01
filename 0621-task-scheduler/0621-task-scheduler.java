class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for(char c:tasks){
            count[c - 'A']++;
        }

       int time = 0;

       PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0;i<26;i++){
            if(count[i]>0){
                q.add(count[i]);
            }
        }

        Queue<int[]> temptask = new LinkedList<>();

        while(!q.isEmpty()||!temptask.isEmpty()){
            time++;
            if(q.isEmpty()){
                 time = temptask.peek()[1];

            }else{
                int currentfreq = q.poll()-1;
                if(currentfreq>0){
                temptask.add(new int[]{currentfreq,time+n});
                }
            }

            if(!temptask.isEmpty() && temptask.peek()[1] == time){
                q.add(temptask.poll()[0]);
            }
        }

        return time;
        
    }
}