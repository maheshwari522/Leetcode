class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for( char c : s.toCharArray()){
                count[c-'a']++;
            }
            String k = Arrays.toString(count);
            mp.putIfAbsent(k,new ArrayList<>());
            mp.get(k).add(s);
        }

        return new ArrayList<>(mp.values());
    }
}