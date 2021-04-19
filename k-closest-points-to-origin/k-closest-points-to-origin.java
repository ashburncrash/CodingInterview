class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // storing the elem in longest distance order
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - (p1[0] * p1[0] + p1[1] * p1[1]));
        
        for(int[] point : points) {
            heap.add(point);
            if(heap.size() > k) {
                heap.remove();
            }
        }
        
        int[][] result = new int[k][2];
        
        while (k > 0) {
            k--;
            result[k] = heap.remove();
        }
        
        return result;
    }
}