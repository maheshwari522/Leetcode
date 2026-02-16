class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> ordermap = new HashMap<>();
        for(int i = 0;i<order.length();i++){
            char c = order.charAt(i);
            ordermap.put(c,i);
        }

        for(int i =0;i<words.length-1;i++){
            String firstword = words[i];
            String secondWord = words[i+1];
            if(isNotSorted(firstword,secondWord,ordermap)) return false;
        }

        return true;
        
    }

    private boolean isNotSorted(String first,  String second,Map<Character,Integer> ordermap ){
        for(int i = 0;i<first.length() && i<second.length();i++){
            if(first.charAt(i)!=second.charAt(i)){
                return ordermap.get(first.charAt(i))>ordermap.get(second.charAt(i));
            }
            
        }
        return first.length()>second.length();
    }
}