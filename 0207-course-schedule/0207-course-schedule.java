class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

      List<List<Integer>> adj = new ArrayList<>();

      int[] indegree = new int[numCourses];

      for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());

      }

      for(int[] prereq :prerequisites ){
        int course = prereq[0];
        int pre = prereq[1];
        adj.get(pre).add(course);
        indegree[course]++;
      }

      Queue<Integer> q = new LinkedList<>();
      for(int i =0;i<numCourses;i++){
        if(indegree[i] == 0){
            q.offer(i);
        }

      }

      List<Integer> res = new ArrayList<>();

      while(!q.isEmpty()){
        int current = q.poll();
        res.add(current);
        for(int n : adj.get(current)){
            indegree[n]--;
            if(indegree[n]==0){
                q.offer(n);
            }


        }

      }

      return res.size() == numCourses;





        
    }
}