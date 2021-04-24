class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1 || k < 1) return;
        
        k = k % nums.length;
        
        // reverse the array
        swap(0, nums.length - 1, nums);
        
        // reverse back the elems from 0 - k-1 th
        swap(0, k - 1, nums);
        
        // reverse back the elems from k - nums.length - 1
        swap(k, nums.length - 1, nums);
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