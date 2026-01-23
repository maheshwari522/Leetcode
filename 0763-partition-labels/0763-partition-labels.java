class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] charmap = new int[26];
        List<Integer> res = new ArrayList<>();


        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            charmap[c-'a'] = i;


        }
        int start = 0;
        int end =0;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            end = Math.max(end, charmap[c-'a']);
            if(end == i){
                res.add(end-start+1);
                start = i+1;

            }
        }

        return res;
        
    }
}