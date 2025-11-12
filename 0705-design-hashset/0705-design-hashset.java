class MyHashSet {

    boolean[][] storage;
    int primary;
    int secondarybuckets;

    public MyHashSet() {
        this.primary = 1000;
        this.secondarybuckets = 1001;
        this.storage = new boolean[primary][];
        
    }

    private int hash1(int key){
        return key%primary;
    }
    private int hash2(int key){
        return key/secondarybuckets;
    }
    
    public void add(int key) {
        int primaryidx = hash1(key);
        int secondaryidx = hash2(key);
        if(storage[primaryidx] == null){
            storage[primaryidx] = new boolean[secondarybuckets];
        }
        storage[primaryidx][secondaryidx] = true;
    }
    
    public void remove(int key) {
        int primaryidx = hash1(key);
        int secondaryidx = hash2(key);
        if(storage[primaryidx] == null) {
            return;
        }
        if(storage[primaryidx][secondaryidx] == true){
            storage[primaryidx][secondaryidx] = false;
        }
        
    }
    
    public boolean contains(int key) {

        int primaryidx = hash1(key);
        int secondaryidx = hash2(key);
        if(storage[primaryidx] == null) {
            return false;
        }
        return storage[primaryidx][secondaryidx];
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */