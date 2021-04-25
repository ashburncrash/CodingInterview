class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return -1;
        
        // find the min elem in the rotated sorted array
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        int min = start;
        start = 0; end = nums.length - 1;
        
        // do binary search - o(logN)
        // check which boundaries that target fall into
        if (target >= nums[min] && target <= nums[end]) {
            start = min;
        } else {
            end = min;
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}