class KthLargest {
    // int k = Integer.MIN_VALUE;
    // PriorityQueue<Integer> queue;

//     public KthLargest(int k, int[] nums) {
//         this.k = k;
//         queue = new PriorityQueue<>();
        
//         for(int num : nums) {
//             add(num);
//         }
        
//     }
    
//     public int add(int val) {
//         // check queue size
//         if (queue.size() < k) {
//             queue.add(val);
//         } else if (queue.peek() < val) {
//                 queue.remove();
//                 queue.add(val);
//             }

//         return queue.peek();
//     }
     private static int k;
    private PriorityQueue<Integer> heap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        
        for (int num: nums) {
            heap.offer(num);
        }
        
        while (heap.size() > k) {
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }

        return heap.peek();
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */