class Solution {
    public int findKthLargest(int[] nums, int k) {
        // approach 1: sort the array and find the kth largest - o(nlogn)
        // approach 2: use heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.remove();
            }
        }
        
        return heap.peek();
    }
}