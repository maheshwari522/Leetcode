class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


    HashSet<String> wordbank = new HashSet<>();

    for(String s: wordList){

        wordbank.add(s);

    } 

    Queue<Pair<String,Integer>> q = new LinkedList<>();
    int steps = 1;
    q.offer(new Pair(beginWord,1));
    
    wordbank.remove(beginWord);

    while(!q.isEmpty()){

        Pair<String,Integer> currentpoll = q.poll();
        String current = currentpoll.getKey();
        int currentsteps = currentpoll.getValue();

        
       
        if(current.equals(endWord) ){
            return currentsteps;
        }

        for(int j = 0;j<current.length();j++){
            for(char c = 'a' ; c <='z';c++){
                char[] currentWordArray = current.toCharArray();
                currentWordArray[j] = c;
                String newWord = new String(currentWordArray);
                if(wordbank.contains(newWord)){
                    System.out.println(newWord);
                    System.out.println(steps);
                    wordbank.remove(newWord);
                    q.offer(new Pair(newWord,currentsteps+1));
                    
                  
                  

                }
            }
        }

        
    }

    return 0;   
    }
}