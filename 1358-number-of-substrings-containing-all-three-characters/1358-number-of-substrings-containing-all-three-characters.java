class Solution {
    public int numberOfSubstrings(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int count =0;
        int totalcount = 0;

        int hash[] = new int[256];

        hash['a']++;
        hash['b']++;
        hash['c']++;

        for(int right=0;right<s.length();right++){

            if(hash[s.charAt(right)]>0){
                count++;
            }

            hash[s.charAt(right)]--;

            while(count == 3){

                totalcount = totalcount+s.length()-right;
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    count--;
                }
                left++;

            }
            
        }


return totalcount;

        
    }
}