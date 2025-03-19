class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        visit(visited,rooms,0);

        for(boolean s:visited){
            if(!s) return false;
        }
        return true;
        
    }

    public static void visit(boolean[] visited,List<List<Integer>> rooms, int i){
        for(int num:rooms.get(i)){
            if(!visited[num]){
                visited[num] = true;
                visit(visited,rooms,num);
            }
        }
    }
}