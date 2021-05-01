class LRUCache {
    // linkedhashmap
    // treemap
    // linkedhashset
    
    private LinkedHashMap<Integer, Integer> cacheMap; // list (insertion order) + hashmap (key-value mapping)
    private int capacity; // random set

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if (cacheMap.containsKey(key)) {
            // retrieve the value
            int result = cacheMap.get(key);
            //remove the retrieved one
            cacheMap.remove(key);
            // put it back to the map
            cacheMap.put(key, result);
            return result;
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        } else if (cacheMap.size() == capacity){ // if size is full then remove the oldest (least used)
            // other ways to get the first element:
            // cacheMap.keySet().toArray()[0];
            cacheMap.remove(cacheMap.keySet().iterator().next());
        }  
            
        cacheMap.put(key, value);
    }
}

// other version
// class LRUCache {
    
//     int capacity; // random set

//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//     }
    
//     public int get(int key) {
        
//     }
    
//     public void put(int key, int value) {
        
//     }
// }