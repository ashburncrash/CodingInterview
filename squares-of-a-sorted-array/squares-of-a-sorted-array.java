class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0 || nums == null) return null;
        
//         // since nums is sorted, if first (0th) elem is 0 or positive,
//         // we can just loop through the elem and square them.
//         if (nums[0] >= 0) {
//             for (int i = 0; i < nums.length; i++) {
//                 nums[i] = i * i;
//             }
            
//             return nums;
//         }
        
        // otherwise, we'll compare and put the squared elems to a new array
        int[] result = new int[nums.length];
        // pointers to loop through the nums array
        int left = 0;
        int right = nums.length - 1;
        
        // loop through the result array
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = nums[right] * nums[right];
                right--;
            } else {
                result[i] = (int) Math.pow(nums[left], 2);
                left++;
            }
        }
        
        return result;
        
    }
}