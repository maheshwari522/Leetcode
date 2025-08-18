class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> deadendset = new HashSet<>();

        for(String s: deadends){
            deadendset.add(s);
        }

        Queue<char[]> q = new LinkedList<>();

        String initial = "0000";
       if(deadendset.contains(initial)) return -1;

        q.offer(initial.toCharArray());
        deadendset.add(initial);
        int minSteps = 0;

        while(!q.isEmpty()){
            

            int n = q.size();


            for(int i = 0;i<n;i++){
            char[] current = q.poll();
            String curr = new String(current);
            if(curr.equals(target)){return minSteps;}
            
            for(int j=0;j<4;j++){
                char increase = current[j] == '9' ? '0' : (char) (current[j]+1);
                char[] newincrease = current.clone();
                newincrease[j] = increase;
                String up = new String(newincrease);
                if(!deadendset.contains(up)){
                    q.offer(newincrease);
                    deadendset.add(up);
                }
                char decrease =  current[j] == '0'? '9' : (char) (current[j] -1);
                char[] newdecrease = current.clone();
               
                newdecrease[j] = decrease;
                 String down = new String(newdecrease);
                if(!deadendset.contains(down)){
                    q.offer(newdecrease);
                     deadendset.add(down);
                }

            }
            }
            minSteps++;

        }

        return -1;
        
    }
}