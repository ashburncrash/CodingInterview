class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // start filling up from the last index
        // m = number of elements in nums1
        // n = number of elements in nums2
        int lenNums1 = m - 1;
        int lenNums2 = n - 1;
        int lenTotal = m + n - 1;
        
        while (lenNums1 >= 0 && lenNums2 >= 0) {
            if (nums1[lenNums1] > nums2[lenNums2]) {
                nums1[lenTotal] = nums1[lenNums1];
                lenNums1--;
                lenTotal--;
            } else {
                nums1[lenTotal] = nums2[lenNums2];
                lenNums2--;
                lenTotal--;
            }
        }
        
        // for the remainers
        if (lenNums2 >= 0) {
            while (lenNums2 >= 0) {
                nums1[lenTotal] = nums2[lenNums2];
                lenNums2--;
                lenTotal--;
            }
            
        }
        
        if (lenNums1 >= 0) {
            while (lenNums1 >= 0) {
                nums1[lenTotal] = nums1[lenNums1];
                lenNums1--;
                lenTotal--;
            }
        }
    }
}