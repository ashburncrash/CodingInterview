class Solution {
    public int maxSubArray(int[] nums) {
        // kadane's algorithm
        int localSum = nums[0];
        int globalMax = localSum;
        
        // we compare if adding next elem to the sum is bigger than
        // starting from the next elem
        // then we update the local sum and global max
        for (int i = 1; i < nums.length; i++) {
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalMax = Math.max(localSum, globalMax);
        }
        
        return globalMax;
    }
}