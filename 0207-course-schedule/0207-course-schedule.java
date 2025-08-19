class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {


        //create adjacescy matrix

        List<List<Integer>> adj = new ArrayList();

        //create indegree no of edges incoming

        int[] indegree = new int[numCourses];

        for(int i =0;i< numCourses;i++){
            adj.add(new ArrayList());


        }


        for(int[] preq : prerequisites){
            int course = preq[0];
            int prereq = preq[1];

            adj.get(prereq).add(course);
            indegree[course]++;


        }


        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<numCourses;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int current = q.poll();
            ans.add(current);

            for(int n :adj.get(current)){
                indegree[n]--;

                if(indegree[n] == 0){
                    q.offer(n);
                }
            }
        }



        return ans.size() == numCourses;
    }
}