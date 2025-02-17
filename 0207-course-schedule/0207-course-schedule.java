class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];

        for(int[] prereq : prerequisites){
           adj.get(prereq[1]).add(prereq[0]);
           
        }

        for(int i = 0;i<indegree.length;i++){
            for(int j : adj.get(i)){
                indegree[j]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();

            topo.add(node);

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }

       if(topo.size() == numCourses) return true;

       return false;


        
    }
}