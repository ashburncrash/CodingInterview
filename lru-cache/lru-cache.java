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

// // other version - faster?
// class Node {
//     int key;
//     int value;
//     Node prev;
//     Node next;
    
//     public Node (){}
//     public Node(int key, int value) {
//         this.key = key;
//         this.value = value;
//     }
// }
// class LRUCache {
    
//     private int capacity;
//     // for doubly linked list
//     private Node head = new Node();
//     private Node tail = new Node();
    
//     private HashMap<Integer, Node> cacheMap;

//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//         cacheMap = new HashMap<>();
        
//         head.next = tail;
//         tail.prev = head;
//     }
    
//     public int get(int key) {
//         if (cacheMap.containsKey(key)) {
//             // remove from the map
//             Node result = cacheMap.remove(key);
//             // remove from the list
//             deleteNode(result);
//             // add it back to the map
//             cacheMap.put(key, result);
//             // add it back to the list
//             addNode(result);
            
//             return result.value;
//         }
        
//         return -1;
//     }
    
//     public void put(int key, int value) {
//         Node removed;
//         if (cacheMap.containsKey(key)) {
//             removed = cacheMap.remove(key);
//             deleteNode(removed);
//         } else if (cacheMap.size() == capacity) {
//             // removing from the tail
//             removed = cacheMap.remove(tail.prev.key);
//             deleteNode(removed);
//         }
//         cacheMap.put(key, new Node(key, value));
//         addNode(new Node(key, value));
//     }
    
//     private void deleteNode(Node node){
//         node.prev.next = node.next;
//         node.next.prev = node.prev;
//     }
    
//     private void addNode(Node node){ //add from head
//         node.next = head.next;
//         head.next.prev = node;
//         head.next = node;
//         node.prev = head;
//     }
// }