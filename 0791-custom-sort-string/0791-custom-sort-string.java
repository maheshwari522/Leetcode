class Solution {
    public String customSortString(String order, String s) {
        //frequency map
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<order.length();i++){
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
            int n = map.get(ch);
            for(int j = 0;j<n;j++){
                sb.append(ch);
            }
            }
            map.remove(ch);
        }
        for(char ch:map.keySet()){
            int n = map.get(ch);
            for(int i = 0;i<n;i++){
                sb.append(ch);
            }
        }
            

        

        return sb.toString();
        
    }
}