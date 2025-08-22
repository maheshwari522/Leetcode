class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int satisfied = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int left = 0;
        int right = 0;

        while(left < g.length && right< s.length){
            if(g[left]<=s[right]){
                satisfied++;
                left++;
            }
            right++;
        }

        return satisfied;
        
    }
}