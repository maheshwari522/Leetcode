class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()){
           mp.put(c,mp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> descheap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for( Map.Entry<Character,Integer> entry : mp.entrySet()){
            descheap.add(entry);
        }
        StringBuilder res = new StringBuilder();

        while(!descheap.isEmpty()){
            Map.Entry<Character,Integer> current = descheap.poll();

            char currentchar = current.getKey();
            int currentcharFreq = current.getValue();

            for(int i = 0 ; i< currentcharFreq;i++){
                res.append(currentchar);
            }

        }
        

        return res.toString();
        
    }
}