class KthLargest {
    int k = Integer.MIN_VALUE;
    PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        
        for(int num : nums) {
            add(num);
        }
        
    }
    
//     ["KthLargest","add","add","add","add","add"]
// [[3,[2,4,5,8]],[3],[5],[10],[9],[4]]
    
//     [4,5,8]
    public int add(int val) {
        // check queue size
        if (queue.size() < k) {
            queue.add(val);
        } else if (queue.peek() < val) {
                queue.remove();
                queue.add(val);
            }
        // if min / first < val -> remove and add
        
        
        // return first 
        
//         int temp = k;
//         while (--temp > 0) { 
//             backQueue.add(queue.remove());
//         }
        
//         int tempResult = queue.peek();
        
//         queue.addAll(backQueue);
//         backQueue.clear();
        
//         return tempResult;
        return queue.peek();
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */