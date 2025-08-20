class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] prereq:prerequisites){
            int pre = prereq[0];
            int course = prereq[1];
            adj.get(pre).add(course);
            indegree[course]++;
        }

        int q = queries.length;

        List<Boolean> res = new ArrayList<>();
        for(int i = 0;i<q;i++){
            int u = queries[i][0];
            int v = queries[i][1];
            boolean[] visited = new boolean[numCourses];
            res.add(dfs(adj, u,v,visited));
        }
        

        return res;

    }
    public boolean dfs(List<List<Integer>> adj, int u,int v, boolean[] visited){
        visited[u] = true;
        if(u == v){
            return true;
        }

        boolean isReachable = false;

        for(int n:adj.get(u)){
            if(!visited[n])
            isReachable = isReachable || dfs(adj, n,v,visited);
        }

        return isReachable;

    }
}