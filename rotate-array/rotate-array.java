class Solution {
    public void rotate(int[] nums, int k) {
        // approach 1: reverse
//         if (nums.length <= 1 || k < 1) return;
        
//         k = k % nums.length; // to prevent index out of bounds
        
//         // reverse the array
//         swap(0, nums.length - 1, nums);
        
//         // reverse back the elems from 0 - k-1 th
//         swap(0, k - 1, nums);
        
//         // reverse back the elems from k - nums.length - 1
//         swap(k, nums.length - 1, nums);
        
        // apporach 2: use new int array
        int[] result = new int[nums.length];
        
        // loop through the original
        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i + k) % nums.length; // for rotate left: (i + nums.length - k) % nums.length
            result[newIndex] = nums[i];
        }
        
        // copy the result to nums since func is void
        // nums = Arrays.copyOfRange(result, 0, result.length);
        for (int j = 0; j < result.length; j++) {
            nums[j] = result[j];
        }
    }
    
    private void swap(int start, int end, int[] nums){
        while (start < end) {
            // swap elems
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    
}