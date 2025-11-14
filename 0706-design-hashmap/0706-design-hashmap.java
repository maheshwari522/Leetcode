class ListNode {
    int key, val;
    ListNode next;
    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
    }
}

class MyHashMap {

    private ListNode[] storage;

    public MyHashMap() {
        storage = new ListNode[10000];

        
    }

    
    private ListNode find(ListNode head, int key){
        ListNode prev = null;
        ListNode current = head;

        while(current != null && current.key!=key){
            prev = current;
            current=current.next;
        }

        return prev;
    }

    private int hash(int key){
        return key%10000;
    }

   
    public void put(int key, int value) {

        int index = hash(key);
        if(storage[index] == null){
        storage[index] = new ListNode(-1,-1);
        }
        ListNode prev = find(storage[index],key);
        if(prev.next!=null){
            prev.next.val = value;
        }else{
            prev.next = new ListNode(key,value);
        }

    }
    
    public int get(int key) {
        int index = hash(key);
        if(storage[index] == null){
            storage[index] = new ListNode(-1,-1);
        }

        ListNode prev = find(storage[index],key);
        if(prev.next!=null){
            return prev.next.val;
        }
    return -1;

        
    }
    
    public void remove(int key) {
        
         int index = hash(key);
        if(storage[index] == null){
            return;
        }

        ListNode prev = find(storage[index],key);
        if(prev.next==null) return;
        
           prev.next =  prev.next.next;
           
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */