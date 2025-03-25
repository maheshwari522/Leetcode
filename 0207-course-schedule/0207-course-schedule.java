class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //adjacanecy matrix
        List<List<Integer>> adj = new ArrayList<>();
        //add elements
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        //indegree count array
        int[] indegree = new int[numCourses];
       //add elements to adjacency list
        for(int[] prereq : prerequisites){
           adj.get(prereq[1]).add(prereq[0]);
           
        }
        //idegree calculation
        for(int i = 0;i<indegree.length;i++){
            for(int j : adj.get(i)){
                indegree[j]++;
            }
        }

       ///topo sort code
        Queue<Integer> q = new LinkedList<>();
        // adding to q whose indewgree is 0
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        //topo list
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