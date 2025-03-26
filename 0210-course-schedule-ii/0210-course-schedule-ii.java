class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        //this is for storing neighbours in directed acyclic graph
        List<List<Integer>> adj =new ArrayList<>();

        for(int i = 0; i < numCourses;i++){
            adj.add(new ArrayList<>());
        }

        //indegree array to store number of nodes/edges incoming to the current node

        int[] indegree = new int[numCourses];
        
        for(int[] p : prerequisites){
            int course = p[0];
            int prereq= p[1];
            //indegree of course is increaded since there is a inwards edge coming
            indegree[course]++;
            //added to adjacency list of current course it's neighbour
            adj.get(prereq).add(course);
        }

        int topo[] = new int[numCourses];
        int index = 0;

        Queue<Integer> q = new LinkedList<>();

        for(int m =0;m< numCourses;m++){
            if(indegree[m] == 0){
                q.offer(m);
            }
        }

        while(!q.isEmpty()){
            int current = q.poll();
            topo[index++] = current;

            for(int i : adj.get(current)){
                indegree[i]--;
                if(indegree[i] == 0){
                    q.offer(i);
                }
            }


        }

        return index == numCourses ? topo : new int[0];
        
    }
}