class Solution {
    public boolean wordPattern(String pattern, String s) {


        String[] input = s.split(" ");
        if(input.length != pattern.length()) return false;

        HashMap<Character,String> mp = new HashMap<>();

        for(int i = 0;i<input.length;i++){
            char c = pattern.charAt(i);
            String str = input[i];

            if(mp.containsKey(c)){
                if(!mp.get(c).equals(str)){
                    return false;
                }
            }else{
                if(mp.containsValue(str)) return false;
                mp.put(c,str);
            }
        }

        return true;
        
    }
}