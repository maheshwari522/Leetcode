class ListNode{
    int key;
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int key,int val){
        this.key = key;
        this.val =val;
        this.next = null;
        this.prev = null;

    }
}

class LRUCache {

    int capacity;
    HashMap<Integer,ListNode> mp;
    ListNode left;
    ListNode right;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        this.mp = new HashMap<>();
        this.left = new ListNode(0,0);
        this.right = new ListNode(0,0);
        this.left.next = right;
        this.right.prev = left;

    }

    public void remove(ListNode node){
        ListNode prev = node.prev;
        ListNode nxt = node.next;
        prev.next = nxt;
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
        if(mp.containsKey(key)){
            ListNode node = mp.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
        
    }

    
    public void put(int key, int value) {

        if(mp.containsKey(key)){
            remove(mp.get(key));
        }
        ListNode newNode = new ListNode(key,value);
        mp.put(key,newNode);
        insert(newNode);

        if(mp.size()>capacity){
            ListNode lru = left.next;
            remove(lru);
            mp.remove(lru.key);
        }
        
    }
}
