class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int[] pre : prerequisites){
            int prereq = pre[1];
            int course = pre[0];
            map.putIfAbsent(prereq,new ArrayList<>());
            map.get(prereq).add(course);
            indegree[course]++;
        }

        int count=0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<numCourses;i++){
            if(indegree[i] == 0){
                q.offer(i);
                count++;
            }
        }

        if(q.isEmpty()) return false;
        if(count == numCourses) return true;

        while(!q.isEmpty()){
            int curr = q.poll();
            List<Integer> dependencies = map.get(curr);
            if(dependencies != null){
                for(int dependent : dependencies){
                    indegree[dependent]--;
                    if(indegree[dependent] == 0){
                        q.add(dependent);
                        count++;
                        if(count == numCourses) return true;
                    }
                }
            }
        }

        return false;


        
    }
}