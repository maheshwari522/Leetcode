class ListNode{
    int key;
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;   
    }
}

class LRUCache {
    int capacity;
    Map<Integer,ListNode> map;
    ListNode left;
    ListNode right;
    
     public LRUCache(int capacity) {

        this.capacity = capacity;
        this.map = new HashMap<>();
        this.left = new ListNode(0,0);
        this.right = new ListNode(0,0);
        this.left.next = right;
        this.right.prev = left;       
    }

    public void remove(ListNode node){
        ListNode prev = node.prev;
        ListNode next = node.next;
        prev.next = next;
        prev.next.prev = prev;

    }

    public void insert(ListNode node){
        ListNode prev = right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = right;
        right.prev = node;

    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            remove(node);
            insert(node);
            return node.val;


        }
        return -1;
      
        
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            remove(map.get(key));
        }
        ListNode newnode =new ListNode(key,value);
        map.put(key,newnode);
        insert(newnode);

        if(map.size()>capacity){
            ListNode lru = left.next;
            remove(lru);
            map.remove(lru.key);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */