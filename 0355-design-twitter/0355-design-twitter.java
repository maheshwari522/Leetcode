class Twitter {
    int timeStamp;
    private Map<Integer,Set<Integer>> userMap;
    private Map<Integer,List<int[]>> tweetmap;

    public Twitter() {
        timeStamp = 0;
        userMap = new HashMap<>();
        tweetmap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {

        timeStamp++;
        tweetmap.putIfAbsent(userId,new ArrayList<>());
        tweetmap.get(userId).add(new int[]{timeStamp,tweetId});
        
        
    }
        public List<Integer> getNewsFeed(int userId) {

        List<int[]> newsFeed = new ArrayList<>(tweetmap.getOrDefault(userId,new ArrayList<>()));

        for(int followeeId : userMap.getOrDefault(userId,new HashSet<>())){

            newsFeed.addAll(tweetmap.getOrDefault(followeeId,new ArrayList<>()));

            

        }

        newsFeed.sort((a,b) -> b[0] - a[0]);

        List<Integer> res = new ArrayList<>();

        for(int i = 0;i<Math.min(10,newsFeed.size());i++){
            res.add(newsFeed.get(i)[1]);
        }

        return res;



        
        
    }
    
    public void follow(int followerId, int followeeId) {

        userMap.putIfAbsent(followerId, new HashSet<>());
        userMap.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {

        Set<Integer> folowees = userMap.get(followerId);
        if(folowees!=null){
        folowees.remove(followeeId);
        }


        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */